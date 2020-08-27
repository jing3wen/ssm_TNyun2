package com.TNyun.service.impl;

import com.TNyun.dao.adminMapper;
import com.TNyun.entity.admin;
import com.TNyun.entity.serviceorder;
import com.TNyun.service.adminService;
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
        return null;
    }

    @Override
    public serviceorder AgreeExperience(serviceorder serviceOrder) {
        return null;
    }

    @Override
    public serviceorder AgreePurchase(serviceorder serviceOrder) {
        return null;
    }

    @Override
    public serviceorder Overdue(serviceorder serviceOrder) {
        return null;
    }
}
