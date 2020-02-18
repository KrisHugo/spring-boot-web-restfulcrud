package com.LiteTravel.web.mapper;

import com.LiteTravel.web.Model.Blog;
import com.LiteTravel.web.Model.BlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_blog
     *
     * @mbg.generated Mon Feb 17 20:35:43 CST 2020
     */
    long countByExample(BlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_blog
     *
     * @mbg.generated Mon Feb 17 20:35:43 CST 2020
     */
    int deleteByExample(BlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_blog
     *
     * @mbg.generated Mon Feb 17 20:35:43 CST 2020
     */
    int deleteByPrimaryKey(Integer blogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_blog
     *
     * @mbg.generated Mon Feb 17 20:35:43 CST 2020
     */
    int insert(Blog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_blog
     *
     * @mbg.generated Mon Feb 17 20:35:43 CST 2020
     */
    int insertSelective(Blog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_blog
     *
     * @mbg.generated Mon Feb 17 20:35:43 CST 2020
     */
    List<Blog> selectByExampleWithBLOBs(BlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_blog
     *
     * @mbg.generated Mon Feb 17 20:35:43 CST 2020
     */
    List<Blog> selectByExample(BlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_blog
     *
     * @mbg.generated Mon Feb 17 20:35:43 CST 2020
     */
    Blog selectByPrimaryKey(Integer blogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_blog
     *
     * @mbg.generated Mon Feb 17 20:35:43 CST 2020
     */
    int updateByExampleSelective(@Param("record") Blog record, @Param("example") BlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_blog
     *
     * @mbg.generated Mon Feb 17 20:35:43 CST 2020
     */
    int updateByExampleWithBLOBs(@Param("record") Blog record, @Param("example") BlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_blog
     *
     * @mbg.generated Mon Feb 17 20:35:43 CST 2020
     */
    int updateByExample(@Param("record") Blog record, @Param("example") BlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_blog
     *
     * @mbg.generated Mon Feb 17 20:35:43 CST 2020
     */
    int updateByPrimaryKeySelective(Blog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_blog
     *
     * @mbg.generated Mon Feb 17 20:35:43 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(Blog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_blog
     *
     * @mbg.generated Mon Feb 17 20:35:43 CST 2020
     */
    int updateByPrimaryKey(Blog record);
}