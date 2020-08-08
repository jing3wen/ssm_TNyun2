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
    public int register(customer cus) {
        //System.out.println("test1");
        if(cus.getStatus() == null) cus.setStatus("0");
        customerMapper.addcustomer(cus);
        System.out.println("test2");
        return 0;
    }

    @Override
    public customer login(int cstid, String psword) {
        customer cus2=customerMapper.findCustomerById(cstid);
        if(cus2!=null && cus2.getPassword().equals(psword)) {
            System.out.println("serviceimpl login success");
            cus2.setStatus("1");
            customerMapper.set_status1(cstid);
            return cus2;
        }else {
            System.out.println("serviceimpl login fail");
            return null;
        }

    }

    @Override
    public customer login2(String phone,String password){
        customer cus=customerMapper.findCustomerByPhone(phone);
        if (cus!=null&&cus.getPassword().equals(password)){
            System.out.println("the current user is: "+cus.cus_print()+ "login is ok");
            cus.setStatus("1");
            customerMapper.set_status1(cus.getId());
            return cus;
        }
        else{
            return cus;
        }

    }

    @Override
    public int logout(int id) {
        customer cus3=customerMapper.findCustomerById(id);
        System.out.println(cus3.cus_print());
        System.out.println(cus3.getStatus());
        if(cus3!=null && cus3.getStatus().equals("1")) {
            customerMapper.set_status0(id);
            System.out.println("可以登出");
        }else {
            System.out.println("未登录");
            return 2;
        }

        cus3=customerMapper.findCustomerById(id);
        System.out.println(cus3.cus_print());
        System.out.println(cus3.getStatus());
        if(cus3!=null && cus3.getStatus().equals("0")) {
            System.out.println("serviceimpl logout success");
            return 1;
        }else {
            System.out.println("serviceimpl logout fail");
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
