package com.TNyun.service.impl;

import com.TNyun.dao.serviceMapper;
import com.TNyun.entity.Sys_Service;
import com.TNyun.service.Sys_ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author jingwen
 * @Date 2020/8/9 15:55
 * (ﾉꐦ ๑´Д`๑)ﾉ彡┻━┻  I have to type the code again   (▼皿▼#)
 **/
@Service
public class Sys_ServiceServiceimpl implements Sys_ServiceService {

    @Autowired
    private serviceMapper servicemapper;

    @Override
    public String addService(Sys_Service ser) {
        if(ser!=null){
            System.out.println("要添加的服务: "+ser.ser_print());
            servicemapper.addservice(ser);
            return "add service is ok";
        }
        else return "add service is error";

    }

    @Override
    public String deleteService(int c_id, int s_id) {
        if(c_id!=0&&s_id!=0){
            System.out.println("要删除的service的 c_id="+Integer.toString(c_id)+", s_id="+Integer.toString(s_id));
            servicemapper.deleteOneByC_idAndS_id(c_id,s_id);
            return "delete service is ok";
        }
       else return "delete service is error";
    }

    @Override
    public List<Sys_Service> findallByC_id(int c_id) {
        System.out.println("要查找 c_id="+Integer.toString(c_id)+"的所有已购买服务");
        return servicemapper.findallByC_id(c_id);

    }
}
