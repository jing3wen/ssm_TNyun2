package com.TNyun.service;

import com.TNyun.entity.*;

import java.util.List;

public interface SI_adminService {

    //普通用户申请成为服务开发商
    public String applyForSiadmin(siapply sa);

    public String  si_login(String  si_phone, String si_password);

    public int si_logout(String  si_phone);

    public List<customer> Select_all_customer();

    public serviceorder AgreeExperience(int c_id,int s_id);

    public serviceorder AgreePurchase(int c_id,int s_id);

    public serviceorder Overdue(int c_id,int s_id);

    void Delete_customer_by_id(int id);

    String Update_s_name(customer customer);

    String Update_s_phone(customer customer);

    String Update_s_email(customer customer);

    List<serviceorder> findalls();

    List<SI_admin> findallSI();

    void Delete_SI_by_id(int si_id);

    String Update_name(SI_admin SI_admin);

    String Update_phone(SI_admin SI_admin);

    String Update_email(SI_admin SI_admin);


}
