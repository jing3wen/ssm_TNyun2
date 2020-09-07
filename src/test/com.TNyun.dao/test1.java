package com.TNyun.dao;

import com.TNyun.entity.customer;
import com.TNyun.entity.serviceorder;
import com.TNyun.entity.siapply;
import com.TNyun.service.customerService;
import com.TNyun.service.serviceorderService;
import com.TNyun.utils.SendMail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.mail.MessagingException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;


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
    /*
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
    }*/

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
        String phone="12366477890";


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
        //serviceOrderService.addService(ser);
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

        List<serviceorder> serviceList= serviceOrderService.findall();
        for(int i=0;i<serviceList.size();i++)
            System.out.println(serviceList.get(i).ser_print());
    }

    @Autowired
    SendMail SendMail;

    @Test
    public void testMail() throws IOException, MessagingException {

        System.out.println( SendMail.sendmail("1584591284@qq.com","jing文"));
    }

    @Test
    public  void  testActivate(){

        System.out.println(customerService.activateCustomerByPhone("12345678901"));
    }

    @Autowired
    customerMapper customerMapper;
    @Autowired
    com.TNyun.service.SI_adminService SI_adminService;

    //模拟一个普通用户申请成为开发商
    /*
     * 前端传过来的数据
     * si_phone:13432234512 (jing文)
     * si_introduction:test模拟一个普通用户申请成为开发商
     * */
    @Test
    public void testSIApply(){

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String rent_time = formatter.format(calendar.getTime());
        siapply sa=new siapply();
        sa.setSi_agree(rent_time);
        //根据前端传过来的电话查找改用户所有信息
        customer cus=customerMapper.findCustomerByPhone("13432234512");
        System.out.println(cus.cus_print());
        sa.setSi_name(cus.getName());
        sa.setSi_password(cus.getPassword());
        sa.setSi_phone(cus.getPhone());
        sa.setSi_email(cus.getEmail());
        sa.setSi_introduction("test模拟一个普通用户申请成为开发商");
        sa.setSi_agree("0");
        System.out.println(SI_adminService.applyForSiadmin(sa));

    }
}

