package com.itqf.dtboot.entity;

import java.io.Serializable;

public class TbToken implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_travel.ut_id
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    private Integer utId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_travel.user_id
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_travel.t_id
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    private Integer tId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_travel
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_travel.ut_id
     *
     * @return the value of user_travel.ut_id
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    public Integer getUtId() {
        return utId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_travel.ut_id
     *
     * @param utId the value for user_travel.ut_id
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    public void setUtId(Integer utId) {
        this.utId = utId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_travel.user_id
     *
     * @return the value of user_travel.user_id
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_travel.user_id
     *
     * @param userId the value for user_travel.user_id
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_travel.t_id
     *
     * @return the value of user_travel.t_id
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    public Integer gettId() {
        return tId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_travel.t_id
     *
     * @param tId the value for user_travel.t_id
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    public void settId(Integer tId) {
        this.tId = tId;
    }
}