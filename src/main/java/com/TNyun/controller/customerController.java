package com.TNyun.controller;

import com.TNyun.entity.customer;
import com.TNyun.service.customerService;
import com.TNyun.utils.SendMail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.mail.MessagingException;
import java.io.IOException;
import java.util.Random;

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

    //用@autowired注入JavaMailSender后，表示整个类交给了spring管理（类上加@Component ），在其他地方调用的时候，也应该从spring容器中获取，而不能用new去实例化
    @Autowired
    SendMail SendMail;

    //定义一个静态变量来保存当前登陆用户
    public static customer cur_customer=new customer();

    //注册用户，默认状态status为0，给用户发送邮件
    @RequestMapping(value = "/register_post",method= RequestMethod.POST)
    @ResponseBody
    public String register(@RequestBody customer cus) throws IOException, MessagingException {
        System.out.println("收到register_post: "+cus.cus_print());
        String result = customerService.register(cus);
        String context="亲爱的 "+cus.getName()+"用户，请点击以下链接来激活您的账户:\n" +
                " http://localhost:8082/customer/activateCustomer?phone=" + cus.getPhone()
                +"\n 若非您本人操作，请警惕！";
        System.out.println(SendMail.sendmail(cus.getEmail(),context));
        System.out.println("返回: "+result);
        return result;
    }

    //邮箱激活
    @RequestMapping("/activateCustomer")
    public String activateCustomerByPhone(String phone){
        System.out.println("收到activateCustomer: ");
        System.out.println(customerService.activateCustomerByPhone(phone));
        return "activateCustomer is ok";
    }



    @RequestMapping(value = "/customerlogin_post",method = RequestMethod.POST)
    @ResponseBody
    public String customerlogin(@RequestBody customer cus){
        System.out.println("收到customerlogin_post: "+cus.cus_print());
        String result=customerService.login2(cus.getPhone(),cus.getPassword());
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
