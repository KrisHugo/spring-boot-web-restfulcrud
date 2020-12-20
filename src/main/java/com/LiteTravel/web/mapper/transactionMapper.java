package com.LiteTravel.web.mapper;

import com.LiteTravel.web.Model.transaction;
import com.LiteTravel.web.Model.transactionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface transactionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_transaction
     *
     * @mbg.generated Sun Dec 20 18:24:28 CST 2020
     */
    long countByExample(transactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_transaction
     *
     * @mbg.generated Sun Dec 20 18:24:28 CST 2020
     */
    int deleteByExample(transactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_transaction
     *
     * @mbg.generated Sun Dec 20 18:24:28 CST 2020
     */
    int deleteByPrimaryKey(Integer transactionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_transaction
     *
     * @mbg.generated Sun Dec 20 18:24:28 CST 2020
     */
    int insert(transaction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_transaction
     *
     * @mbg.generated Sun Dec 20 18:24:28 CST 2020
     */
    int insertSelective(transaction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_transaction
     *
     * @mbg.generated Sun Dec 20 18:24:28 CST 2020
     */
    List<transaction> selectByExample(transactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_transaction
     *
     * @mbg.generated Sun Dec 20 18:24:28 CST 2020
     */
    transaction selectByPrimaryKey(Integer transactionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_transaction
     *
     * @mbg.generated Sun Dec 20 18:24:28 CST 2020
     */
    int updateByExampleSelective(@Param("record") transaction record, @Param("example") transactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_transaction
     *
     * @mbg.generated Sun Dec 20 18:24:28 CST 2020
     */
    int updateByExample(@Param("record") transaction record, @Param("example") transactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_transaction
     *
     * @mbg.generated Sun Dec 20 18:24:28 CST 2020
     */
    int updateByPrimaryKeySelective(transaction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_transaction
     *
     * @mbg.generated Sun Dec 20 18:24:28 CST 2020
     */
    int updateByPrimaryKey(transaction record);
}