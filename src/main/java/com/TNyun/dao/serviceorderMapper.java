package com.TNyun.dao;

import com.TNyun.entity.serviceorder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author jingwen
 * @Date 2020/8/9 15:42
 * (ﾉꐦ ๑´Д`๑)ﾉ彡┻━┻  I have to type the code again   (▼皿▼#)
 **/
public interface serviceorderMapper {

    void addservice(serviceorder ser);

    void deleteOneByC_idAndS_id(int c_id,int s_id);

    List<serviceorder> findall();

    void SetAgree1(@Param("c_id")int c_id, @Param("s_id") int s_id);//将状态置1——体验

    void SetAgree2(@Param("c_id")int c_id, @Param("s_id")int s_id);//将状态置2——购买

    void SetAgree3(@Param("c_id")int c_id, @Param("s_id")int s_id);//将状态置3——过期

    public List<serviceorder> Select_all_service();//查找所有服务

    serviceorder findAgreeServiceByDoubleId(@Param("c_id")int c_id,@Param("s_id")int s_id);//通过双id查找该用户是否购激活了该服务
    serviceorder findAgree2ServiceByDoubleId(@Param("c_id")int c_id,@Param("s_id")int s_id);
    serviceorder findAgree3ServiceByDoubleId(@Param("c_id")int c_id,@Param("s_id")int s_id);
}
