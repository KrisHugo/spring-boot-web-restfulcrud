package com.LiteTravel.web.Model;

import java.util.ArrayList;
import java.util.List;

public class userAuthorityExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table travel_user_authority
     *
     * @mbg.generated Mon Dec 21 21:33:00 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table travel_user_authority
     *
     * @mbg.generated Mon Dec 21 21:33:00 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table travel_user_authority
     *
     * @mbg.generated Mon Dec 21 21:33:00 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_authority
     *
     * @mbg.generated Mon Dec 21 21:33:00 CST 2020
     */
    public userAuthorityExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_authority
     *
     * @mbg.generated Mon Dec 21 21:33:00 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_authority
     *
     * @mbg.generated Mon Dec 21 21:33:00 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_authority
     *
     * @mbg.generated Mon Dec 21 21:33:00 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_authority
     *
     * @mbg.generated Mon Dec 21 21:33:00 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_authority
     *
     * @mbg.generated Mon Dec 21 21:33:00 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_authority
     *
     * @mbg.generated Mon Dec 21 21:33:00 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_authority
     *
     * @mbg.generated Mon Dec 21 21:33:00 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_authority
     *
     * @mbg.generated Mon Dec 21 21:33:00 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_authority
     *
     * @mbg.generated Mon Dec 21 21:33:00 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table travel_user_authority
     *
     * @mbg.generated Mon Dec 21 21:33:00 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table travel_user_authority
     *
     * @mbg.generated Mon Dec 21 21:33:00 CST 2020
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andAuthorityLevelIsNull() {
            addCriterion("authority_level is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityLevelIsNotNull() {
            addCriterion("authority_level is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityLevelEqualTo(Boolean value) {
            addCriterion("authority_level =", value, "authorityLevel");
            return (Criteria) this;
        }

        public Criteria andAuthorityLevelNotEqualTo(Boolean value) {
            addCriterion("authority_level <>", value, "authorityLevel");
            return (Criteria) this;
        }

        public Criteria andAuthorityLevelGreaterThan(Boolean value) {
            addCriterion("authority_level >", value, "authorityLevel");
            return (Criteria) this;
        }

        public Criteria andAuthorityLevelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("authority_level >=", value, "authorityLevel");
            return (Criteria) this;
        }

        public Criteria andAuthorityLevelLessThan(Boolean value) {
            addCriterion("authority_level <", value, "authorityLevel");
            return (Criteria) this;
        }

        public Criteria andAuthorityLevelLessThanOrEqualTo(Boolean value) {
            addCriterion("authority_level <=", value, "authorityLevel");
            return (Criteria) this;
        }

        public Criteria andAuthorityLevelIn(List<Boolean> values) {
            addCriterion("authority_level in", values, "authorityLevel");
            return (Criteria) this;
        }

        public Criteria andAuthorityLevelNotIn(List<Boolean> values) {
            addCriterion("authority_level not in", values, "authorityLevel");
            return (Criteria) this;
        }

        public Criteria andAuthorityLevelBetween(Boolean value1, Boolean value2) {
            addCriterion("authority_level between", value1, value2, "authorityLevel");
            return (Criteria) this;
        }

        public Criteria andAuthorityLevelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("authority_level not between", value1, value2, "authorityLevel");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityIsNull() {
            addCriterion("user_authority is null");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityIsNotNull() {
            addCriterion("user_authority is not null");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityEqualTo(Boolean value) {
            addCriterion("user_authority =", value, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityNotEqualTo(Boolean value) {
            addCriterion("user_authority <>", value, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityGreaterThan(Boolean value) {
            addCriterion("user_authority >", value, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityGreaterThanOrEqualTo(Boolean value) {
            addCriterion("user_authority >=", value, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityLessThan(Boolean value) {
            addCriterion("user_authority <", value, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityLessThanOrEqualTo(Boolean value) {
            addCriterion("user_authority <=", value, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityIn(List<Boolean> values) {
            addCriterion("user_authority in", values, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityNotIn(List<Boolean> values) {
            addCriterion("user_authority not in", values, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityBetween(Boolean value1, Boolean value2) {
            addCriterion("user_authority between", value1, value2, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityNotBetween(Boolean value1, Boolean value2) {
            addCriterion("user_authority not between", value1, value2, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andHotelAuthorityIsNull() {
            addCriterion("hotel_authority is null");
            return (Criteria) this;
        }

        public Criteria andHotelAuthorityIsNotNull() {
            addCriterion("hotel_authority is not null");
            return (Criteria) this;
        }

        public Criteria andHotelAuthorityEqualTo(Boolean value) {
            addCriterion("hotel_authority =", value, "hotelAuthority");
            return (Criteria) this;
        }

        public Criteria andHotelAuthorityNotEqualTo(Boolean value) {
            addCriterion("hotel_authority <>", value, "hotelAuthority");
            return (Criteria) this;
        }

        public Criteria andHotelAuthorityGreaterThan(Boolean value) {
            addCriterion("hotel_authority >", value, "hotelAuthority");
            return (Criteria) this;
        }

        public Criteria andHotelAuthorityGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hotel_authority >=", value, "hotelAuthority");
            return (Criteria) this;
        }

        public Criteria andHotelAuthorityLessThan(Boolean value) {
            addCriterion("hotel_authority <", value, "hotelAuthority");
            return (Criteria) this;
        }

        public Criteria andHotelAuthorityLessThanOrEqualTo(Boolean value) {
            addCriterion("hotel_authority <=", value, "hotelAuthority");
            return (Criteria) this;
        }

        public Criteria andHotelAuthorityIn(List<Boolean> values) {
            addCriterion("hotel_authority in", values, "hotelAuthority");
            return (Criteria) this;
        }

        public Criteria andHotelAuthorityNotIn(List<Boolean> values) {
            addCriterion("hotel_authority not in", values, "hotelAuthority");
            return (Criteria) this;
        }

        public Criteria andHotelAuthorityBetween(Boolean value1, Boolean value2) {
            addCriterion("hotel_authority between", value1, value2, "hotelAuthority");
            return (Criteria) this;
        }

        public Criteria andHotelAuthorityNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hotel_authority not between", value1, value2, "hotelAuthority");
            return (Criteria) this;
        }

        public Criteria andFlightAuthorityIsNull() {
            addCriterion("flight_authority is null");
            return (Criteria) this;
        }

        public Criteria andFlightAuthorityIsNotNull() {
            addCriterion("flight_authority is not null");
            return (Criteria) this;
        }

        public Criteria andFlightAuthorityEqualTo(Boolean value) {
            addCriterion("flight_authority =", value, "flightAuthority");
            return (Criteria) this;
        }

        public Criteria andFlightAuthorityNotEqualTo(Boolean value) {
            addCriterion("flight_authority <>", value, "flightAuthority");
            return (Criteria) this;
        }

        public Criteria andFlightAuthorityGreaterThan(Boolean value) {
            addCriterion("flight_authority >", value, "flightAuthority");
            return (Criteria) this;
        }

        public Criteria andFlightAuthorityGreaterThanOrEqualTo(Boolean value) {
            addCriterion("flight_authority >=", value, "flightAuthority");
            return (Criteria) this;
        }

        public Criteria andFlightAuthorityLessThan(Boolean value) {
            addCriterion("flight_authority <", value, "flightAuthority");
            return (Criteria) this;
        }

        public Criteria andFlightAuthorityLessThanOrEqualTo(Boolean value) {
            addCriterion("flight_authority <=", value, "flightAuthority");
            return (Criteria) this;
        }

        public Criteria andFlightAuthorityIn(List<Boolean> values) {
            addCriterion("flight_authority in", values, "flightAuthority");
            return (Criteria) this;
        }

        public Criteria andFlightAuthorityNotIn(List<Boolean> values) {
            addCriterion("flight_authority not in", values, "flightAuthority");
            return (Criteria) this;
        }

        public Criteria andFlightAuthorityBetween(Boolean value1, Boolean value2) {
            addCriterion("flight_authority between", value1, value2, "flightAuthority");
            return (Criteria) this;
        }

        public Criteria andFlightAuthorityNotBetween(Boolean value1, Boolean value2) {
            addCriterion("flight_authority not between", value1, value2, "flightAuthority");
            return (Criteria) this;
        }

        public Criteria andGuideAuthorityIsNull() {
            addCriterion("guide_authority is null");
            return (Criteria) this;
        }

        public Criteria andGuideAuthorityIsNotNull() {
            addCriterion("guide_authority is not null");
            return (Criteria) this;
        }

        public Criteria andGuideAuthorityEqualTo(Boolean value) {
            addCriterion("guide_authority =", value, "guideAuthority");
            return (Criteria) this;
        }

        public Criteria andGuideAuthorityNotEqualTo(Boolean value) {
            addCriterion("guide_authority <>", value, "guideAuthority");
            return (Criteria) this;
        }

        public Criteria andGuideAuthorityGreaterThan(Boolean value) {
            addCriterion("guide_authority >", value, "guideAuthority");
            return (Criteria) this;
        }

        public Criteria andGuideAuthorityGreaterThanOrEqualTo(Boolean value) {
            addCriterion("guide_authority >=", value, "guideAuthority");
            return (Criteria) this;
        }

        public Criteria andGuideAuthorityLessThan(Boolean value) {
            addCriterion("guide_authority <", value, "guideAuthority");
            return (Criteria) this;
        }

        public Criteria andGuideAuthorityLessThanOrEqualTo(Boolean value) {
            addCriterion("guide_authority <=", value, "guideAuthority");
            return (Criteria) this;
        }

        public Criteria andGuideAuthorityIn(List<Boolean> values) {
            addCriterion("guide_authority in", values, "guideAuthority");
            return (Criteria) this;
        }

        public Criteria andGuideAuthorityNotIn(List<Boolean> values) {
            addCriterion("guide_authority not in", values, "guideAuthority");
            return (Criteria) this;
        }

        public Criteria andGuideAuthorityBetween(Boolean value1, Boolean value2) {
            addCriterion("guide_authority between", value1, value2, "guideAuthority");
            return (Criteria) this;
        }

        public Criteria andGuideAuthorityNotBetween(Boolean value1, Boolean value2) {
            addCriterion("guide_authority not between", value1, value2, "guideAuthority");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table travel_user_authority
     *
     * @mbg.generated do_not_delete_during_merge Mon Dec 21 21:33:00 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table travel_user_authority
     *
     * @mbg.generated Mon Dec 21 21:33:00 CST 2020
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}