package com.LiteTravel.web.mapper;

import com.LiteTravel.web.Model.userAuthority;
import com.LiteTravel.web.Model.userAuthorityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface userAuthorityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_authority
     *
     * @mbg.generated Sun Dec 20 16:52:53 CST 2020
     */
    long countByExample(userAuthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_authority
     *
     * @mbg.generated Sun Dec 20 16:52:53 CST 2020
     */
    int deleteByExample(userAuthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_authority
     *
     * @mbg.generated Sun Dec 20 16:52:53 CST 2020
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_authority
     *
     * @mbg.generated Sun Dec 20 16:52:53 CST 2020
     */
    int insert(userAuthority record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_authority
     *
     * @mbg.generated Sun Dec 20 16:52:53 CST 2020
     */
    int insertSelective(userAuthority record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_authority
     *
     * @mbg.generated Sun Dec 20 16:52:53 CST 2020
     */
    List<userAuthority> selectByExample(userAuthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_authority
     *
     * @mbg.generated Sun Dec 20 16:52:53 CST 2020
     */
    userAuthority selectByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_authority
     *
     * @mbg.generated Sun Dec 20 16:52:53 CST 2020
     */
    int updateByExampleSelective(@Param("record") userAuthority record, @Param("example") userAuthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_authority
     *
     * @mbg.generated Sun Dec 20 16:52:53 CST 2020
     */
    int updateByExample(@Param("record") userAuthority record, @Param("example") userAuthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_authority
     *
     * @mbg.generated Sun Dec 20 16:52:53 CST 2020
     */
    int updateByPrimaryKeySelective(userAuthority record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_authority
     *
     * @mbg.generated Sun Dec 20 16:52:53 CST 2020
     */
    int updateByPrimaryKey(userAuthority record);
}