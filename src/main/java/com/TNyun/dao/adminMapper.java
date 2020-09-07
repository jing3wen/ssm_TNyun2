package com.TNyun.dao;


import com.TNyun.entity.SI_admin;
import com.TNyun.entity.admin;
import com.TNyun.entity.customer;
import com.TNyun.entity.serviceorder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface adminMapper {

    //void addadmin(customer cus);//注册

    admin findAdminById(int a_id);//通过id查找

    void set_a_status1(int a_id);//将状态置1（登录时使用）

    void set_a_status0(int a_id);//将状态置0（登出时使用）

    void deleteadminByid(int a_id);//通过id删除admin

    public List<admin> Select_all_admin();//查找所有的admin

    void Update_a_name(admin admin);//更新admin的name

    void Update_a_phone(admin admin);//更新admin的phone

    void Update_a_email(admin admin);//更新admin的email

}
