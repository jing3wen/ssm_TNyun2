package com.TNyun.dao;

import com.TNyun.entity.SI_admin;
import com.TNyun.entity.customer;
import com.TNyun.entity.serviceorder;
import com.TNyun.entity.siapply;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SI_adminMapper {

    siapply findSI_applybyphone(String phone);//手机号查找是否已经是si_admin

    siapply findMaxId();//查找最大ID

    void addsiapply(siapply sa);//将申请成为si_admin的用户信息放入si_apply表

    SI_admin findSI_AdminByphone(String  si_phone);//名字查找SI用户密码

    void set_SI_status1(String  si_phone);//将状态置1（登录时使用）

    void set_SI_status0(String si_phone);//将状态置0（登出时使用）

    public List<customer> Select_all_customer();//找到所有用户

    void SetAgree1(@Param("c_id")int c_id,@Param("s_id") int s_id);//将状态置1——体验

    void SetAgree2(@Param("c_id")int c_id, @Param("s_id")int s_id);//将状态置2——购买

    void SetAgree3(@Param("c_id")int c_id, @Param("s_id")int s_id);//将状态置3——过期
    

}
