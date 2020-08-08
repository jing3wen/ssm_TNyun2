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

    @RequestMapping("back")
    public String fore1(){
        return "back";
    }

    @RequestMapping("charts")
    public String fore2(){
        return "charts";
    }

    @RequestMapping("Customerlist")
    public String fore3(){
        return "Customerlist";
    }

    @RequestMapping("Projectlist")
    public String fore4(){
        return "Projectlist";
    }

    @RequestMapping("tables")
    public String fore5(){
        return "tables";
    }
}
