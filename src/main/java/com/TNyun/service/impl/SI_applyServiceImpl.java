package com.TNyun.service.impl;

import com.TNyun.dao.SI_adminMapper;
import com.TNyun.dao.SI_applyMapper;
import com.TNyun.dao.SubsystemMapper;
import com.TNyun.entity.SI_admin;
import com.TNyun.entity.siapply;
import com.TNyun.service.SI_applyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kyq on 2020/9/7 21:51
 */
@Service
public class SI_applyServiceImpl implements SI_applyService {

    @Autowired
    private SI_applyMapper si_applyMapper;
    @Autowired
    private SI_adminMapper si_adminMapper;
    @Override
    public List<siapply> Select_siapply_all() {
        return si_applyMapper.Select_all_siapply();
    }

    @Override
    public String SI_appply_agree(String phone) {
        siapply sia=new siapply();
        SI_admin si_admin=new SI_admin();
        SI_admin si_temp=new SI_admin();
        sia=si_applyMapper.findSI_applyByphone(phone);//查找
        if(sia.getSi_agree().equals("0")) {
            System.out.println(sia.toString());
            String si_phone=sia.getSi_phone();
            String si_email=sia.getSi_email();
            System.out.println("应该置一了");
            si_applyMapper.SetApply1(si_phone);//置1
            System.out.println("置一完成了");
            si_temp=si_adminMapper.findMaxId();
            System.out.println("最大id"+si_temp.getSI_id());
            si_admin.setSI_id(si_temp.getSI_id()+1);
            si_admin.setSI_name(sia.getSi_name());
            si_admin.setSI_password(sia.getSi_password());
            si_admin.setSI_phone(sia.getSi_phone());
            si_admin.setSI_email(sia.getSi_email());
            si_admin.setSI_status("0");
            System.out.println(si_admin.toString());
            si_adminMapper.addSI_admin(si_admin);
            return "successfully";
        }else {
            return "shibai";
        }

    }
}
