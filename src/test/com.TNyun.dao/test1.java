package com.TNyun.dao;

import com.TNyun.entity.customer;
import com.TNyun.entity.serviceorder;
import com.TNyun.service.customerService;
import com.TNyun.service.serviceorderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class test1 {

    @Autowired
    private customerService customerService;
    @Autowired
    private serviceorderService serviceOrderService;

    @Test
    public void Simulation_register(){

        customer cus1=new customer();
        cus1.setName("阿巴瑟");
        cus1.setPassword("abas");
        cus1.setPhone("1901199789");
        //System.out.println(cus1.cus_print());
        System.out.println(customerService.register(cus1));

    }

    @Test
    public void Simulation_delete(){

        customer cus1=new customer();
        cus1.setName("阿巴瑟");
        cus1.setPassword("abas");
        cus1.setPhone("1901199789");
        //System.out.println(cus1.cus_print());
        System.out.println(customerService.deletecustomer(cus1));

    }


    /*
    @Test
    public void Simulation_login(){
        customer cus2=new customer();
        int id=111111;
        String name="张三";
        String psword="123456";

        cus2=customerService.login(id,psword);
        if(cus2!=null){
            System.out.println(cus2.cus_print()+"登录成功");
        }else {
            System.out.println("try again");
        }
    }
*/
    @Test
    public void Simulation_login2(){
        customer cus2=new customer();
        int id=111111;
        String phone="13432456679";
        String psword="nuowa123";

        String result=customerService.login2(phone,psword);
        System.out.println(result);
    }

    @Test
    public void Simulation_logout(){
        customer cus3=new customer();
        int id=123458;
        String name="张三";
        String psword="123456";

        int temp=customerService.logout(id);
        if(temp==1){
            System.out.println(name+"登出成功");
        }else {
            System.out.println("try again");
        }
    }

    @Test
    public void Simulation_select_all() throws Exception {
        List<customer> cuslist=new ArrayList<>();
        cuslist=customerService.Select_all();
        for (int i=0;i<cuslist.size();i++)
            System.out.println(cuslist.get(i).cus_print());

    }

    @Test
    public void findCustomerByPhone(){
        customer cus4=new customer();
        String phone="17130130130";


        cus4=customerService.findCustomerByPhone(phone);
        if(cus4!=null){
            System.out.println(cus4.cus_print()+"查找成功");
        }else {
            System.out.println("try again");
        }
    }

    @Test
    public void testbuyservice(){
        serviceorder ser=new serviceorder();
        SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//设置日期格式
        String time=df.format(new Date());// new Date()为获取当前系统时间
        ser.setTime(time);
        ser.setC_id(123458);
        ser.setC_name("诺娃");
        ser.setS_id(4);
        ser.setS_name("SI管理系统");
        ser.setRent_time("3days");
        ser.setAgree("1");
        serviceOrderService.addService(ser);
    }

    @Test
    public void testfindallByC_id(){
        serviceorder ser=new serviceorder();
        SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//设置日期格式
        String time=df.format(new Date());// new Date()为获取当前系统时间
        ser.setTime(time);
        ser.setC_id(123458);
        ser.setC_name("诺娃");
        ser.setS_id(4);
        ser.setS_name("云体验销售中心");
        ser.setAgree("1");

        List<serviceorder> serviceList= serviceOrderService.findallByC_id(123458);
        for(int i=0;i<serviceList.size();i++)
            System.out.println(serviceList.get(i).ser_print());
    }
}

