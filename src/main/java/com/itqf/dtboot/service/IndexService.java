package com.itqf.dtboot.service;

import com.itqf.dtboot.entity.*;

import java.util.List;

/**
 * DJ 2019/2/169:08
 */
public interface IndexService {

    List<Combo> findAll();
    List<City> findCity();

}
