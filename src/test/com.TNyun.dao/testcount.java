package com.TNyun.dao;

import com.TNyun.entity.Day_count;
import com.TNyun.entity.Subsystem;
import com.TNyun.service.Day_countService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kyq on 2020/9/10 17:42
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class testcount {
    @Autowired
    private Day_countService dayCountService;
    @Test
    public void selectall(){
        List<Day_count> day_counts=new ArrayList<>();
        day_counts=dayCountService.Select_all();
        for (int i=0;i<day_counts.size();i++)
            System.out.println(day_counts.get(i).toString());
    }
}
