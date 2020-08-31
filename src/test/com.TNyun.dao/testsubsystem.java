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
    }

}
