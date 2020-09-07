package com.TNyun.controller;

import com.TNyun.entity.SI_admin;
import com.TNyun.entity.admin;
import com.TNyun.util.Page;
import com.TNyun.util.Retureninfo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "/adminlist")
public class adminlistController {
    @Autowired
    private com.TNyun.service.adminService adminService;

    @RequestMapping("/adminlist")
    public ModelAndView list(Model model, Page page){
        PageHelper.offsetPage(page.getStart(),page.getCount());
        List<admin> adminlist=adminService.Select_all_admin();
        int total=(int) new PageInfo<>(adminlist).getTotal();
        page.setTotal(total);

        model.addAttribute("adminlist",adminlist );
        //model.addAttribute("totals",total);
        ModelAndView modelAndView=new ModelAndView("admin/adminlist");
        return modelAndView;
    }
    @RequestMapping("/del_admin")
    public ModelAndView del_admin(int a_id){
        adminService.deleteadminByid(a_id);
        ModelAndView modelAndView=new ModelAndView("redirect:adminlist")   ;
        return modelAndView;
    }

    @RequestMapping(value = "update_a_name",method = RequestMethod.POST)
    public String update_s_introduction(@RequestBody admin admin, HttpServletRequest servletRequest){

        System.out.println("收到update_a_name"+admin.toString());
        String result;
        Retureninfo retureninfo=new Retureninfo();
        try {
            result=adminService.Update_a_name(admin);
            System.out.println("返回："+result);
            if(result.equals("update name successfully")) {
                retureninfo.setCode(1);
                retureninfo.setMsg(result);
                //servletRequest.setAttribute("result","插入成功");
            }else {
                retureninfo.setCode(0);
                retureninfo.setMsg(result);
                //servletRequest.setAttribute("result",null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        JSONObject jsonObject=new JSONObject();
        jsonObject=JSONObject.fromObject(retureninfo);
        return jsonObject.toString();
    }

    @RequestMapping(value = "update_a_phone",method = RequestMethod.POST)
    public String update_s_price(@RequestBody admin admin, HttpServletRequest servletRequest){

        System.out.println("收到update_a_phone"+admin.toString());
        String result;
        Retureninfo retureninfo=new Retureninfo();
        try {
            result=adminService.Update_a_phone(admin);
            System.out.println("返回："+result);
            if(result.equals("update phone successfully")) {
                retureninfo.setCode(1);
                retureninfo.setMsg(result);
                //servletRequest.setAttribute("result","插入成功");
            }else {
                retureninfo.setCode(0);
                retureninfo.setMsg(result);
                //servletRequest.setAttribute("result",null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        JSONObject jsonObject=new JSONObject();
        jsonObject=JSONObject.fromObject(retureninfo);
        return jsonObject.toString();
    }
    @RequestMapping(value = "update_a_email",method = RequestMethod.POST)
    public String update_s_website1(@RequestBody admin admin, HttpServletRequest servletRequest){

        System.out.println("收到update_a_email"+admin.toString());
        String result;
        Retureninfo retureninfo=new Retureninfo();
        try {
            result=adminService.Update_a_email(admin );
            System.out.println("返回："+result);
            if(result.equals("update email successfully")) {
                retureninfo.setCode(1);
                retureninfo.setMsg(result);
                //servletRequest.setAttribute("result","插入成功");
            }else {
                retureninfo.setCode(0);
                retureninfo.setMsg(result);
                //servletRequest.setAttribute("result",null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        JSONObject jsonObject=new JSONObject();
        jsonObject=JSONObject.fromObject(retureninfo);
        return jsonObject.toString();
    }

}
