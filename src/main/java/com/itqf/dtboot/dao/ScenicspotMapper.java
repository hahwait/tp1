package com.itqf.dtboot.dao;

import com.itqf.dtboot.entity.Scenicspot;

import java.util.List;

public interface ScenicspotMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scenicspot
     *
     * @mbggenerated Sat Feb 16 10:19:57 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scenicspot
     *
     * @mbggenerated Sat Feb 16 10:19:57 CST 2019
     */
    int insert(Scenicspot record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scenicspot
     *
     * @mbggenerated Sat Feb 16 10:19:57 CST 2019
     */
    int insertSelective(Scenicspot record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scenicspot
     *
     * @mbggenerated Sat Feb 16 10:19:57 CST 2019
     */
    Scenicspot selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scenicspot
     *
     * @mbggenerated Sat Feb 16 10:19:57 CST 2019
     */
    int updateByPrimaryKeySelective(Scenicspot record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scenicspot
     *
     * @mbggenerated Sat Feb 16 10:19:57 CST 2019
     */
    int updateByPrimaryKey(Scenicspot record);
    List<Scenicspot> findByAll();
}