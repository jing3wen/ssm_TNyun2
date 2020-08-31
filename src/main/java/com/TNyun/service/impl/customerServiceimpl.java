package com.TNyun.service.impl;

import com.TNyun.dao.customerMapper;
import com.TNyun.entity.customer;
import com.TNyun.service.customerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author jingwen
 * @Date 2020/8/6 21:15
 * (ﾉꐦ ๑´Д`๑)ﾉ彡┻━┻  I have to type the code again   (▼皿▼#)
 **/
@Service
public class customerServiceimpl implements customerService {

    @Autowired
    private customerMapper customerMapper;
    /**
     * name : zhangsan
     * age : 20
     */

    private String name;
    private int age;

    @Override
    public String register(customer cus) {
        //System.out.println("test1");
        if (customerMapper.findCustomerByPhone(cus.getPhone())!=null){
            return "the account has been registered";
        } else {
            customer lastcus = customerMapper.findMaxId();
            cus.setId(lastcus.getId() + 1);
            if (cus.getStatus() == null) cus.setStatus("0");
            //无getEmail
            System.out.println("要注册的顾客是: " + cus.cus_print());
            customerMapper.addcustomer(cus);
            //System.out.println("test2");
            return "register is ok";
        }
    }

    @Override
    public String deletecustomer(customer cus){
        System.out.println("要删除的顾客是:"+cus.cus_print());
        customerMapper.deleteCustomerByPhone(cus.getPhone());
        return "删除成功";
    }

    @Override
    public customer login(String phone, String password) {

       return customerMapper.findCustomerByPhone(phone);
    }

    @Override
    public String login2(String phone,String password){
        customer cus=customerMapper.findCustomerByPhone(phone);
        if (cus!=null&&cus.getPassword().equals(password)&&cus.getStatus().equals("0")){
            System.out.println("the current user is: "+cus.cus_print()+ "login is ok");
            cus.setStatus("1");
            customerMapper.set_status1(cus.getId());
            return "customer login is ok";
        }
        else if (cus!=null&&cus.getPassword().equals(password)&&cus.getStatus().equals("1")){
            return "the customer has logined";
        }
        else if(cus!=null&& !(cus.getPassword().equals(password)) ){
            return "the password is error";
        }
        else return "the customer is not here";

    }

    @Override
    public int logout(int id) {
        customer cus3=customerMapper.findCustomerById(id);
        if(cus3!=null && cus3.getStatus().equals("1")) {
            System.out.println("要登出的用户: "+cus3.cus_print());
            customerMapper.set_status0(id);
           return 1;
        }else {
            System.out.println("未登录");
            return 0;
        }

    }

    @Override
    public List<customer> Select_all()  {
        return customerMapper.Select_all();
    }

    @Override
    public customer findCustomerByPhone(String phone) {
        customer cus4=customerMapper.findCustomerByPhone(phone);
        System.out.println(cus4.cus_print());
        return cus4;
    }
}
