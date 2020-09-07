package com.TNyun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author jingwen
 * @Date 2020/8/6 14:30
 * (ﾉꐦ ๑´Д`๑)ﾉ彡┻━┻  I have to type the code again   (▼皿▼#)
 **/
@Controller
@RequestMapping(value = "")
public class foreController {

    @RequestMapping("login")
    public String fore_login(){
        return "login";
    }

    @RequestMapping("frontPage")
    public String fore6(){
        return "../../frontPage";
    }

    @RequestMapping("back")
    public String fore1(){
        return "admin/back";
    }

    @RequestMapping("charts")
    public String admin1(){
        return "admin/charts";
    }

    @RequestMapping("tables")
    public String admin2(){
        return "admin/tables";
    }

    @RequestMapping("applyForSIAdmin")
    public String admin3(){ return "customer/applyForSIAdmin"; }


    /*@RequestMapping("SIApplylist")
    public String admin4(){ return "admin/SIApplylist"; }
*/
    @RequestMapping("SIAdminlist")
    public String admin5(){ return "admin/SIAdminlist"; }

    @RequestMapping("adminlist")
    public String admin6(){ return "admin/adminlist"; }


    //用户注册成功界面
    @RequestMapping("activateSuccess")
    public String customer1(){ return "customer/activateSuccess"; }

    @RequestMapping("Pay")
    public String customer2(){ return "customer/Pay"; }

    //用户购买服务的界面
    @RequestMapping("buySubsystem")
    public String customer3(){ return "customer/buySubsystem"; }

}
