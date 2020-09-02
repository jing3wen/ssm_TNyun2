package com.TNyun.service;

import com.TNyun.entity.SI_admin;
import com.TNyun.entity.customer;
import com.TNyun.entity.serviceorder;

import java.util.List;

public interface SI_adminService {

    //申请成为服务开发商
    public String applyForSiadmin(customer cust);

    public String  si_login(String  si_phone, String si_password);

    public int si_logout(String  si_phone);

    public List<customer> Select_all_customer();

    public serviceorder AgreeExperience(int c_id,int s_id);

    public serviceorder AgreePurchase(int c_id,int s_id);

    public serviceorder Overdue(int c_id,int s_id);

}
