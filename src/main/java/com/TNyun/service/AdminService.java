package com.TNyun.service;

import com.TNyun.entity.Admin;
import com.TNyun.entity.Sys_Service;

import java.util.List;

/**
 * Created by kyq on 2020/8/8 22:57
 */
public interface AdminService {

    public Admin login(int id,String psword);


    public int logout(int id);

    public List<Sys_Service> Select_all_service();

    public Sys_Service AgreeExperience(Sys_Service sys_service);

    public Sys_Service AgreePurchase(Sys_Service sys_service);

    public Sys_Service Overdue(Sys_Service sys_service);

}
