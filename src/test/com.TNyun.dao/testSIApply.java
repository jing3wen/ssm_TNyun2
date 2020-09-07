package com.TNyun.dao;

import com.TNyun.entity.customer;
import com.TNyun.entity.siapply;
import com.TNyun.service.SI_adminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @Author jingwen
 * @Date 2020/9/6 21:05
 * (ﾉꐦ ๑´Д`๑)ﾉ彡┻━┻  I have to type the code again   (▼皿▼#)
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class testSIApply {

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
    public void testAddSIApply(){

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String rent_time = formatter.format(calendar.getTime());
        siapply sa=new siapply();
        sa.setTime(rent_time);
        //根据前端传过来的电话查找改用户所有信息
        customer cus=customerMapper.findCustomerByPhone("13432234512");
        System.out.println(cus.cus_print());
        sa.setSi_name(cus.getName());
        sa.setSi_password(cus.getPassword());
        sa.setSi_phone(cus.getPhone());
        sa.setSi_email(cus.getEmail());
        sa.setSi_type("SI_admin");
        sa.setSi_introduction("test模拟一个普通用户申请成为开发商");
        sa.setSi_agree("0");
        System.out.println(SI_adminService.applyForSiadmin(sa));

    }
}
