package com.TNyun.controller;

import com.TNyun.entity.customer;
import com.TNyun.service.customerService;
import java.io.IOException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value ="/customer")
public class loginController

{

    @Autowired
    private customerService customerService;


    //用户退出操作。
    @RequestMapping(value ="/customerloginout_post")
    public void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Content-type", "text/html;charset=UTF-8");
        HttpSession session = request.getSession(false);
        if (session == null) {
            // 没登录，重定向到首页
            String url = response.encodeRedirectURL(request.getContextPath() + "/login.jsp");
            response.sendRedirect(url);
            System.out.println("系统重定向页面1："+url);
            return;
        }

        // 从session中移除登录状态
        session.removeAttribute("customer");
        // 重定向到首页，URL重写方式
        String url = response.encodeRedirectURL(request.getContextPath() + "/login.jsp");
        response.sendRedirect(url);
        System.out.println("系统重定向页面2："+url);

    }





    //用户登入接口。
    @RequestMapping(value ="/customerlogin_post")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response, @RequestBody customer cust)
    {

        ModelAndView modelAndView = new ModelAndView();
        HttpSession session = request.getSession();


        String result=customerService.login2(cust.getPhone(),cust.getPassword());
        if (result=="customer login is ok") {
            // 设置session的有效期为30分钟
            String sessionId = session.getId();
            Cookie cookie = new Cookie("JSESSIONID", sessionId);
            cookie.setMaxAge(60 * 30);
            cookie.setPath(request.getContextPath());
            response.addCookie(cookie);
            session.setAttribute("customer", cust);//登录成功后存入用户的登录状态，key是用户对象的String形式,value是用户对象

            //返回系统主页
            modelAndView.setViewName("frontPage");
        }
        else {
            modelAndView.addObject("error", "用户不存在");
            modelAndView.setViewName("redirect:customer/customerlogin_post");
        }
        return modelAndView;
    }



}

