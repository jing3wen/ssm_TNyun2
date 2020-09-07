package com.TNyun.controller;

import com.TNyun.dao.customerMapper;
import com.TNyun.entity.customer;
import com.TNyun.entity.siapply;
import com.TNyun.service.SI_adminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @Author jingwen
 * @Date 2020/9/6 16:19
 * (ﾉꐦ ๑´Д`๑)ﾉ彡┻━┻  I have to type the code again   (▼皿▼#)
 **/
@Controller
@RequestMapping("/SIApply")
public class SIApplyController {

    @Autowired
    customerMapper customerMapper;
    @Autowired
    SI_adminService SI_adminService;

    //普通用户注册申请为起企业用户，由于登录功能还未完成，暂时写成这样
    @RequestMapping(value = "/customerSIApply_post",method = RequestMethod.POST)
    @ResponseBody
    public String SIApply(HttpServletRequest request){
        System.out.println("收到customerSIApply_post:");
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String rent_time = formatter.format(calendar.getTime());
        siapply sa=new siapply();
        sa.setTime(rent_time);
        //根据前端传过来的电话查找改用户所有信息
        customer cus=customerMapper.findCustomerByPhone(request.getParameter("si_phone"));
        sa.setSi_name(cus.getName());
        sa.setSi_password(cus.getPassword());
        sa.setSi_phone(cus.getPhone());
        sa.setSi_email(cus.getEmail());
        sa.setSi_type("SI_admin");
        sa.setSi_introduction(request.getParameter("si_introduction"));
        sa.setSi_agree("0");
        System.out.println(SI_adminService.applyForSiadmin(sa));
        return null;
    }
}
