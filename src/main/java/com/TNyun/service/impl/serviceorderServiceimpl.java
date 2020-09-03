package com.TNyun.service.impl;

import com.TNyun.dao.serviceorderMapper;
import com.TNyun.entity.serviceorder;
import com.TNyun.service.serviceorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author jingwen
 * @Date 2020/8/9 15:55
 * (ﾉꐦ ๑´Д`๑)ﾉ彡┻━┻  I have to type the code again   (▼皿▼#)
 **/
@Service
public class serviceorderServiceimpl implements serviceorderService {

    @Autowired
    private serviceorderMapper serviceordermapper;

    @Override
    public String addService(serviceorder ser) {
        if(ser!=null){
            System.out.println("要添加的服务: "+ser.ser_print());
            serviceordermapper.addservice(ser);
            return "add service is ok";
        }
        else return "add service is error";

    }

    @Override
    public String deleteService(int c_id, int s_id) {
        if(c_id!=0&&s_id!=0){
            System.out.println("要删除的service的 c_id="+Integer.toString(c_id)+", s_id="+Integer.toString(s_id));
            serviceordermapper.deleteOneByC_idAndS_id(c_id,s_id);
            return "delete service is ok";
        }
       else return "delete service is error";
    }

    @Override
    public List<serviceorder> findallByC_id(int c_id) {
        System.out.println("要查找 c_id="+Integer.toString(c_id)+"的所有已购买服务");
        return serviceordermapper.findallByC_id(c_id);
    }
}
