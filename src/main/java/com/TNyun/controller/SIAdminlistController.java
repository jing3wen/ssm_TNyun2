package com.TNyun.controller;

import com.TNyun.entity.customer;
import com.TNyun.entity.SI_admin;
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
@RequestMapping(value = "/SIAdminlist")
public class SIAdminlistController {

        @Autowired
        private com.TNyun.service.SI_adminService SI_adminService;

        @RequestMapping("/siadminlist")
        public ModelAndView list(Model model, Page page){
            PageHelper.offsetPage(page.getStart(),page.getCount());
            List<SI_admin> siadminlist=SI_adminService.findallSI();
            int total=(int) new PageInfo<>(siadminlist).getTotal();
            page.setTotal(total);

            model.addAttribute("siadminlist",siadminlist);
            //model.addAttribute("totals",total);
            ModelAndView modelAndView=new ModelAndView("admin/SIAdminlist");
            return modelAndView;
        }
        @RequestMapping("/del_SIadmin")
        public ModelAndView del_SIadmin(int si_id){
            SI_adminService.Delete_SI_by_id(si_id);
            ModelAndView modelAndView=new ModelAndView("redirect:siadminlist")   ;
            return modelAndView;
        }

    @RequestMapping(value = "update_name",method = RequestMethod.POST)
    public String update_s_introduction(@RequestBody SI_admin SI_admin, HttpServletRequest servletRequest){

        System.out.println("收到update_name"+SI_admin.toString());
        String result;
        Retureninfo retureninfo=new Retureninfo();
        try {
            result=SI_adminService.Update_name(SI_admin);
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

    @RequestMapping(value = "update_phone",method = RequestMethod.POST)
    public String update_s_price(@RequestBody SI_admin SI_admin, HttpServletRequest servletRequest){

        System.out.println("收到update_phone"+SI_admin.toString());
        String result;
        Retureninfo retureninfo=new Retureninfo();
        try {
            result=SI_adminService.Update_phone(SI_admin);
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
    @RequestMapping(value = "update_email",method = RequestMethod.POST)
    public String update_s_website1(@RequestBody SI_admin SI_admin, HttpServletRequest servletRequest){

        System.out.println("收到update_email"+SI_admin.toString());
        String result;
        Retureninfo retureninfo=new Retureninfo();
        try {
            result=SI_adminService.Update_email(SI_admin );
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
