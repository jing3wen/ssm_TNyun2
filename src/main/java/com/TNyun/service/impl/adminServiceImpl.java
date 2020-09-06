package com.TNyun.service.impl;

import com.TNyun.dao.adminMapper;
import com.TNyun.entity.SI_admin;
import com.TNyun.entity.admin;
import com.TNyun.entity.customer;
import com.TNyun.entity.serviceorder;
import com.TNyun.service.adminService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kyq on 2020/8/8 22:57
 */

@Service
public class adminServiceImpl implements adminService {

    @Autowired
    private adminMapper adminMapper;

    @Override
    public admin login(int id, String psword) {
        admin admin=new admin();
        admin=adminMapper.findAdminById(id);
        if(admin!=null && admin.getA_password().equals(psword)) {
            adminMapper.set_a_status1(id);
            admin.setA_status("1");
            System.out.println(admin.toString());
            System.out.println("find success");
            return admin;
        }else {
            System.out.println("find fail");
            return null;
        }
    }

    @Override
    public int logout(int id) {
        admin admin=adminMapper.findAdminById(id);
        System.out.println(admin.toString());
        if(admin!=null && admin.getA_status().equals("1")) {
            adminMapper.set_a_status0(id);
            System.out.println("可以登出");
        }else {
            System.out.println("未登录");
            return 2;
        }

        admin=adminMapper.findAdminById(id);
        System.out.println(admin.toString());
        System.out.println(admin.getA_status());
        if(admin!=null && admin.getA_status().equals("0")) {
            System.out.println("serviceimpl logout success");
            return 1;
        }else {
            System.out.println("serviceimpl logout fail");
            return 0;
        }
    }

    @Override
    public List<serviceorder> Select_all_service() {
        return adminMapper.Select_all_service();
    }

    @Override
    public String SetSI_Apply1( String si_phone, String si_email,  String si_name, String si_password) {

        adminMapper.SetSI_Apply1(si_phone,si_email,si_name,si_password);

        if (adminMapper.findSI_adminbyphone(si_phone)!=null){
            return "the SI_admin has been exit";
        } else {
            SI_admin  sia=new SI_admin();
            SI_admin sid=adminMapper.findMaxId();
            sia.setSI_id(sid.getSI_id() + 1);
            sia.setSI_name(si_name);
            sia.setSI_email(si_email);
            sia.setSI_password(si_password);
            sia.setSI_phone(si_phone);
            if (sia.getSI_status() == null) sia.setSI_status("0");
            System.out.println("新添加的SI开发商是: " + sia.toString());
            adminMapper.addSI_admin(sia);
            return "register is ok";
        }



    }

    @Override
    public void SetSI_Apply0(String si_phone, String si_email) {

        adminMapper.SetSI_Apply0(si_phone,si_email);
        System.out.println("delete SI_Apply");

    }

    @Override
    public int statistic_people_online() {
        return adminMapper.statistic_people_online();
    }

    @Override
    public void deleteadminByid(int a_id) {
        adminMapper.deleteadminByid(a_id);
    }
     @Override
    public List<admin> Select_all_admin(){
        return  adminMapper.Select_all_admin();
     }
}
