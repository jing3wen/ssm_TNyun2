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
    public String fore2(){
        return "admin/charts";
    }

    @RequestMapping("Customerlist")
    public String fore3(){
        return "admin/Customerlist";
    }

    @RequestMapping("Projectlist")
    public String fore4(){
        return "admin/Projectlist";
    }

    @RequestMapping("tables")
    public String fore5(){
        return "admin/tables";
    }

}
