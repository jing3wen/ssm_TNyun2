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

    void deleteCustomerByPhone(String phone);//根绝phone删除用户

    void set_status1(int id);//将状态置1

    void set_status0(int id);//将状态置0

    void set_status1ByPhone(String phone);//通通过电话激活账户（将状态置1）

    customer findCustomerById(int id);//通过id查找

    customer findMaxId();//查找ID数最大的用户

    public List<customer> Select_all();

    customer findCustomerByPhone(String phone);
}
