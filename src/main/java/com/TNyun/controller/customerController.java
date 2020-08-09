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

    //定义一个静态变量来保存当前登陆用户
    public static customer cur_customer=new customer();

    @RequestMapping(value = "/register_post",method= RequestMethod.POST)
    @ResponseBody
    public String register(@RequestBody customer cus){
        System.out.println("收到register_post: ");
        String result = customerService.register(cus);
        System.out.println("返回: "+result);
        return result;
    }

    @RequestMapping(value = "/customerlogin_post",method = RequestMethod.POST)
    @ResponseBody
    public String customerlogin(@RequestBody customer cus){
        System.out.println("收到customerlogin_post: "+cus.cus_print());
        String result=customerService.login2(cus.getPhone(),cus.getPassword());
        //此处加条件是未来防止线程冲突
        if(result=="customer login is ok") cur_customer=customerService.findCustomerByPhone(cus.getPhone());
        System.out.println("result: "+result);
        return result;
    }

    @RequestMapping(value = "/customerloginout_post",method = RequestMethod.POST)
    @ResponseBody
    public String customerloginout(@RequestBody customer cus){
        System.out.println("收到customerloginout_post: "+cus.cus_print());
        int result=customerService.logout(cus.getId());
        cur_customer=new customer();
        return cus.cus_print()+" login out is ok";
    }


    @RequestMapping(value = "/current_customer_post",method = RequestMethod.POST)
    @ResponseBody
    public customer send_cur_customer(){
        System.out.println("收到current_customer_post：");
        System.out.println("当前登陆用户是: "+cur_customer.cus_print());
        return cur_customer;
    }


}
