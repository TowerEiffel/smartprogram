package com.smart.program.request.reserve;

import javax.validation.constraints.NotBlank;

/**
 * 用户预约请求参数对象
 */
public class UserReserveRequest {

    @NotBlank(message = "姓名必须填写")
    private String realName;
    @NotBlank(message = "联系电话必须填写")
    private String mobile;
    @NotBlank(message = "用餐人数必须填写")
    private Integer reserveNumbers;
    @NotBlank(message = "预定时间必须填写")
    private String  reserveTime;
    @NotBlank(message = "备注信息必须填写")
    private String summary;

    public UserReserveRequest() {
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getReserveNumbers() {
        return reserveNumbers;
    }

    public void setReserveNumbers(Integer reserveNumbers) {
        this.reserveNumbers = reserveNumbers;
    }

    public String getReserveTime() {
        return reserveTime;
    }

    public void setReserveTime(String reserveTime) {
        this.reserveTime = reserveTime;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
        return "UserReserveRequest{" +
                "realName='" + realName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", reserveNumbers=" + reserveNumbers +
                ", reserveTime='" + reserveTime + '\'' +
                ", summary='" + summary + '\'' +
                '}';
    }
}
