package com.itqf.dtboot.dao;

import com.itqf.dtboot.entity.SysConfig;

public interface SysConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedback
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    int deleteByPrimaryKey(Integer fbId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedback
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    int insert(SysConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedback
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    int insertSelective(SysConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedback
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    SysConfig selectByPrimaryKey(Integer fbId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedback
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    int updateByPrimaryKeySelective(SysConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedback
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    int updateByPrimaryKey(SysConfig record);
}