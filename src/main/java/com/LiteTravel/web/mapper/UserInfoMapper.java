package com.LiteTravel.web.mapper;

import com.LiteTravel.web.Model.UserInfo;
import com.LiteTravel.web.Model.UserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_info
     *
     * @mbg.generated Mon Feb 17 20:35:43 CST 2020
     */
    long countByExample(UserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_info
     *
     * @mbg.generated Mon Feb 17 20:35:43 CST 2020
     */
    int deleteByExample(UserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_info
     *
     * @mbg.generated Mon Feb 17 20:35:43 CST 2020
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_info
     *
     * @mbg.generated Mon Feb 17 20:35:43 CST 2020
     */
    int insert(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_info
     *
     * @mbg.generated Mon Feb 17 20:35:43 CST 2020
     */
    int insertSelective(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_info
     *
     * @mbg.generated Mon Feb 17 20:35:43 CST 2020
     */
    List<UserInfo> selectByExample(UserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_info
     *
     * @mbg.generated Mon Feb 17 20:35:43 CST 2020
     */
    UserInfo selectByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_info
     *
     * @mbg.generated Mon Feb 17 20:35:43 CST 2020
     */
    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_info
     *
     * @mbg.generated Mon Feb 17 20:35:43 CST 2020
     */
    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_info
     *
     * @mbg.generated Mon Feb 17 20:35:43 CST 2020
     */
    int updateByPrimaryKeySelective(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_info
     *
     * @mbg.generated Mon Feb 17 20:35:43 CST 2020
     */
    int updateByPrimaryKey(UserInfo record);
}