package com.TNyun.service.impl;

import com.TNyun.dao.SubsystemMapper;
import com.TNyun.entity.Subsystem;
import com.TNyun.service.SubsystemService;
import com.TNyun.service.adminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kyq on 2020/8/31 17:23
 */
@Service
public class SubsystemServiceImpl implements SubsystemService {

    @Autowired
    private SubsystemMapper subsystemMapper;
    @Override
    public List<Subsystem> Select_all() {
        return subsystemMapper.Select_service_all();
    }
}
