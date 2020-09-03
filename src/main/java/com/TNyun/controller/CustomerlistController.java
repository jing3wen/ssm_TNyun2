package com.TNyun.controller;


import com.TNyun.entity.customer;
import com.TNyun.service.SI_adminService;
import com.TNyun.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping(value = "/Customerlist")
public class CustomerlistController {
    @Autowired
    private SI_adminService SI_adminService;

    @RequestMapping("/customerlist")
    public ModelAndView list(Model model, Page page){
        PageHelper.offsetPage(page.getStart(),page.getCount());
        List<customer> customerList=SI_adminService.Select_all_customer();
        int total=(int) new PageInfo<>(customerList).getTotal();
        page.setTotal(total);

        model.addAttribute("customerlist",customerList);
        //model.addAttribute("totals",total);
        ModelAndView modelAndView=new ModelAndView("admin/Customerlist");
        return modelAndView;
    }
    @RequestMapping("/del_customer")
    public ModelAndView del_ccustomer(int id){
        SI_adminService.Delete_customer_by_id(id);
        ModelAndView modelAndView=new ModelAndView("redirect:customerlist")   ;
        return modelAndView;
    }

    @RequestMapping(value = "/update_customer",method = RequestMethod.POST)
    public ModelAndView update_customer(customer cst){
        System.out.println(cst.cus_print());
        SI_adminService.update_customer(cst);
        ModelAndView modelAndView=new ModelAndView("redirect:customerlist")   ;
        return modelAndView;
    }
}
