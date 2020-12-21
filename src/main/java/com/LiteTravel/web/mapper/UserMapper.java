package com.LiteTravel.web.mapper;

import com.LiteTravel.web.Model.User;
import com.LiteTravel.web.Model.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_account
     *
     * @mbg.generated Mon Dec 21 23:41:42 CST 2020
     */
    long countByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_account
     *
     * @mbg.generated Mon Dec 21 23:41:42 CST 2020
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_account
     *
     * @mbg.generated Mon Dec 21 23:41:42 CST 2020
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_account
     *
     * @mbg.generated Mon Dec 21 23:41:42 CST 2020
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_account
     *
     * @mbg.generated Mon Dec 21 23:41:42 CST 2020
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_account
     *
     * @mbg.generated Mon Dec 21 23:41:42 CST 2020
     */
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_account
     *
     * @mbg.generated Mon Dec 21 23:41:42 CST 2020
     */
    User selectByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_account
     *
     * @mbg.generated Mon Dec 21 23:41:42 CST 2020
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_account
     *
     * @mbg.generated Mon Dec 21 23:41:42 CST 2020
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_account
     *
     * @mbg.generated Mon Dec 21 23:41:42 CST 2020
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_account
     *
     * @mbg.generated Mon Dec 21 23:41:42 CST 2020
     */
    int updateByPrimaryKey(User record);
}