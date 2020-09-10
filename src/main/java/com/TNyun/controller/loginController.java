package com.TNyun.controller;

import com.TNyun.dao.SI_adminMapper;
import com.TNyun.dao.adminMapper;
import com.TNyun.dao.customerMapper;
import com.TNyun.entity.SI_admin;
import com.TNyun.entity.admin;
import com.TNyun.entity.customer;
import com.TNyun.service.SI_adminService;
import com.TNyun.service.adminService;
import com.TNyun.service.customerService;
import java.io.IOException;
import java.util.Map;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("login")
public class loginController
{
    @Autowired
    private customerService customerService;
    @Autowired
    private customerMapper customerMapper;

    //用户退出操作。
    @RequestMapping(value = "/customerloginout")
    @ResponseBody
    public String customerlogout(HttpSession session){
        session.removeAttribute("customer");
        System.out.println("loginout is ok");
        return "loginout is ok";
    }


    //用户登入接口。
    @RequestMapping(value = "/customerlogin_post",method = RequestMethod.POST)
    @ResponseBody
    public String customerlogin(HttpServletRequest request, HttpServletResponse response,@RequestBody customer cus){

        HttpSession session = request.getSession();
        String result=customerService.login2(cus.getPhone(),cus.getPassword());
        if (result=="customer login is ok") {
            // 设置session的有效期为30分钟
            String sessionId = session.getId();
            //System.out.println("sessionID: "+sessionId);
            Cookie cookie = new Cookie("JSESSIONID", sessionId);
            cookie.setMaxAge(60 * 30);
            cookie.setPath(request.getContextPath());
            response.addCookie(cookie);
            customer cus2=customerMapper.findCustomerByPhone(cus.getPhone());
            session.setAttribute("customer", cus2);//登录成功后存入用户的登录状态，key是用户对象的String形式,value是用户对象

            if(session.getAttribute("customer") != null){
                System.out.println("session succeed");
            }

        }

        return result;
    }



    @Autowired
    private adminService adminService;
    @Autowired
    private adminMapper adminMapper;

    @Autowired
    private SI_adminService SI_adminService;

    @Autowired
    private SI_adminMapper SI_adminMapper;
    //管理员退出操作。
    @RequestMapping(value = "/adminloginout")
    @ResponseBody
    public String adminlogout(HttpSession session){
        System.out.println("收到adminloginout:");
        session.removeAttribute("SI_admin");
        session.removeAttribute("admin");
        return "adminloginout is ok";
    }

    //管理员退出操作。
    @RequestMapping(value = "/si_adminloginout")
    @ResponseBody
    public String si_adminlogout(HttpSession session){
        session.removeAttribute("SI_admin");
        return "si_adminloginout is ok";
    }


    @RequestMapping(value = "/adminlogin_post",method = RequestMethod.POST)
    @ResponseBody
    public String adminlogin(HttpSession session, @RequestBody Map<String,Object> map)
    {
        String phone=map.get("phone").toString();
        String password=map.get("password").toString();
        System.out.println("收到adminlogin_post,phone:"+phone+",password:"+password);
        //首先判断该用户是否为SI_admin
        String si_login_result=SI_adminService.si_login(phone,password);
        if (si_login_result!="the user is not here"){
            System.out.println("该用户为SI_admin,查询结果："+si_login_result);
            if (si_login_result=="user login is ok"){
                SI_admin si2=SI_adminMapper.findSI_AdminByphone(phone);
                session.setAttribute("SI_admin",si2);
            }
            return si_login_result;
        }
        else {
            //不是SI_admin,再判断该用户是否为admin
            String adm_login_result=adminService.login(phone,password);
            if (adm_login_result!="the user is not here") {
                System.out.println("该用户为admin,查询结果："+adm_login_result);
                if(adm_login_result=="user login is ok"){
                    admin adm2=adminMapper.findAdminByPhone(phone);
                    session.setAttribute("admin", adm2);//登录成功后存入用户的登录状态，key是用户对象的String形式,value是用户对象
                    if(session.getAttribute("admin") != null){
                        System.out.println("admin session succeed");
                    }
                }
                return adm_login_result;
            }
            else {
                System.out.println("该用户不存在");
                return adm_login_result;
            }

        }


    }


}

