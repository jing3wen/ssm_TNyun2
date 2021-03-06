package com.TNyun.service;

import com.TNyun.entity.Subsystem;
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
    public String addService(customer cus, Subsystem sys, String time, String rent_time);
    //顾客删除子系统服务
    public String deleteService(int c_id,int s_id);
    //查询相关顾客所有购买的子系统服务
    List<serviceorder> findall();
    //查询服务
}
