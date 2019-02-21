package com.itqf.dtboot.service.impl;

import com.itqf.dtboot.dao.*;
import com.itqf.dtboot.entity.*;
import com.itqf.dtboot.service.PersonalTailorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * DJ 2019/2/169:47
 */
@Service
public class PersonalTailorImpl implements PersonalTailorService {
    @Resource
    private PhotographerMapper photographerMapper;
    @Resource
    private ScenicspotMapper scenicspotMapper;
    @Resource
    private HotelMapper hotelMapper;
    @Resource
    private DietMapper dietMapper;
    @Resource
    private TrafficMapper trafficMapper;
    @Override
    public List<Photographer> findP() {
        return photographerMapper.findAll();
    }

    @Override
    public List<Scenicspot> findS() {
        return scenicspotMapper.findByAll();
    }

    @Override
    public List<Hotel> findH() {
        return hotelMapper.findAll();
    }

    @Override
    public List<Diet> findD() {
        return dietMapper.findAll();
    }

    @Override
    public List<Traffic> findT() {
        return trafficMapper.findAll();
    }
}
