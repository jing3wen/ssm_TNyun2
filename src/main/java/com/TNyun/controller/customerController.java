package com.TNyun.controller;

import com.TNyun.entity.customer;
import com.TNyun.service.customerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Method;

/**
 * @Author jingwen
 * @Date 2020/8/8 18:02
 * (ﾉꐦ ๑´Д`๑)ﾉ彡┻━┻  I have to type the code again   (▼皿▼#)
 **/
@Controller
@RequestMapping(value = "/customer")
public class customerController {

    @Autowired
    private customerService customerService;

    @RequestMapping(value = "/register_post",method= RequestMethod.POST)
    @ResponseBody
    public String register(@RequestBody customer cus){
        System.out.println("收到register_post: ");
        String result = customerService.register(cus);
        System.out.println("返回: "+result);
        return result;
    }
}
