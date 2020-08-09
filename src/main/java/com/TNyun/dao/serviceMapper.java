package com.TNyun.dao;

import com.TNyun.entity.Sys_Service;

import java.util.List;

/**
 * @Author jingwen
 * @Date 2020/8/9 15:42
 * (ﾉꐦ ๑´Д`๑)ﾉ彡┻━┻  I have to type the code again   (▼皿▼#)
 **/
public interface serviceMapper {

    void addservice(Sys_Service ser);

    void deleteOneByC_idAndS_id(int c_id,int s_id);

    List<Sys_Service> findallByC_id(int c_id);

}
