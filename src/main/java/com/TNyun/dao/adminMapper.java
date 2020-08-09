package com.TNyun.dao;

import com.TNyun.entity.Admin;
import com.TNyun.entity.customer;

import java.util.List;

public interface adminMapper {

    //void addadmin(customer cus);//注册

    Admin findAdminById(int a_id);//通过id查找

    void set_a_status1(int id);//将状态置1（登录时使用）

    void set_a_status0(int id);//将状态置0（登出时使用）

    public List<Admin> Select_all();

    Admin findCustomerByPhone(String phone);
}
