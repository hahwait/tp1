package com.itqf.dtboot.dao;

import com.itqf.dtboot.entity.Shop;

public interface ShopMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbggenerated Wed Feb 13 10:31:33 CST 2019
     */
    int deleteByPrimaryKey(Integer shopId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbggenerated Wed Feb 13 10:31:33 CST 2019
     */
    int insert(Shop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbggenerated Wed Feb 13 10:31:33 CST 2019
     */
    int insertSelective(Shop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbggenerated Wed Feb 13 10:31:33 CST 2019
     */
    Shop selectByPrimaryKey(Integer shopId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbggenerated Wed Feb 13 10:31:33 CST 2019
     */
    int updateByPrimaryKeySelective(Shop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop
     *
     * @mbggenerated Wed Feb 13 10:31:33 CST 2019
     */
    int updateByPrimaryKey(Shop record);
}