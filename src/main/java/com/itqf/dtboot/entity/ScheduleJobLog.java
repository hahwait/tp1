package com.itqf.dtboot.entity;

import java.io.Serializable;

public class ScheduleJobLog implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phototeam.team_id
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    private Integer teamId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phototeam.team_name
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    private String teamName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phototeam.team_price
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    private Double teamPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phototeam.team_score
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    private Double teamScore;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table phototeam
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phototeam.team_id
     *
     * @return the value of phototeam.team_id
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    public Integer getTeamId() {
        return teamId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phototeam.team_id
     *
     * @param teamId the value for phototeam.team_id
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phototeam.team_name
     *
     * @return the value of phototeam.team_name
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phototeam.team_name
     *
     * @param teamName the value for phototeam.team_name
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName == null ? null : teamName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phototeam.team_price
     *
     * @return the value of phototeam.team_price
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    public Double getTeamPrice() {
        return teamPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phototeam.team_price
     *
     * @param teamPrice the value for phototeam.team_price
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    public void setTeamPrice(Double teamPrice) {
        this.teamPrice = teamPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phototeam.team_score
     *
     * @return the value of phototeam.team_score
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    public Double getTeamScore() {
        return teamScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phototeam.team_score
     *
     * @param teamScore the value for phototeam.team_score
     *
     * @mbggenerated Thu Jan 24 10:07:32 CST 2019
     */
    public void setTeamScore(Double teamScore) {
        this.teamScore = teamScore;
    }
}