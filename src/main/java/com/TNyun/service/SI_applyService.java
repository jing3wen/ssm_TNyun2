package com.TNyun.service;

import com.TNyun.entity.Subsystem;
import com.TNyun.entity.siapply;

import java.util.List;

/**
 * Created by kyq on 2020/9/7 21:50
 */
public interface SI_applyService {
    List<siapply> Select_siapply_all();
    String SI_appply_agree(String phone);
}
