package com.TNyun.controller;

import com.TNyun.entity.customer;
import com.TNyun.service.SI_adminService;
import com.TNyun.service.customerService;
import com.mysql.cj.xdevapi.JsonArray;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import com.TNyun.utils.SendMail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

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
    @Autowired
    private SI_adminService SI_adminService;

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
                " http://49.235.51.187:8082/customer/activateCustomer?phone=" + cus.getPhone()
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
        return "customer/activateSuccess";
    }



    @RequestMapping(value = "/current_customer_post",method = RequestMethod.POST)
    @ResponseBody
    public customer send_cur_customer(){
        System.out.println("收到current_customer_post：");
        System.out.println("当前登陆用户是: "+cur_customer.cus_print());
        return cur_customer;
    }


    @RequestMapping(value = "/customerlist",method = RequestMethod.POST)
    @ResponseBody
    public JSONArray get_customer(){
        System.out.println("收到customerlist：");
        List<customer> cus=new ArrayList<>();
        cus=SI_adminService.Select_all_customer();
        customer[] cust=new customer[cus.size()];
        for ( int q = 0; q < cust.length; q++) {
            cust[q] = new customer();
        }
        int j=0;
        JSONObject resultJson=new JSONObject(); //JSONObject是对象形式

        JSONArray jsonArray=new JSONArray();    //JSONArray是数组形式
        for (int i=0;i<cus.size();i++) {
            JSONObject lan=new JSONObject();
            lan.put("id",cus.get(i).getId());
            lan.put("name",cus.get(i).getId());
            lan.put("phone",cus.get(i).getPhone());
            lan.put("email",cus.get(i).getEmail());
            lan.put("status",cus.get(i).getStatus());
            jsonArray.add(lan);
        }

        return jsonArray;
    }


}
