package com.LiteTravel.web.mapper;

import com.LiteTravel.web.Model.Room;
import com.LiteTravel.web.Model.RoomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_hotel_room
     *
     * @mbg.generated Wed Dec 09 00:13:45 CST 2020
     */
    long countByExample(RoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_hotel_room
     *
     * @mbg.generated Wed Dec 09 00:13:45 CST 2020
     */
    int deleteByExample(RoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_hotel_room
     *
     * @mbg.generated Wed Dec 09 00:13:45 CST 2020
     */
    int deleteByPrimaryKey(Integer roomId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_hotel_room
     *
     * @mbg.generated Wed Dec 09 00:13:45 CST 2020
     */
    int insert(Room record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_hotel_room
     *
     * @mbg.generated Wed Dec 09 00:13:45 CST 2020
     */
    int insertSelective(Room record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_hotel_room
     *
     * @mbg.generated Wed Dec 09 00:13:45 CST 2020
     */
    List<Room> selectByExampleWithBLOBs(RoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_hotel_room
     *
     * @mbg.generated Wed Dec 09 00:13:45 CST 2020
     */
    List<Room> selectByExample(RoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_hotel_room
     *
     * @mbg.generated Wed Dec 09 00:13:45 CST 2020
     */
    Room selectByPrimaryKey(Integer roomId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_hotel_room
     *
     * @mbg.generated Wed Dec 09 00:13:45 CST 2020
     */
    int updateByExampleSelective(@Param("record") Room record, @Param("example") RoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_hotel_room
     *
     * @mbg.generated Wed Dec 09 00:13:45 CST 2020
     */
    int updateByExampleWithBLOBs(@Param("record") Room record, @Param("example") RoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_hotel_room
     *
     * @mbg.generated Wed Dec 09 00:13:45 CST 2020
     */
    int updateByExample(@Param("record") Room record, @Param("example") RoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_hotel_room
     *
     * @mbg.generated Wed Dec 09 00:13:45 CST 2020
     */
    int updateByPrimaryKeySelective(Room record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_hotel_room
     *
     * @mbg.generated Wed Dec 09 00:13:45 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(Room record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_hotel_room
     *
     * @mbg.generated Wed Dec 09 00:13:45 CST 2020
     */
    int updateByPrimaryKey(Room record);
}