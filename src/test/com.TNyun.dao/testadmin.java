package com.TNyun.dao;

import com.TNyun.entity.admin;
import com.TNyun.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by kyq on 2020/8/8 22:49
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class testadmin {

    @Autowired
    private com.TNyun.service.adminService adminService;
    @Test
    public void statistics(){
        int total=adminService.statistic_people_online();
        System.out.println(total);

    }

    @Test
    /*
    * 测试构建
    * */
    public void test_A(){
        admin admin=new admin();
        admin.setA_id(1234);
        admin.setA_name("李四");
        admin.setA_phone("17130130222");
        admin.setA_password("123456a");
        admin.setA_status("0");

        System.out.println(admin.toString());
    }



}
