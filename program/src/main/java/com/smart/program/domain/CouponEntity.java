package com.smart.program.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * hello.activeEntity
 * Created by baihe
 * ON 2018/4/19.
 */
@Entity
@Table(name = "coupon", schema = "smart", catalog = "")
public class CouponEntity {
    private long id;
    private int couponNum;
    private byte couponType;
    private String couponImg;
    private BigDecimal couponSize;
    private BigDecimal couponCondition;
    private String couponMsg;
    private Timestamp couponTime;
    private Timestamp createTime;
    private Timestamp updateTime;
    private byte version;
    private byte dataStatus;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "coupon_num")
    public int getCouponNum() {
        return couponNum;
    }

    public void setCouponNum(int couponNum) {
        this.couponNum = couponNum;
    }

    @Basic
    @Column(name = "coupon_type")
    public byte getCouponType() {
        return couponType;
    }

    public void setCouponType(byte couponType) {
        this.couponType = couponType;
    }

    @Basic
    @Column(name = "coupon_img")
    public String getCouponImg() {
        return couponImg;
    }

    public void setCouponImg(String couponImg) {
        this.couponImg = couponImg;
    }

    @Basic
    @Column(name = "coupon_size")
    public BigDecimal getCouponSize() {
        return couponSize;
    }

    public void setCouponSize(BigDecimal couponSize) {
        this.couponSize = couponSize;
    }

    @Basic
    @Column(name = "coupon_condition")
    public BigDecimal getCouponCondition() {
        return couponCondition;
    }

    public void setCouponCondition(BigDecimal couponCondition) {
        this.couponCondition = couponCondition;
    }

    @Basic
    @Column(name = "coupon_msg")
    public String getCouponMsg() {
        return couponMsg;
    }

    public void setCouponMsg(String couponMsg) {
        this.couponMsg = couponMsg;
    }

    @Basic
    @Column(name = "coupon_time")
    public Timestamp getCouponTime() {
        return couponTime;
    }

    public void setCouponTime(Timestamp couponTime) {
        this.couponTime = couponTime;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "version")
    public byte getVersion() {
        return version;
    }

    public void setVersion(byte version) {
        this.version = version;
    }

    @Basic
    @Column(name = "data_status")
    public byte getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(byte dataStatus) {
        this.dataStatus = dataStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CouponEntity that = (CouponEntity) o;

        if (id != that.id) return false;
        if (couponNum != that.couponNum) return false;
        if (couponType != that.couponType) return false;
        if (version != that.version) return false;
        if (dataStatus != that.dataStatus) return false;
        if (couponImg != null ? !couponImg.equals(that.couponImg) : that.couponImg != null) return false;
        if (couponSize != null ? !couponSize.equals(that.couponSize) : that.couponSize != null) return false;
        if (couponCondition != null ? !couponCondition.equals(that.couponCondition) : that.couponCondition != null)
            return false;
        if (couponMsg != null ? !couponMsg.equals(that.couponMsg) : that.couponMsg != null) return false;
        if (couponTime != null ? !couponTime.equals(that.couponTime) : that.couponTime != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + couponNum;
        result = 31 * result + (int) couponType;
        result = 31 * result + (couponImg != null ? couponImg.hashCode() : 0);
        result = 31 * result + (couponSize != null ? couponSize.hashCode() : 0);
        result = 31 * result + (couponCondition != null ? couponCondition.hashCode() : 0);
        result = 31 * result + (couponMsg != null ? couponMsg.hashCode() : 0);
        result = 31 * result + (couponTime != null ? couponTime.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (int) version;
        result = 31 * result + (int) dataStatus;
        return result;
    }
}
