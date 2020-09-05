package com.TNyun.controller;

import com.TNyun.entity.serviceorder;
import com.TNyun.service.SI_adminService;
import com.TNyun.service.serviceorderService;
import com.TNyun.util.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/purchasedProjects")
public class SI_adminController {
    @Autowired
    private serviceorderService serviceorderService;
    @Autowired
    private SI_adminService SI_adminService;

    @RequestMapping("/purchaselist")
    public ModelAndView list(Model model, Page page) {
        PageHelper.offsetPage(page.getStart(), page.getCount());
        List<serviceorder> purchaselist = serviceorderService.findall();
        int total = (int) new PageInfo<>(purchaselist).getTotal();
        page.setTotal(total);

        model.addAttribute("purchaselist", purchaselist);
        ModelAndView modelAndView = new ModelAndView("admin/purchaselist");
        return modelAndView;
    }

    @RequestMapping("/setagree1")
    public ModelAndView setagree1(int c_id, int s_id) {
        SI_adminService.AgreeExperience(c_id, s_id);
        ModelAndView modelAndView = new ModelAndView("redirect:purchaselist");
        return modelAndView;
    }

    @RequestMapping("/setagree2")
    public ModelAndView setagree2(int c_id, int s_id) {
        SI_adminService.AgreePurchase(c_id, s_id);
        ModelAndView modelAndView = new ModelAndView("redirect:purchaselist");
        return modelAndView;
    }

    @RequestMapping("/setagree3")
    public ModelAndView setagree3(int c_id, int s_id) {
        SI_adminService.Overdue(c_id, s_id);
        ModelAndView modelAndView = new ModelAndView("redirect:purchaselist");
        return modelAndView;
    }
}