package com.TNyun.service;

import com.TNyun.entity.customer;
import com.TNyun.entity.serviceorder;

import java.util.List;

/**
 * @Author jingwen
 * @Date 2020/8/9 15:55
 * (ﾉꐦ ๑´Д`๑)ﾉ彡┻━┻  I have to type the code again   (▼皿▼#)
 **/

public interface serviceorderService {
    //顾客购买子系统服务
    public String addService(customer cus, int S_id, String S_name);
    //顾客删除子系统服务
    public String deleteService(int c_id,int s_id);
    //查询相关顾客所有购买的子系统服务
    List<serviceorder> findallByC_id(int c_id);

    //查询服务
}
