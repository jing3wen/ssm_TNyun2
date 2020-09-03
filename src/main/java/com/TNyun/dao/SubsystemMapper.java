package com.TNyun.dao;

import com.TNyun.entity.Subsystem;

import java.util.List;

/**
 * Created by kyq on 2020/8/31 10:15
 */
public interface SubsystemMapper {

    List<Subsystem> Select_service_all();//查询所有子系统服务
    Subsystem Duplicate_check(Subsystem subsystem);//查重
    int Find_max_s_id();
    void Insert_subsystem(Subsystem subsystem);
    Subsystem Find_sub_by_id(int s_id);
    void Update_s_introduction(Subsystem subsystem);
    void Update_s_price(Subsystem subsystem);
    void Update_s_website1(Subsystem subsystem);
    void Update_s_website2(Subsystem subsystem);
    void Delete_subsystem_by_s_id(int s_id);


}
