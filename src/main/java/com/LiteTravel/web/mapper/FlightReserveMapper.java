package com.LiteTravel.web.mapper;

import com.LiteTravel.web.Model.FlightReserve;
import com.LiteTravel.web.Model.FlightReserveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlightReserveMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_flight_reserve
     *
     * @mbg.generated Mon Dec 21 23:41:42 CST 2020
     */
    long countByExample(FlightReserveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_flight_reserve
     *
     * @mbg.generated Mon Dec 21 23:41:42 CST 2020
     */
    int deleteByExample(FlightReserveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_flight_reserve
     *
     * @mbg.generated Mon Dec 21 23:41:42 CST 2020
     */
    int deleteByPrimaryKey(Integer reserveId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_flight_reserve
     *
     * @mbg.generated Mon Dec 21 23:41:42 CST 2020
     */
    int insert(FlightReserve record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_flight_reserve
     *
     * @mbg.generated Mon Dec 21 23:41:42 CST 2020
     */
    int insertSelective(FlightReserve record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_flight_reserve
     *
     * @mbg.generated Mon Dec 21 23:41:42 CST 2020
     */
    List<FlightReserve> selectByExampleWithBLOBs(FlightReserveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_flight_reserve
     *
     * @mbg.generated Mon Dec 21 23:41:42 CST 2020
     */
    List<FlightReserve> selectByExample(FlightReserveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_flight_reserve
     *
     * @mbg.generated Mon Dec 21 23:41:42 CST 2020
     */
    FlightReserve selectByPrimaryKey(Integer reserveId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_flight_reserve
     *
     * @mbg.generated Mon Dec 21 23:41:42 CST 2020
     */
    int updateByExampleSelective(@Param("record") FlightReserve record, @Param("example") FlightReserveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_flight_reserve
     *
     * @mbg.generated Mon Dec 21 23:41:42 CST 2020
     */
    int updateByExampleWithBLOBs(@Param("record") FlightReserve record, @Param("example") FlightReserveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_flight_reserve
     *
     * @mbg.generated Mon Dec 21 23:41:42 CST 2020
     */
    int updateByExample(@Param("record") FlightReserve record, @Param("example") FlightReserveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_flight_reserve
     *
     * @mbg.generated Mon Dec 21 23:41:42 CST 2020
     */
    int updateByPrimaryKeySelective(FlightReserve record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_flight_reserve
     *
     * @mbg.generated Mon Dec 21 23:41:42 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(FlightReserve record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_flight_reserve
     *
     * @mbg.generated Mon Dec 21 23:41:42 CST 2020
     */
    int updateByPrimaryKey(FlightReserve record);
}