package com.TNyun.controller;


import com.TNyun.entity.Subsystem;
import com.TNyun.entity.customer;
import com.TNyun.service.SI_adminService;
import com.TNyun.util.Page;
import com.TNyun.util.Retureninfo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
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
        ModelAndView modelAndView=new ModelAndView("Customerlist");
        return modelAndView;
    }
    @RequestMapping("/del_customer")
    public ModelAndView del_ccustomer(int id){
        SI_adminService.Delete_customer_by_id(id);
        ModelAndView modelAndView=new ModelAndView("redirect:customerlist")   ;
        return modelAndView;
    }

    @RequestMapping(value = "update_s_name",method = RequestMethod.POST)
    public String update_s_introduction(@RequestBody customer customer, HttpServletRequest servletRequest){

        System.out.println("收到update_s_name"+customer.cus_print());
        String result;
        Retureninfo retureninfo=new Retureninfo();
        try {
            result=SI_adminService.Update_s_name(customer);
            System.out.println("返回："+result);
            if(result.equals("update name successfully")) {
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
    }

    @RequestMapping(value = "update_s_phone",method = RequestMethod.POST)
    public String update_s_price(@RequestBody customer customer, HttpServletRequest servletRequest){

        System.out.println("收到update_s_phone"+customer.cus_print());
        String result;
        Retureninfo retureninfo=new Retureninfo();
        try {
            result=SI_adminService.Update_s_phone(customer);
            System.out.println("返回："+result);
            if(result.equals("update phone successfully")) {
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
    }
    @RequestMapping(value = "update_s_email",method = RequestMethod.POST)
    public String update_s_website1(@RequestBody customer customer, HttpServletRequest servletRequest){

        System.out.println("收到update_s_email"+customer.cus_print());
        String result;
        Retureninfo retureninfo=new Retureninfo();
        try {
            result=SI_adminService.Update_s_email(customer);
            System.out.println("返回："+result);
            if(result.equals("update email successfully")) {
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
    }
}
