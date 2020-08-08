package com.TNyun.dao;

import com.TNyun.entity.customer;

import java.util.List;

/**
 * @Author jingwen
 * @Date 2020/8/5 9:23
 * (ﾉꐦ ๑´Д`๑)ﾉ彡┻━┻  I have to type the code again   (▼皿▼#)
 **/
public interface customerMapper {

    void addcustomer(customer cus);//注册

    customer findCustomerById(int id);//通过id查找

    void set_status1(int id);//将状态置1（登录时使用）

    void set_status0(int id);//将状态置0（登出时使用）

    public List<customer> Select_all();

    customer findCustomerByPhone(String phone);
}
