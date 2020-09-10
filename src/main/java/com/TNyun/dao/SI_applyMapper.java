package com.TNyun.dao;

import com.TNyun.entity.siapply;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author jingwen
 * @Date 2020/9/7 0:08
 * (ﾉꐦ ๑´Д`๑)ﾉ彡┻━┻  I have to type the code again   (▼皿▼#)
 **/
public interface SI_applyMapper {

    public siapply findSI_applyByphone(String phone);//手机号查找是否已经投了申请si_admin

    void addsiapply(siapply sa);//将申请成为si_admin的用户信息放入si_apply表

    void SetSI_Apply1(@Param("si_phone")String si_phone, @Param("si_email")String si_email, @Param("si_name")String si_name, @Param("si_password")String si_password);//将状态置1——同意

    void SetSI_Apply0(@Param("si_phone")String si_phone, @Param("si_email")String si_email);//将状态置2——拒绝

    List<siapply> Select_all_siapply();//查找全部siapply

    void SetApply1(String si_phone);
}
