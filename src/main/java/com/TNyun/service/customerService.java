package com.TNyun.service;

import com.TNyun.entity.customer;

import java.util.List;

/**
 * @Author jingwen
 * @Date 2020/8/6 21:13
 * (ﾉꐦ ๑´Д`๑)ﾉ彡┻━┻  I have to type the code again   (▼皿▼#)
 **/

public interface customerService {
    //顾客注册
    public String register(customer cus);

    public String deletecustomer(customer cus);

    //顾客登陆,以session形式
    public customer login(String phone, String password);
    //顾客登陆，以单个用户测试
    public String login2(String phone,String password);


    public int logout(int id);

    public List<customer> Select_all() ;

    public customer findCustomerByPhone(String phone);
}
