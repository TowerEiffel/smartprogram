package com.smart.program.domain.account;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 用户账户信息
 * Created by baihe
 * ON 2018/4/19.
 */
@Entity
@Table(name = "account")
public class AccountEntity {
    private long id;
    private long user;
    private BigDecimal accountNum;
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
    @Column(name = "user")
    public long getUser() {
        return user;
    }

    public void setUser(long user) {
        this.user = user;
    }

    @Basic
    @Column(name = "account_num")
    public BigDecimal getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(BigDecimal accountNum) {
        this.accountNum = accountNum;
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

}
