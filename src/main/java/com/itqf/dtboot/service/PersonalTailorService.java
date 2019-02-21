package com.itqf.dtboot.service;

import com.itqf.dtboot.entity.*;

import java.util.List;

/**
 * DJ 2019/2/169:45
 */
public interface PersonalTailorService {
    List<Photographer> findP();
    List<Scenicspot> findS();
    List<Hotel> findH();
    List<Diet> findD();
    List<Traffic> findT();

}
