package com.itqf.dtboot.entity;

import java.io.Serializable;
import java.util.Date;

public class ScheduleJob implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.o_id
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    private Integer oId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.o_userid
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    private Integer oUserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.o_productid
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    private Integer oProductid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.o_productnum
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    private Integer oProductnum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.o_status
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    private Integer oStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.o_payway
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    private String oPayway;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.o_starttime
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    private Date oStarttime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.o_endtime
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    private Date oEndtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.o_message
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    private String oMessage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table order
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.o_id
     *
     * @return the value of order.o_id
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    public Integer getoId() {
        return oId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.o_id
     *
     * @param oId the value for order.o_id
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    public void setoId(Integer oId) {
        this.oId = oId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.o_userid
     *
     * @return the value of order.o_userid
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    public Integer getoUserid() {
        return oUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.o_userid
     *
     * @param oUserid the value for order.o_userid
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    public void setoUserid(Integer oUserid) {
        this.oUserid = oUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.o_productid
     *
     * @return the value of order.o_productid
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    public Integer getoProductid() {
        return oProductid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.o_productid
     *
     * @param oProductid the value for order.o_productid
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    public void setoProductid(Integer oProductid) {
        this.oProductid = oProductid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.o_productnum
     *
     * @return the value of order.o_productnum
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    public Integer getoProductnum() {
        return oProductnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.o_productnum
     *
     * @param oProductnum the value for order.o_productnum
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    public void setoProductnum(Integer oProductnum) {
        this.oProductnum = oProductnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.o_status
     *
     * @return the value of order.o_status
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    public Integer getoStatus() {
        return oStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.o_status
     *
     * @param oStatus the value for order.o_status
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    public void setoStatus(Integer oStatus) {
        this.oStatus = oStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.o_payway
     *
     * @return the value of order.o_payway
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    public String getoPayway() {
        return oPayway;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.o_payway
     *
     * @param oPayway the value for order.o_payway
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    public void setoPayway(String oPayway) {
        this.oPayway = oPayway == null ? null : oPayway.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.o_starttime
     *
     * @return the value of order.o_starttime
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    public Date getoStarttime() {
        return oStarttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.o_starttime
     *
     * @param oStarttime the value for order.o_starttime
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    public void setoStarttime(Date oStarttime) {
        this.oStarttime = oStarttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.o_endtime
     *
     * @return the value of order.o_endtime
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    public Date getoEndtime() {
        return oEndtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.o_endtime
     *
     * @param oEndtime the value for order.o_endtime
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    public void setoEndtime(Date oEndtime) {
        this.oEndtime = oEndtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.o_message
     *
     * @return the value of order.o_message
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    public String getoMessage() {
        return oMessage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.o_message
     *
     * @param oMessage the value for order.o_message
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    public void setoMessage(String oMessage) {
        this.oMessage = oMessage == null ? null : oMessage.trim();
    }
}