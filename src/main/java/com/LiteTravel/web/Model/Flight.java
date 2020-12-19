package com.LiteTravel.web.Model;

import java.util.Date;

public class Flight {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_flight.flight_id
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    private Integer flightId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_flight.user_id
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_flight.flight_level
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    private Integer flightLevel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_flight.flight_from
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    private Integer flightFrom;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_flight.flight_to
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    private Integer flightTo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_flight.flight_depart
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    private Date flightDepart;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_flight.flight_arrived
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    private Date flightArrived;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_flight.flight_total
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    private Float flightTotal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_flight.flight_seats
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    private Integer flightSeats;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_flight.flight_status
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    private Integer flightStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_flight.flight_id
     *
     * @return the value of travel_flight.flight_id
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    public Integer getFlightId() {
        return flightId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_flight.flight_id
     *
     * @param flightId the value for travel_flight.flight_id
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_flight.user_id
     *
     * @return the value of travel_flight.user_id
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_flight.user_id
     *
     * @param userId the value for travel_flight.user_id
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_flight.flight_level
     *
     * @return the value of travel_flight.flight_level
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    public Integer getFlightLevel() {
        return flightLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_flight.flight_level
     *
     * @param flightLevel the value for travel_flight.flight_level
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    public void setFlightLevel(Integer flightLevel) {
        this.flightLevel = flightLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_flight.flight_from
     *
     * @return the value of travel_flight.flight_from
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    public Integer getFlightFrom() {
        return flightFrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_flight.flight_from
     *
     * @param flightFrom the value for travel_flight.flight_from
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    public void setFlightFrom(Integer flightFrom) {
        this.flightFrom = flightFrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_flight.flight_to
     *
     * @return the value of travel_flight.flight_to
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    public Integer getFlightTo() {
        return flightTo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_flight.flight_to
     *
     * @param flightTo the value for travel_flight.flight_to
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    public void setFlightTo(Integer flightTo) {
        this.flightTo = flightTo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_flight.flight_depart
     *
     * @return the value of travel_flight.flight_depart
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    public Date getFlightDepart() {
        return flightDepart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_flight.flight_depart
     *
     * @param flightDepart the value for travel_flight.flight_depart
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    public void setFlightDepart(Date flightDepart) {
        this.flightDepart = flightDepart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_flight.flight_arrived
     *
     * @return the value of travel_flight.flight_arrived
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    public Date getFlightArrived() {
        return flightArrived;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_flight.flight_arrived
     *
     * @param flightArrived the value for travel_flight.flight_arrived
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    public void setFlightArrived(Date flightArrived) {
        this.flightArrived = flightArrived;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_flight.flight_total
     *
     * @return the value of travel_flight.flight_total
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    public Float getFlightTotal() {
        return flightTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_flight.flight_total
     *
     * @param flightTotal the value for travel_flight.flight_total
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    public void setFlightTotal(Float flightTotal) {
        this.flightTotal = flightTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_flight.flight_seats
     *
     * @return the value of travel_flight.flight_seats
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    public Integer getFlightSeats() {
        return flightSeats;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_flight.flight_seats
     *
     * @param flightSeats the value for travel_flight.flight_seats
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    public void setFlightSeats(Integer flightSeats) {
        this.flightSeats = flightSeats;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_flight.flight_status
     *
     * @return the value of travel_flight.flight_status
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    public Integer getFlightStatus() {
        return flightStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_flight.flight_status
     *
     * @param flightStatus the value for travel_flight.flight_status
     *
     * @mbg.generated Sat Dec 19 17:33:10 CST 2020
     */
    public void setFlightStatus(Integer flightStatus) {
        this.flightStatus = flightStatus;
    }
}