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
@Table(name = "discount", schema = "smart", catalog = "")
public class DiscountEntity {
    private long id;
    private byte discountType;
    private BigDecimal discountCondition;
    private BigDecimal discountSize;
    private String memo;
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
    @Column(name = "discount_type")
    public byte getDiscountType() {
        return discountType;
    }

    public void setDiscountType(byte discountType) {
        this.discountType = discountType;
    }

    @Basic
    @Column(name = "discount_condition")
    public BigDecimal getDiscountCondition() {
        return discountCondition;
    }

    public void setDiscountCondition(BigDecimal discountCondition) {
        this.discountCondition = discountCondition;
    }

    @Basic
    @Column(name = "discount_size")
    public BigDecimal getDiscountSize() {
        return discountSize;
    }

    public void setDiscountSize(BigDecimal discountSize) {
        this.discountSize = discountSize;
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

        DiscountEntity that = (DiscountEntity) o;

        if (id != that.id) return false;
        if (discountType != that.discountType) return false;
        if (version != that.version) return false;
        if (dataStatus != that.dataStatus) return false;
        if (discountCondition != null ? !discountCondition.equals(that.discountCondition) : that.discountCondition != null)
            return false;
        if (discountSize != null ? !discountSize.equals(that.discountSize) : that.discountSize != null) return false;
        if (memo != null ? !memo.equals(that.memo) : that.memo != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) discountType;
        result = 31 * result + (discountCondition != null ? discountCondition.hashCode() : 0);
        result = 31 * result + (discountSize != null ? discountSize.hashCode() : 0);
        result = 31 * result + (memo != null ? memo.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (int) version;
        result = 31 * result + (int) dataStatus;
        return result;
    }
}
