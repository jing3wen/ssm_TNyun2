package com.TNyun.controller;

import com.TNyun.entity.admin;
import com.TNyun.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping(value = "/adminlist")
public class adminlistController {
    @Autowired
    private com.TNyun.service.adminService adminService;

    @RequestMapping("/adminlist")
    public ModelAndView list(Model model, Page page){
        PageHelper.offsetPage(page.getStart(),page.getCount());
        List<admin> adminlist=adminService.Select_all_admin();
        int total=(int) new PageInfo<>(adminlist).getTotal();
        page.setTotal(total);

        model.addAttribute("adminlist",adminlist);
        //model.addAttribute("totals",total);
        ModelAndView modelAndView=new ModelAndView("admin/adminlist");
        return modelAndView;
    }
    @RequestMapping("/del_admin")
    public ModelAndView del_admin(int a_id){
        adminService.deleteadminByid(a_id);
        ModelAndView modelAndView=new ModelAndView("redirect:adminlist")   ;
        return modelAndView;
    }

}
