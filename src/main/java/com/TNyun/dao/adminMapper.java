package com.TNyun.dao;

import com.TNyun.entity.Admin;
import com.TNyun.entity.Sys_Service;
import com.TNyun.entity.customer;

import java.util.List;

public interface adminMapper {

    //void addadmin(customer cus);//注册

    Admin findAdminById(int a_id);//通过id查找

    void set_a_status1(int a_id);//将状态置1（登录时使用）

    void set_a_status0(int a_id);//将状态置0（登出时使用）

    public List<Sys_Service> Select_all_service();//查找所有服务

    Sys_Service findServiceByDoubleId(String phone);//通过双id查找服务

    Sys_Service SetAgree1(int c_id,int s_id);//将状态置1——体验

    Sys_Service SetAgree2(int c_id,int s_id);//将状态置2——购买

    Sys_Service SetAgree3(int c_id,int s_id);//将状态置3——过期

}
