package com.TNyun.controller;

import com.TNyun.dao.customerMapper;
import com.TNyun.entity.Subsystem;
import com.TNyun.entity.customer;
import com.TNyun.entity.siapply;
import com.TNyun.service.SI_adminService;
import com.TNyun.service.SI_applyService;
import com.TNyun.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

/**
 * @Author jingwen
 * @Date 2020/9/6 16:19
 * (ﾉꐦ ๑´Д`๑)ﾉ彡┻━┻  I have to type the code again   (▼皿▼#)
 **/
@Controller
@RequestMapping("/SIApplylist")
public class SIApplyController {

    @Autowired
    customerMapper customerMapper;
    @Autowired
    SI_adminService SI_adminService;
    @Autowired
    SI_applyService si_applyService;

    //普通用户注册申请为起企业用户，由于登录功能还未完成，暂时写成这样
    /*
     * 前端传过来的数据
     * si_phone:13432234512 (jing文)
     * si_introduction:test模拟一个普通用户申请成为开发商
     * */
    @RequestMapping(value = "/customerSIApply_post",method = RequestMethod.POST)
    @ResponseBody
    public String SIApply(@RequestBody Map<String,Object> map){
        System.out.println("收到customerSIApply_post:");
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String rent_time = formatter.format(calendar.getTime());
        siapply sa=new siapply();
        sa.setTime(rent_time);
        //根据前端传过来的电话查找改用户所有信息
        customer cus=customerMapper.findCustomerByPhone(map.get("si_phone").toString());
        sa.setSi_name(cus.getName());
        sa.setSi_password(cus.getPassword());
        sa.setSi_phone(cus.getPhone());
        sa.setSi_email(cus.getEmail());
        sa.setSi_type("SI_admin");
        sa.setSi_introduction(map.get("si_introduction").toString());
        sa.setSi_agree("0");
        String result=SI_adminService.applyForSiadmin(sa);
        System.out.println(result);
        return result;
    }
    @RequestMapping("/siapplylist")
    public ModelAndView list(Model model, Page page){
        PageHelper.offsetPage(page.getStart(),page.getCount());
        List<siapply> siapplies=si_applyService.Select_siapply_all();
        int total=(int) new PageInfo<>(siapplies).getTotal();
        page.setTotal(total);

        model.addAttribute("siapplylist",siapplies);
        //model.addAttribute("totals",total);
        ModelAndView modelAndView=new ModelAndView("admin/SIApplylist");
        return modelAndView;
    }
    @RequestMapping("/agree")
    public ModelAndView agree(String si_phone){
        si_applyService.SI_appply_agree(si_phone);
        ModelAndView modelAndView=new ModelAndView("redirect:siapplylist")   ;
        return modelAndView;

    }
}
