package com.LiteTravel.web.Model;

public class userMoney {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_user_money.user_id
     *
     * @mbg.generated Mon Dec 21 23:41:42 CST 2020
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_user_money.money
     *
     * @mbg.generated Mon Dec 21 23:41:42 CST 2020
     */
    private Float money;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_user_money.user_id
     *
     * @return the value of travel_user_money.user_id
     *
     * @mbg.generated Mon Dec 21 23:41:42 CST 2020
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_user_money.user_id
     *
     * @param userId the value for travel_user_money.user_id
     *
     * @mbg.generated Mon Dec 21 23:41:42 CST 2020
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_user_money.money
     *
     * @return the value of travel_user_money.money
     *
     * @mbg.generated Mon Dec 21 23:41:42 CST 2020
     */
    public Float getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_user_money.money
     *
     * @param money the value for travel_user_money.money
     *
     * @mbg.generated Mon Dec 21 23:41:42 CST 2020
     */
    public void setMoney(Float money) {
        this.money = money;
    }
}