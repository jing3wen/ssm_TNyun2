package com.TNyun.dao;

import com.TNyun.entity.customer;
import com.TNyun.service.customerService;
import org.junit.Test;
import org.junit.jupiter.api.DynamicTest;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class test1 {

    @Autowired
    private customerService customerService;
    @Test
    public void Simulation_register(){

        customer cus1=new customer();
        cus1.setId(111111);
        cus1.setName("张三");
        cus1.setPassword("123456");
        cus1.setPhone("17130130130");
        System.out.println(cus1.cus_print());
        System.out.println(customerService.register(cus1));

    }


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

    @Test
    public void Simulation_login2(){
        customer cus2=new customer();
        int id=111111;
        String phone="17130130130";
        String psword="123456";

        cus2=customerService.login2(phone,psword);
        if(cus2!=null){
            System.out.println(cus2.cus_print()+"登录成功");
        }else {
            System.out.println("try again");
        }
    }

    @Test
    public void Simulation_logout(){
        customer cus3=new customer();
        int id=111111;
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
}
