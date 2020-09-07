package com.TNyun.dao;

import com.TNyun.entity.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SI_adminMapper {

    SI_admin findMaxId();//在SI_admin中找id的最大值
    
    SI_admin findSI_AdminByphone(String  si_phone);//名字查找SI用户密码


    void set_SI_status1(String  si_phone);//将状态置1（登录时使用）

    void set_SI_status0(String si_phone);//将状态置0（登出时使用）

    void deleteSI_adminByPhone(String si_phone);//根绝phone删除用户


    void addSI_admin(SI_admin sia);//添加新的SI_admin

    SI_admin findSI_adminbyphone(String si_phone);//通过电话查找SI_admin

}
