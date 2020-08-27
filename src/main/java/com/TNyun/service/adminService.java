package com.TNyun.service;


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

    public serviceorder AgreeExperience(serviceorder serviceOrder);

    public serviceorder AgreePurchase(serviceorder serviceOrder);

    public serviceorder Overdue(serviceorder serviceOrder);

}
