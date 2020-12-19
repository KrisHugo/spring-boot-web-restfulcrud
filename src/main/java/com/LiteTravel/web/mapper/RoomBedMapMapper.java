package com.LiteTravel.web.mapper;

import com.LiteTravel.web.Model.RoomBedMap;
import com.LiteTravel.web.Model.RoomBedMapExample;
import com.LiteTravel.web.Model.RoomBedMapKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomBedMapMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_room_bed
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    long countByExample(RoomBedMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_room_bed
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    int deleteByExample(RoomBedMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_room_bed
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    int deleteByPrimaryKey(RoomBedMapKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_room_bed
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    int insert(RoomBedMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_room_bed
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    int insertSelective(RoomBedMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_room_bed
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    List<RoomBedMap> selectByExample(RoomBedMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_room_bed
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    RoomBedMap selectByPrimaryKey(RoomBedMapKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_room_bed
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    int updateByExampleSelective(@Param("record") RoomBedMap record, @Param("example") RoomBedMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_room_bed
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    int updateByExample(@Param("record") RoomBedMap record, @Param("example") RoomBedMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_room_bed
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    int updateByPrimaryKeySelective(RoomBedMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_room_bed
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    int updateByPrimaryKey(RoomBedMap record);
}