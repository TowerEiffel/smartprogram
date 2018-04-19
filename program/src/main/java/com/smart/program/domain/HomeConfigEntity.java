package com.smart.program.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * hello.activeEntity
 * Created by baihe
 * ON 2018/4/19.
 */
@Entity
@Table(name = "home_config", schema = "smart", catalog = "")
public class HomeConfigEntity {
    private long id;
    private String areaName;
    private String areaTag;
    private int areaHight;
    private int areaSort;
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
    @Column(name = "area_name")
    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    @Basic
    @Column(name = "area_tag")
    public String getAreaTag() {
        return areaTag;
    }

    public void setAreaTag(String areaTag) {
        this.areaTag = areaTag;
    }

    @Basic
    @Column(name = "area_hight")
    public int getAreaHight() {
        return areaHight;
    }

    public void setAreaHight(int areaHight) {
        this.areaHight = areaHight;
    }

    @Basic
    @Column(name = "area_sort")
    public int getAreaSort() {
        return areaSort;
    }

    public void setAreaSort(int areaSort) {
        this.areaSort = areaSort;
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

        HomeConfigEntity that = (HomeConfigEntity) o;

        if (id != that.id) return false;
        if (areaHight != that.areaHight) return false;
        if (areaSort != that.areaSort) return false;
        if (version != that.version) return false;
        if (dataStatus != that.dataStatus) return false;
        if (areaName != null ? !areaName.equals(that.areaName) : that.areaName != null) return false;
        if (areaTag != null ? !areaTag.equals(that.areaTag) : that.areaTag != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (areaName != null ? areaName.hashCode() : 0);
        result = 31 * result + (areaTag != null ? areaTag.hashCode() : 0);
        result = 31 * result + areaHight;
        result = 31 * result + areaSort;
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (int) version;
        result = 31 * result + (int) dataStatus;
        return result;
    }
}
