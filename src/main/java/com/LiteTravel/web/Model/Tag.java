package com.LiteTravel.web.Model;

public class Tag {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_tag.tag_id
     *
     * @mbg.generated Thu Dec 10 23:46:40 CST 2020
     */
    private Integer tagId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_tag.tag_name
     *
     * @mbg.generated Thu Dec 10 23:46:40 CST 2020
     */
    private String tagName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_tag.tag_id
     *
     * @return the value of travel_tag.tag_id
     *
     * @mbg.generated Thu Dec 10 23:46:40 CST 2020
     */
    public Integer getTagId() {
        return tagId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_tag.tag_id
     *
     * @param tagId the value for travel_tag.tag_id
     *
     * @mbg.generated Thu Dec 10 23:46:40 CST 2020
     */
    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_tag.tag_name
     *
     * @return the value of travel_tag.tag_name
     *
     * @mbg.generated Thu Dec 10 23:46:40 CST 2020
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_tag.tag_name
     *
     * @param tagName the value for travel_tag.tag_name
     *
     * @mbg.generated Thu Dec 10 23:46:40 CST 2020
     */
    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }
    @Override
    public String toString() {
        return tagName;
    }
}