package com.TNyun.controller;

import com.TNyun.entity.Subsystem;
import com.TNyun.service.SubsystemService;
import com.TNyun.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by kyq on 2020/9/1 23:43
 */

@Controller
@RequestMapping(value = "/Projectlist")
public class projectlistController {
    @Autowired
    private SubsystemService subsystemService;

    @RequestMapping("/subsystemlist")
    public String list(Model model, Page page){
        PageHelper.offsetPage(page.getStart(),page.getCount());
        List<Subsystem> subsystemList=subsystemService.Select_subsystem_all();
        int total=(int) new PageInfo<>(subsystemList).getTotal();
        page.setTotal(total);

        model.addAttribute("subsystemlist",subsystemList);
        //model.addAttribute("totals",total);
        return "admin/Projectlist";
    }
    @RequestMapping("del_subsystem")
    public String del_subsystem(int s_id){
        subsystemService.Delete_subsystem_by_s_id(s_id);
            return "redirect:subsystemlist";

    }

}
