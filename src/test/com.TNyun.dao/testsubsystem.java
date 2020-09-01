package com.TNyun.dao;

import com.TNyun.entity.Subsystem;
import com.TNyun.service.SubsystemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kyq on 2020/8/31 17:24
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class testsubsystem {
    @Autowired
    private SubsystemService subsystemService;
    @Test
    public void Simulaton_select_all() throws Exception{
        List<Subsystem> subsystems=new ArrayList<>();
        subsystems=subsystemService.Select_all();
        for (int i=0;i<subsystems.size();i++)
            System.out.println(subsystems.get(i).toString());
    }

    @Test
    public void Simulation_insert_new_sub(){
        Subsystem subsystem=new Subsystem();
        subsystem.setS_name("超市子系统");
        subsystem.setSi_id(1004);
        subsystem.setS_introduction("测试所用");
        subsystem.setS_price("10");
        subsystem.setS_website1("10.255.44.33");
        subsystem.setS_website2("10.255.44.32");
        subsystem.setS_status("1");
        System.out.println(subsystemService.Insert_new_service(subsystem));
    }

    @Test
    public void Simulation_modify(){
        Subsystem subsystem=new Subsystem();
        Subsystem subsystem1=new Subsystem();
        Subsystem subsystem2=new Subsystem();
        subsystem.setS_id(5);
        subsystem.setS_introduction("ceshi yongli");
        System.out.println(subsystemService.Update_s_introduction(subsystem));

        subsystem1.setS_id(6);
        subsystem1.setS_price("100");
        System.out.println(subsystemService.Update_s_price(subsystem1));

        subsystem2.setS_id(7);
        subsystem2.setS_website1("baidu.com");
        subsystem2.setS_website2("google.com");
        System.out.println(subsystemService.Update_s_website1(subsystem2));
        System.out.println(subsystemService.Update_s_website2(subsystem2));
        int t=subsystemService.Delete_subsystem_by_s_id(7);
        if(t==1){
            System.out.println("删除成功");
        }else{
            System.out.println("error");
        }


    }


}
