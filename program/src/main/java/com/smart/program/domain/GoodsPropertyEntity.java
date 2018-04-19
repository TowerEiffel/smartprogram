package com.smart.program.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * hello.activeEntity
 * Created by baihe
 * ON 2018/4/19.
 */
@Entity
@Table(name = "goods_property", schema = "smart", catalog = "")
public class GoodsPropertyEntity {
    private long id;
    private long goodsId;
    private String propertyName;
    private String propertyMsg;
    private byte propertyStatus;
    private String propertyImg;
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
    @Column(name = "goods_id")
    public long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(long goodsId) {
        this.goodsId = goodsId;
    }

    @Basic
    @Column(name = "property_name")
    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    @Basic
    @Column(name = "property_msg")
    public String getPropertyMsg() {
        return propertyMsg;
    }

    public void setPropertyMsg(String propertyMsg) {
        this.propertyMsg = propertyMsg;
    }

    @Basic
    @Column(name = "property_status")
    public byte getPropertyStatus() {
        return propertyStatus;
    }

    public void setPropertyStatus(byte propertyStatus) {
        this.propertyStatus = propertyStatus;
    }

    @Basic
    @Column(name = "property_img")
    public String getPropertyImg() {
        return propertyImg;
    }

    public void setPropertyImg(String propertyImg) {
        this.propertyImg = propertyImg;
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

        GoodsPropertyEntity that = (GoodsPropertyEntity) o;

        if (id != that.id) return false;
        if (goodsId != that.goodsId) return false;
        if (propertyStatus != that.propertyStatus) return false;
        if (version != that.version) return false;
        if (dataStatus != that.dataStatus) return false;
        if (propertyName != null ? !propertyName.equals(that.propertyName) : that.propertyName != null) return false;
        if (propertyMsg != null ? !propertyMsg.equals(that.propertyMsg) : that.propertyMsg != null) return false;
        if (propertyImg != null ? !propertyImg.equals(that.propertyImg) : that.propertyImg != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (goodsId ^ (goodsId >>> 32));
        result = 31 * result + (propertyName != null ? propertyName.hashCode() : 0);
        result = 31 * result + (propertyMsg != null ? propertyMsg.hashCode() : 0);
        result = 31 * result + (int) propertyStatus;
        result = 31 * result + (propertyImg != null ? propertyImg.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (int) version;
        result = 31 * result + (int) dataStatus;
        return result;
    }
}
