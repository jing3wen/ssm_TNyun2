package com.TNyun.service.impl;

import com.TNyun.dao.adminMapper;
import com.TNyun.entity.Admin;
import com.TNyun.entity.Sys_Service;
import com.TNyun.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kyq on 2020/8/8 22:57
 */

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private adminMapper adminMapper;

    @Override
    public Admin login(int id, String psword) {
        Admin admin=new Admin();
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
        Admin admin=adminMapper.findAdminById(id);
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
    public List<Sys_Service> Select_all_service() {
        return null;
    }

    @Override
    public Sys_Service AgreeExperience(Sys_Service sys_service) {
        return null;
    }

    @Override
    public Sys_Service AgreePurchase(Sys_Service sys_service) {
        return null;
    }

    @Override
    public Sys_Service Overdue(Sys_Service sys_service) {
        return null;
    }
}
