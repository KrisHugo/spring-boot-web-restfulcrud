package com.LiteTravel.web.mapper;

import com.LiteTravel.web.Model.Tag;
import com.LiteTravel.web.Model.TagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TagMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_tag
     *
     * @mbg.generated Thu Dec 10 23:46:40 CST 2020
     */
    long countByExample(TagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_tag
     *
     * @mbg.generated Thu Dec 10 23:46:40 CST 2020
     */
    int deleteByExample(TagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_tag
     *
     * @mbg.generated Thu Dec 10 23:46:40 CST 2020
     */
    int deleteByPrimaryKey(Integer tagId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_tag
     *
     * @mbg.generated Thu Dec 10 23:46:40 CST 2020
     */
    int insert(Tag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_tag
     *
     * @mbg.generated Thu Dec 10 23:46:40 CST 2020
     */
    int insertSelective(Tag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_tag
     *
     * @mbg.generated Thu Dec 10 23:46:40 CST 2020
     */
    List<Tag> selectByExample(TagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_tag
     *
     * @mbg.generated Thu Dec 10 23:46:40 CST 2020
     */
    Tag selectByPrimaryKey(Integer tagId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_tag
     *
     * @mbg.generated Thu Dec 10 23:46:40 CST 2020
     */
    int updateByExampleSelective(@Param("record") Tag record, @Param("example") TagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_tag
     *
     * @mbg.generated Thu Dec 10 23:46:40 CST 2020
     */
    int updateByExample(@Param("record") Tag record, @Param("example") TagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_tag
     *
     * @mbg.generated Thu Dec 10 23:46:40 CST 2020
     */
    int updateByPrimaryKeySelective(Tag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_tag
     *
     * @mbg.generated Thu Dec 10 23:46:40 CST 2020
     */
    int updateByPrimaryKey(Tag record);
}