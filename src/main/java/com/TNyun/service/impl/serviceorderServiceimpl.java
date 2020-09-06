package com.TNyun.service.impl;
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

    //顾客购买子系统服务
    @Override
    public String addService(customer cus,int S_id,String S_name){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String rent_time = formatter.format(calendar.getTime());

        serviceorder so=new serviceorder();

        so.setRent_time(rent_time);
        so.setTime(rent_time);
        so.setC_id(cus.getId());
        so.setC_name(cus.getName());
        so.setS_id(S_id);
        so.setS_name(S_name);
        so.setAgree("0");

        serviceorderMapper.addservice(so);
        return "Apply to become an enterprise user is ok";
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