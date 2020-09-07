package com.TNyun.service;


import com.TNyun.entity.SI_admin;
import com.TNyun.entity.admin;
import com.TNyun.entity.serviceorder;

import java.util.List;

/**
 * Created by kyq on 2020/8/8 22:57
 */
public interface adminService {

    public admin login(int id, String psword);

    public int logout(int id);

    public List<serviceorder> Select_all_service();

    public String SetSI_Apply1(String si_phone, String si_email,String si_name,String si_password);//将状态置1——同意

    public void SetSI_Apply0(String si_phone, String si_email);//将状态置2——拒绝

    int statistic_people_online();

    void deleteadminByid(int a_id);

    public List<admin> Select_all_admin();

    String Update_a_name(admin admin);

    String Update_a_phone(admin admin);

    String Update_a_email(admin admin);

}
