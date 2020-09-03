package com.TNyun.controller;

import com.TNyun.entity.serviceorder;
import com.TNyun.entity.customer;
import com.TNyun.service.serviceorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Author jingwen
 * @Date 2020/8/9 22:43
 * (ﾉꐦ ๑´Д`๑)ﾉ彡┻━┻  I have to type the code again   (▼皿▼#)
 **/
@Controller
@RequestMapping("/serviceorder")
public class serviceorderController {

    @Autowired
    private serviceorderService serviceOrderService;

    @RequestMapping(value = "/addService_post",method = RequestMethod.POST)
    @ResponseBody
    public String addService_post(@RequestBody serviceorder sys_ser1){
        System.out.println("\n收到addService_post：");
        SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//设置日期格式
        String time=df.format(new Date());// new Date()为获取当前系统时间
        serviceorder sys_ser2=new serviceorder();
        sys_ser2.setTime(time);
        sys_ser2.setC_id(sys_ser1.getC_id());
        sys_ser2.setC_name(sys_ser1.getC_name());
        sys_ser2.setS_id(sys_ser1.getS_id());
        sys_ser2.setS_name(sys_ser1.getS_name());
        sys_ser2.setAgree("1");
        String result= serviceOrderService.addService(sys_ser2);
        return result;
    }

    @RequestMapping(value = "/deleteService_post",method = RequestMethod.POST)
    @ResponseBody
    public String deleteService_post(@RequestBody serviceorder sys_ser1){
        System.out.println("\n收到deleteService_post：");
        String result= serviceOrderService.deleteService(sys_ser1.getC_id(),sys_ser1.getS_id());
        return result;
    }



    @RequestMapping(value = "/findallService_post",method = RequestMethod.POST)
    @ResponseBody
    public List<serviceorder> findallService_post(@RequestBody customer cus){

        System.out.println("\n收到findallService_post：");
        List<serviceorder> servicelist= serviceOrderService.findallByC_id(cus.getId());
        return servicelist;
    }




}
