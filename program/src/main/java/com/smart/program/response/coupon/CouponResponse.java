package com.smart.program.response.coupon;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class CouponResponse {

    private Long couponId;
    private Byte couponType;
    private Timestamp couponTime;
    private BigDecimal couponCondition;
    private String restaurantName;
    private Byte isReceive;
    private String couponName;

    public CouponResponse() {
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public Byte getCouponType() {
        return couponType;
    }

    public void setCouponType(Byte couponType) {
        this.couponType = couponType;
    }

    public Timestamp getCouponTime() {
        return couponTime;
    }

    public void setCouponTime(Timestamp couponTime) {
        this.couponTime = couponTime;
    }

    public BigDecimal getCouponCondition() {
        return couponCondition;
    }

    public void setCouponCondition(BigDecimal couponCondition) {
        this.couponCondition = couponCondition;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public Byte getIsReceive() {
        return isReceive;
    }

    public void setIsReceive(Byte isReceive) {
        this.isReceive = isReceive;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }
}
