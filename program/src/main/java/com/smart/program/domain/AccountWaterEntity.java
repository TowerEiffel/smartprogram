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
@Table(name = "account_water", schema = "smart", catalog = "")
public class AccountWaterEntity {
    private long waterId;
    private long user;
    private Long orderId;
    private byte waterType;
    private BigDecimal waterNum;
    private Timestamp wanterTime;
    private String memo;
    private Timestamp createTime;
    private Timestamp updateTime;
    private byte version;
    private byte dataStatus;

    @Id
    @Column(name = "water_id")
    public long getWaterId() {
        return waterId;
    }

    public void setWaterId(long waterId) {
        this.waterId = waterId;
    }

    @Basic
    @Column(name = "user")
    public long getUser() {
        return user;
    }

    public void setUser(long user) {
        this.user = user;
    }

    @Basic
    @Column(name = "order_id")
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "water_type")
    public byte getWaterType() {
        return waterType;
    }

    public void setWaterType(byte waterType) {
        this.waterType = waterType;
    }

    @Basic
    @Column(name = "water_num")
    public BigDecimal getWaterNum() {
        return waterNum;
    }

    public void setWaterNum(BigDecimal waterNum) {
        this.waterNum = waterNum;
    }

    @Basic
    @Column(name = "wanter_time")
    public Timestamp getWanterTime() {
        return wanterTime;
    }

    public void setWanterTime(Timestamp wanterTime) {
        this.wanterTime = wanterTime;
    }

    @Basic
    @Column(name = "memo")
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
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

        AccountWaterEntity that = (AccountWaterEntity) o;

        if (waterId != that.waterId) return false;
        if (user != that.user) return false;
        if (waterType != that.waterType) return false;
        if (version != that.version) return false;
        if (dataStatus != that.dataStatus) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (waterNum != null ? !waterNum.equals(that.waterNum) : that.waterNum != null) return false;
        if (wanterTime != null ? !wanterTime.equals(that.wanterTime) : that.wanterTime != null) return false;
        if (memo != null ? !memo.equals(that.memo) : that.memo != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (waterId ^ (waterId >>> 32));
        result = 31 * result + (int) (user ^ (user >>> 32));
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + (int) waterType;
        result = 31 * result + (waterNum != null ? waterNum.hashCode() : 0);
        result = 31 * result + (wanterTime != null ? wanterTime.hashCode() : 0);
        result = 31 * result + (memo != null ? memo.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (int) version;
        result = 31 * result + (int) dataStatus;
        return result;
    }
}
