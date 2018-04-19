package com.smart.program.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * hello.activeEntity
 * Created by baihe
 * ON 2018/4/19.
 */
@Entity
@Table(name = "goods_cate", schema = "smart", catalog = "")
public class GoodsCateEntity {
    private long cateId;
    private String cateIcon;
    private String cateName;
    private Integer sort;
    private Byte status;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Byte version;
    private Byte dataStatus;

    @Id
    @Column(name = "cate_id")
    public long getCateId() {
        return cateId;
    }

    public void setCateId(long cateId) {
        this.cateId = cateId;
    }

    @Basic
    @Column(name = "cate_icon")
    public String getCateIcon() {
        return cateIcon;
    }

    public void setCateIcon(String cateIcon) {
        this.cateIcon = cateIcon;
    }

    @Basic
    @Column(name = "cate_name")
    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    @Basic
    @Column(name = "sort")
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Basic
    @Column(name = "status")
    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
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
    public Byte getVersion() {
        return version;
    }

    public void setVersion(Byte version) {
        this.version = version;
    }

    @Basic
    @Column(name = "data_status")
    public Byte getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Byte dataStatus) {
        this.dataStatus = dataStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GoodsCateEntity that = (GoodsCateEntity) o;

        if (cateId != that.cateId) return false;
        if (cateIcon != null ? !cateIcon.equals(that.cateIcon) : that.cateIcon != null) return false;
        if (cateName != null ? !cateName.equals(that.cateName) : that.cateName != null) return false;
        if (sort != null ? !sort.equals(that.sort) : that.sort != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (version != null ? !version.equals(that.version) : that.version != null) return false;
        if (dataStatus != null ? !dataStatus.equals(that.dataStatus) : that.dataStatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (cateId ^ (cateId >>> 32));
        result = 31 * result + (cateIcon != null ? cateIcon.hashCode() : 0);
        result = 31 * result + (cateName != null ? cateName.hashCode() : 0);
        result = 31 * result + (sort != null ? sort.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (dataStatus != null ? dataStatus.hashCode() : 0);
        return result;
    }
}
