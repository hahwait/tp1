package com.itqf.dtboot.service.impl;

import com.itqf.dtboot.dao.CityMapper;
import com.itqf.dtboot.dao.ComboMapper;
import com.itqf.dtboot.entity.City;
import com.itqf.dtboot.entity.Combo;
import com.itqf.dtboot.service.IndexService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * DJ 2019/2/169:21
 */
@Service
public class IndexServiceImpl implements IndexService {
    @Resource
    private ComboMapper comboMapper;
    @Resource
    private CityMapper cityMapper;

    @Override
    public List<Combo> findAll() {

        return comboMapper.selectAll();
    }

    @Override
    public List<City> findCity() {
        return cityMapper.findAll();
    }
}
