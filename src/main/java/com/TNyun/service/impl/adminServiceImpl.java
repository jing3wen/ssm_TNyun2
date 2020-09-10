package com.TNyun.service.impl;

import com.TNyun.dao.*;
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

    @Autowired
    private serviceorderMapper serviceorderMapper;

    @Autowired
    private SI_applyMapper SI_applyMapper;

    @Autowired
    private SI_adminMapper SI_adminMapper;

    @Autowired
    private customerMapper customerMapper;

    @Override
    public String login(String a_phone, String a_password) {
        admin adm=adminMapper.findAdminByPhone(a_phone);
        if (adm!=null&&adm.getA_password().equals(a_password)){
            if(adm.getA_status().equals("1")){
                System.out.println("the current user is: "+adm.toString()+ "login is ok");
                return "user login is ok";
            }
            else return "the user don't be activated";

        }
        else if(adm!=null&& !(adm.getA_password().equals(a_password)) ){
            return "the password is error";
        }
        else return "the user is not here";
    }

    @Override
    public int logout(int id) {
        admin admin=adminMapper.findAdminById(id);
        System.out.println(admin.toString());
        if(admin!=null && admin.getA_status().equals("1")) {
            //adminMapper.set_a_status0(id);
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
        return serviceorderMapper.Select_all_service();
    }

    @Override
    public String SetSI_Apply1( String si_phone, String si_email,  String si_name, String si_password) {

        SI_applyMapper.SetSI_Apply1(si_phone,si_email,si_name,si_password);

        if (SI_adminMapper.findSI_adminbyphone(si_phone)!=null){
            return "the SI_admin has been exit";
        } else {
            SI_admin  sia=new SI_admin();
            SI_admin sid=SI_adminMapper.findMaxId();
            sia.setSI_id(sid.getSI_id() + 1);
            sia.setSI_name(si_name);
            sia.setSI_email(si_email);
            sia.setSI_password(si_password);
            sia.setSI_phone(si_phone);
            if (sia.getSI_status() == null) sia.setSI_status("0");
            System.out.println("新添加的SI开发商是: " + sia.toString());
            SI_adminMapper.addSI_admin(sia);
            return "register is ok";
        }



    }

    @Override
    public void SetSI_Apply0(String si_phone, String si_email) {

        SI_applyMapper.SetSI_Apply0(si_phone,si_email);
        System.out.println("delete SI_Apply");

    }

    @Override
    public int statistic_people_online() {
        return customerMapper.statistic_people_online();
    }

    @Override
    public void deleteadminByid(int a_id) {
        adminMapper.deleteadminByid(a_id);
    }

     @Override
    public List<admin> Select_all_admin(){
        return  adminMapper.Select_all_admin();
     }

    @Override
    public String Update_a_name(admin admin) {
        adminMapper.Update_a_name(admin);
        admin subsystem1=new admin();
        subsystem1=adminMapper.findAdminById(admin.getA_id());
        if(subsystem1.getA_name().equals(admin.getA_name())){
            System.out.println(subsystem1.toString());
            return "update name successfully";
        }else {
            return "update name error";
        }
    }

    @Override
    public String Update_a_phone(admin admin)  {
        adminMapper.Update_a_phone(admin);
        admin subsystem1=new admin();
        subsystem1=adminMapper.findAdminById(admin.getA_id());
        if(subsystem1.getA_phone().equals(admin.getA_phone())){
            System.out.println(subsystem1.toString());
            return "update phone successfully";
        }else {
            return "update phone error";
        }
    }
    @Override
    public String Update_a_email(admin admin) {
        adminMapper.Update_a_email(admin);
        admin subsystem1=new admin();
        subsystem1=adminMapper.findAdminById(admin.getA_id());
        if(subsystem1.getA_email().equals(admin.getA_email())){
            System.out.println(subsystem1.toString());
            return "update email successfully";
        }else {
            return "update email error";
        }
    }
}
