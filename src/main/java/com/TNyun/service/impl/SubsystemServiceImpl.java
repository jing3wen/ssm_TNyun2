package com.TNyun.service.impl;

import com.TNyun.dao.SubsystemMapper;
import com.TNyun.entity.Subsystem;
import com.TNyun.service.SubsystemService;
import com.TNyun.service.adminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kyq on 2020/8/31 17:23
 */
@Service
public class SubsystemServiceImpl implements SubsystemService {

    @Autowired
    private SubsystemMapper subsystemMapper;
    @Override
    public List<Subsystem> Select_subsystem_all() {
        return subsystemMapper.Select_service_all();
    }

    @Override
    public String Insert_new_service(Subsystem subsystem) {
        /*
        * 查重
        * 找到最大id加一作为新的id
        * 插入
        * */
        Subsystem subsystem1=new Subsystem();
        Integer max_id;
        subsystem1=subsystemMapper.Duplicate_check(subsystem);
        if(subsystem1!=null){
            return "此服务已存在";
        }else{
            max_id=subsystemMapper.Find_max_s_id()+1;
            subsystem.setS_id(max_id);
            subsystemMapper.Insert_subsystem(subsystem);
        }
        subsystem1=subsystemMapper.Duplicate_check(subsystem);
        //if(subsystem1.getS_id()==subsystem.getS_id()) {
        if(subsystem.equals(subsystem1)){
            return "插入成功";
        }else {
            return "error";
        }
    }

    @Override
    public String Update_s_introduction(Subsystem subsystem) {
        subsystemMapper.Update_s_introduction(subsystem);
        Subsystem subsystem1=new Subsystem();
        subsystem1=subsystemMapper.Find_sub_by_id(subsystem.getS_id());
        if(subsystem1.getS_introduction().equals(subsystem.getS_introduction())){
            System.out.println(subsystem1.toString());
            return "update introduction successfully";
        }else {
            return "update introduction error";
        }

    }

    @Override
    public String Update_s_price(Subsystem subsystem) {
        subsystemMapper.Update_s_price(subsystem);
        Subsystem subsystem1=new Subsystem();
        subsystem1=subsystemMapper.Find_sub_by_id(subsystem.getS_id());
        if(subsystem1.getS_price().equals(subsystem.getS_price())){
            System.out.println(subsystem1.toString());
            return "update price successfully";
        }else {
            return "update price error";
        }
    }

    @Override
    public String Update_s_website1(Subsystem subsystem) {
        subsystemMapper.Update_s_website1(subsystem);
        Subsystem subsystem1=new Subsystem();
        subsystem1=subsystemMapper.Find_sub_by_id(subsystem.getS_id());
        if(subsystem1.getS_website1().equals(subsystem.getS_website1())){
            System.out.println(subsystem1.toString());
            return "update website1 successfully";
        }else {
            return "update website1 error";
        }
    }

    @Override
    public String Update_s_website2(Subsystem subsystem) {
        subsystemMapper.Update_s_website2(subsystem);
        Subsystem subsystem1=new Subsystem();
        subsystem1=subsystemMapper.Find_sub_by_id(subsystem.getS_id());
        if(subsystem1.getS_website2().equals(subsystem.getS_website2())){
            System.out.println(subsystem1.toString());
            return "update website2 successfully";
        }else {
            return "update website2 error";
        }
    }

    @Override
    public void Delete_subsystem_by_s_id(int s_id) {
        subsystemMapper.Delete_subsystem_by_s_id(s_id);


    }



}
