package com.TNyun.service.impl;

import com.TNyun.dao.Day_countMapper;
import com.TNyun.entity.Day_count;
import com.TNyun.service.Day_countService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kyq on 2020/9/10 17:36
 */
@Service
public class Day_countServeceImpl implements Day_countService {
    @Autowired
    Day_countMapper dayCountMapper;
    @Override
    public List<Day_count> Select_all() {
        return dayCountMapper.Select_all();
    }
}
