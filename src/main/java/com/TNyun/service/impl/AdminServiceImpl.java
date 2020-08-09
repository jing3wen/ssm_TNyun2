package com.TNyun.service.impl;

import com.TNyun.dao.adminMapper;
import com.TNyun.entity.Admin;
import com.TNyun.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
