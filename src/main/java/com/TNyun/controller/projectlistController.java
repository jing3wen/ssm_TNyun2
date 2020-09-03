package com.TNyun.controller;

import com.TNyun.entity.Subsystem;
import com.TNyun.service.SubsystemService;
import com.TNyun.util.Page;
import com.TNyun.util.Retureninfo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by kyq on 2020/9/1 23:43
 */

@RestController
@RequestMapping(value = "/Projectlist")
public class projectlistController {
    @Autowired
    private SubsystemService subsystemService;

    @RequestMapping("/subsystemlist")
    public ModelAndView list(Model model, Page page){
        PageHelper.offsetPage(page.getStart(),page.getCount());
        List<Subsystem> subsystemList=subsystemService.Select_subsystem_all();
        int total=(int) new PageInfo<>(subsystemList).getTotal();
        page.setTotal(total);

        model.addAttribute("subsystemlist",subsystemList);
        //model.addAttribute("totals",total);
        ModelAndView modelAndView=new ModelAndView("Projectlist");
        return modelAndView;
    }
    @RequestMapping("/del_subsystem")
    public ModelAndView del_subsystem(int s_id){
        subsystemService.Delete_subsystem_by_s_id(s_id);
        ModelAndView modelAndView=new ModelAndView("redirect:subsystemlist")   ;
        return modelAndView;

    }
    @RequestMapping(value = "submit_insert_subsystem",method = RequestMethod.POST)
    public String submit_insert_subsystem(@RequestBody Subsystem subsystem, HttpServletRequest servletRequest){

        System.out.println("收到submit_insert_subsystem"+subsystem.toString());
        String result;
        Retureninfo retureninfo=new Retureninfo();
        try {
            result=subsystemService.Insert_new_service(subsystem);
            System.out.println("返回："+result);

            if(result.equals("插入成功")) {
                retureninfo.setCode(1);
                retureninfo.setMsg(result);
                //servletRequest.setAttribute("result","插入成功");
            }else {
                retureninfo.setCode(0);
                retureninfo.setMsg(result);

                //servletRequest.setAttribute("result",null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        JSONObject jsonObject=new JSONObject();
        jsonObject=JSONObject.fromObject(retureninfo);
        return jsonObject.toString();

        /*int t;*/
        /**/

    }

}
