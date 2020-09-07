package com.TNyun.service.impl;
import com.TNyun.entity.Subsystem;
import com.TNyun.entity.customer;
import com.TNyun.entity.serviceorder;
import com.TNyun.service.serviceorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Calendar;


@Service
public class serviceorderServiceimpl implements serviceorderService{

    @Autowired
    private com.TNyun.dao.serviceorderMapper serviceorderMapper;

    //顾客购买子系统服务,注意表中的time表示的是起始日期,rent_time表示的截止日期
    @Override
    public String addService(customer cus, Subsystem sys, String time, String rent_time){
        serviceorder so=new serviceorder();
        so.setTime(time);
        so.setC_id(cus.getId());
        so.setC_name(cus.getName());
        so.setS_id(sys.getS_id());
        so.setS_name(sys.getS_name());
        so.setRent_time(rent_time);
        so.setAgree("1");
        System.out.println("要添加的serviceorder是："+so.ser_print());
        if((serviceorderMapper.findAgreeServiceByDoubleId(so.getC_id(),so.getS_id()))!=null){
            return "you had bought the service";
        }
        else {
            serviceorderMapper.addservice(so);
            return "Apply to become an enterprise user is ok";
        }
    }

    //顾客删除子系统服务
    @Override
    public String deleteService(int c_id,int s_id){
        System.out.println("用户"+c_id+"要删除的服务是:"+s_id);
        serviceorderMapper.deleteOneByC_idAndS_id(c_id,s_id);
        return "删除成功";
    }
    //查询相关顾客所有购买的子系统服务
    @Override
    public List<serviceorder> findall(){
        return serviceorderMapper.findall();
    }
}