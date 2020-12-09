package com.LiteTravel.web.mapper;

import com.LiteTravel.web.Model.BlogTagMap;
import com.LiteTravel.web.Model.BlogTagMapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogTagMapMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_blog_tags
     *
     * @mbg.generated Wed Dec 09 00:13:45 CST 2020
     */
    long countByExample(BlogTagMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_blog_tags
     *
     * @mbg.generated Wed Dec 09 00:13:45 CST 2020
     */
    int deleteByExample(BlogTagMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_blog_tags
     *
     * @mbg.generated Wed Dec 09 00:13:45 CST 2020
     */
    int deleteByPrimaryKey(Integer tagId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_blog_tags
     *
     * @mbg.generated Wed Dec 09 00:13:45 CST 2020
     */
    int insert(BlogTagMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_blog_tags
     *
     * @mbg.generated Wed Dec 09 00:13:45 CST 2020
     */
    int insertSelective(BlogTagMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_blog_tags
     *
     * @mbg.generated Wed Dec 09 00:13:45 CST 2020
     */
    List<BlogTagMap> selectByExample(BlogTagMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_blog_tags
     *
     * @mbg.generated Wed Dec 09 00:13:45 CST 2020
     */
    BlogTagMap selectByPrimaryKey(Integer tagId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_blog_tags
     *
     * @mbg.generated Wed Dec 09 00:13:45 CST 2020
     */
    int updateByExampleSelective(@Param("record") BlogTagMap record, @Param("example") BlogTagMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_blog_tags
     *
     * @mbg.generated Wed Dec 09 00:13:45 CST 2020
     */
    int updateByExample(@Param("record") BlogTagMap record, @Param("example") BlogTagMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_blog_tags
     *
     * @mbg.generated Wed Dec 09 00:13:45 CST 2020
     */
    int updateByPrimaryKeySelective(BlogTagMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_blog_tags
     *
     * @mbg.generated Wed Dec 09 00:13:45 CST 2020
     */
    int updateByPrimaryKey(BlogTagMap record);
}