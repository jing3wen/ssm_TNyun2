package com.TNyun.dao;

import com.TNyun.entity.siapply;
import com.TNyun.service.SI_applyService;
import com.TNyun.service.SubsystemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kyq on 2020/9/7 21:56
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class testsi {
    @Autowired
    private SI_applyService si_applyService;
    @Test
    public void select_all(){
        List<siapply> siapplies= new ArrayList<>();
        siapplies=si_applyService.Select_siapply_all();
        for (int i=0;i<siapplies.size();i++)
            System.out.println(siapplies.get(i).toString());
    }
    @Test
    public void agree(){
        String siphone=new String("13345672345");
        System.out.println(si_applyService.SI_appply_agree(siphone));
    }

}
