package com.TNyun.dao;

import com.TNyun.entity.*;
import com.TNyun.service.SI_adminService;
import com.TNyun.service.impl.adminServiceImpl;
import com.TNyun.service.impl.SI_adminServiceimpl;
import com.TNyun.service.adminService;
import com.TNyun.dao.*;
import org.apache.ibatis.annotations.Param;
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
public class xue {
    @Autowired
    private SI_adminService SI_adminService;
    @Autowired
    private adminService adminService;

    @Test
    public void login(){
      String  phone="13343236754";
      String  password="1001";

      String res=SI_adminService.si_login(phone,password);
            System.out.println(res);
    }


    @Test
   public  void setapply1(){
        String s1="15345672345";
        String s2="1003@.com";
        String s3="jiaji";
        String s4="1003";
        adminService.SetSI_Apply1(s1,s2,s3,s4);
   }

   @Test
   public  void setapply0(){
       String s1="15345672345";
       String s2="1003@.com";
       adminService.SetSI_Apply0(s1,s2);
   }

   @Test
    public void setagree3(){
        int c_id=123458;
        int s_id=3;
        SI_adminService.Overdue(c_id,s_id);
   }

    @Test
    public void Simulation_select_customer() throws Exception {
        List<customer> cuslist=new ArrayList<>();
        cuslist=SI_adminService.Select_all_customer();
        for (int i=0;i<cuslist.size();i++)
            System.out.println(cuslist.get(i).cus_print());

    }
}
