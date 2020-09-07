package com.TNyun.controller;

import com.TNyun.dao.SubsystemMapper;
import com.TNyun.dao.customerMapper;
import com.TNyun.entity.Subsystem;
import com.TNyun.entity.customer;
import com.TNyun.entity.serviceorder;
import com.TNyun.service.serviceorderService;
import com.TNyun.service.SI_adminService;
import com.TNyun.util.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/ServerOrder")
public class ServerOrderController {
    @Autowired
    private SI_adminService SI_adminService;

    @RequestMapping(value = "/ServerOrderlist")
    public ModelAndView list(Model model, Page page) {
        PageHelper.offsetPage(page.getStart(), page.getCount());
        List<serviceorder> purchaselist = SI_adminService.findalls();
        int total = (int) new PageInfo<>(purchaselist).getTotal();
        page.setTotal(total);

        model.addAttribute("ServerOrderlist", purchaselist);
        ModelAndView modelAndView = new ModelAndView("admin/ServerOrderlist");
        return modelAndView;
    }

    @RequestMapping("/setagree1")
    public ModelAndView setagree1(int c_id, int s_id) {
        SI_adminService.AgreeExperience(c_id, s_id);
        ModelAndView modelAndView = new ModelAndView("redirect:ServerOrderlist");
        return modelAndView;
    }

    @RequestMapping("/setagree2")
    public ModelAndView setagree2(int c_id, int s_id) {
        SI_adminService.AgreePurchase(c_id, s_id);
        ModelAndView modelAndView = new ModelAndView("redirect:ServerOrderlist");
        return modelAndView;
    }

    @RequestMapping("/setagree3")
    public ModelAndView setagree3(int c_id, int s_id) {
        SI_adminService.Overdue(c_id, s_id);
        ModelAndView modelAndView = new ModelAndView("redirect:ServerOrderlist");
        return modelAndView;
    }

    @Autowired
    private serviceorderService serviceorderService;

    @Autowired
    private customerMapper customerMapper;

    @Autowired
    private SubsystemMapper SubsystemMapper;
    //用户在前台页面申请购买该服务
    /*传过来的参数
    *"customer_id"://此处也可以用customer_phone来替换
    * "subsystem_id"
    * "time_length"//收到是int类型,单位是月
    * 注意表中的time表示的是起始日期,rent_time表示的截止日期,time_length=rent_time-time
    * */
    @RequestMapping(value = "/addService_post",method = RequestMethod.POST)
    @ResponseBody
    public String addService(@RequestBody Map<String,Object> map) {
        System.out.println("收到/addService_post:");
        //System.out.println("customer_id:"+Integer.parseInt(map.get("customer_id").toString()));
        customer cus=customerMapper.findCustomerById(Integer.parseInt(map.get("customer_id").toString()));
        Subsystem sys=SubsystemMapper.Find_sub_by_id(Integer.parseInt(map.get("subsystem_id").toString()));
        String time=null,rent_time=null;
        Calendar currenttime = Calendar.getInstance();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=new Date();
        time=sdf.format(date);//当前时间
        currenttime.add(Calendar.MONTH,Integer.parseInt(map.get("time_length").toString()));//当前时间加n个月的截至日期
        rent_time=sdf.format(currenttime.getTime());//截至日期
        String result=serviceorderService.addService(cus,sys,time,rent_time);
        System.out.println("返回结果:"+result);
        return result;
    }

    @RequestMapping("/deleteService")
    public ModelAndView deleteService(int c_id,int s_id) {
        serviceorderService.deleteService(c_id,s_id);
        ModelAndView mv = new ModelAndView("redirect:ServiceOrderlist");
        return mv;
    }

    @RequestMapping("/diaplayAllService")
    public ModelAndView diaplayAllService() {
        List<serviceorder> so=serviceorderService.findall();
        ModelAndView mv = new ModelAndView("redirect:ServiceOrderlist");
        return mv;
    }
}