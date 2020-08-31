package com.TNyun.service.impl;

import com.TNyun.entity.SI_admin;
import com.TNyun.entity.customer;
import com.TNyun.entity.serviceorder;
import com.TNyun.service.SI_adminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SI_adminServiceimpl implements SI_adminService{

    @Autowired
    private com.TNyun.dao.SI_adminMapper SI_adminMapper;

    @Override
    public String  si_login(String  si_phone, String si_password) {
        SI_admin sia=SI_adminMapper.findSI_AdminByphone(si_phone);
        if (sia!=null&&sia.getSI_password().equals(si_password)&&sia.getSI_status().equals("0")){
            System.out.println("the current SI_admin is: "+sia.toString()+ "login is ok");
            sia.setSI_status("1");
            SI_adminMapper.set_SI_status1(sia.getSI_phone());
            return "SI_admin login is ok";
        }
        else if (sia!=null&&sia.getSI_password().equals(si_password)&&sia.getSI_status().equals("1")){
            return "the SI_dmin has logined";
        }
        else if(sia!=null&& !(sia.getSI_password().equals(si_password)) ){
            return "the password is error";
        }
        else return "the SI_admin is not here";

    }

    @Override
    public int si_logout(String  si_phone) {
        SI_admin sia=SI_adminMapper.findSI_AdminByphone(si_phone);
        if(sia!=null && sia.getSI_status().equals("1")) {
            System.out.println("要登出的用户: "+sia.toString());
            SI_adminMapper.set_SI_status0(si_phone);
            return 1;
        }else {
            System.out.println("未登录");
            return 0;
        }
    }

    @Override
    public List<customer> Select_all_customer() {
        return SI_adminMapper.Select_all_customer();
    }

    @Override
    public serviceorder AgreeExperience(int c_id,int s_id) {
        SI_adminMapper.SetAgree1(c_id,s_id);
        return null;
    }

    @Override
    public serviceorder AgreePurchase(int c_id,int s_id) {
        SI_adminMapper.SetAgree2(c_id,s_id);
        return null;
    }

    @Override
    public serviceorder Overdue(int c_id,int s_id) {
        SI_adminMapper.SetAgree3(c_id,s_id);
        return null;
    }
}
