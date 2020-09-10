package com.TNyun.controller;

import com.TNyun.dao.Day_countMapper;
import com.TNyun.entity.Day_count;
import com.TNyun.entity.Subsystem;
import com.TNyun.service.Day_countService;
import com.TNyun.util.Retureninfo;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kyq on 2020/9/10 19:04
 */
@Controller
@RequestMapping("/charts")
public class chartsController {
    @Autowired
    Day_countService dayCountService;
    @Autowired
    Day_countMapper dayCountMapper;

    @RequestMapping(value = "/selectAll",method = RequestMethod.POST)
    @ResponseBody
    public JSONArray selectAll(){
        System.out.println("收到申请查询Day_count");
        List<Day_count> day_counts=new ArrayList<>();
        day_counts=dayCountService.Select_all();
        for (int i=0;i<day_counts.size();i++) {
            System.out.println(day_counts.get(i).toString());
        }

        JSONArray jsonArray=new JSONArray();
        for(int i=0;i<day_counts.size();i++){
            JSONObject temp=new JSONObject();
            temp.put("time_day",day_counts.get(i).getTime_day());
            temp.put("count_login",day_counts.get(i).getCount_login());
            temp.put("count_register",day_counts.get(i).getCount_register());
            jsonArray.add(temp);
        }
        return jsonArray;
    }
}
