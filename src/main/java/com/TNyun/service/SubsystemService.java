package com.TNyun.service;

import com.TNyun.entity.Subsystem;

import java.util.List;

/**
 * Created by kyq on 2020/8/31 17:22
 */
public interface SubsystemService {
    List<Subsystem> Select_subsystem_all();
    String Insert_new_service(Subsystem subsystem);
    String Update_s_introduction(Subsystem subsystem);
    String Update_s_price(Subsystem subsystem);
    String Update_s_website1(Subsystem subsystem);
    String Update_s_website2(Subsystem subsystem);
    int Delete_subsystem_by_s_id(int s_id);

}
