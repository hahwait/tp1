package com.itqf.dtboot.dao;

import com.itqf.dtboot.entity.SysRoleMenu;

public interface SysRoleMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table combo_evaluate
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    int deleteByPrimaryKey(Integer evId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table combo_evaluate
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    int insert(SysRoleMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table combo_evaluate
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    int insertSelective(SysRoleMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table combo_evaluate
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    SysRoleMenu selectByPrimaryKey(Integer evId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table combo_evaluate
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    int updateByPrimaryKeySelective(SysRoleMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table combo_evaluate
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    int updateByPrimaryKey(SysRoleMenu record);
}