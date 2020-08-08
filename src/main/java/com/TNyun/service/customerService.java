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
    public int register(customer cus);

    //顾客登录
    public customer login(int cstid, String psword);

    public customer login2(String phone,String password);

    public int logout(int id);

    public List<customer> Select_all() ;

    public customer findCustomerByPhone(String phone);
}
