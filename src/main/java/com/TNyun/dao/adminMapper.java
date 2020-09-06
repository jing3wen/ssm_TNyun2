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

    public List<serviceorder> Select_all_service();//查找所有服务

    serviceorder findServiceByDoubleId(String phone);//通过双id查找服务

    void SetSI_Apply1(@Param("si_phone")String si_phone, @Param("si_email")String si_email, @Param("si_name")String si_name, @Param("si_password")String si_password);//将状态置1——同意

    void SetSI_Apply0(@Param("si_phone")String si_phone, @Param("si_email")String si_email);//将状态置2——拒绝

    SI_admin findMaxId();//找si_id的最大值

    void addSI_admin(SI_admin sia);//添加新的SI_admin

    SI_admin findSI_adminbyphone(String si_phone);//通过电话查找SI_admin

    void deleteadminByid(int a_id);

    int statistic_people_online();
    public List<admin> Select_all_admin();

}
