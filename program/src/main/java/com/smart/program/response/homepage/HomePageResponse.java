package com.smart.program.response.homepage;

import com.smart.program.response.banner.BannerResponse;
import com.smart.program.response.notice.NoticeResponse;

import java.util.List;

public class HomePageResponse {

    /**banner信息*/
    private List<BannerResponse> banners;
    /**活动提示*/
    private List<NoticeResponse> notices;
    /**店家名称*/
    private String restaurantName;
    /**店家状态*/
    private Byte restaurantStatus;

    public HomePageResponse() {
    }

    public List<BannerResponse> getBanners() {
        return banners;
    }

    public void setBanners(List<BannerResponse> banners) {
        this.banners = banners;
    }

    public List<NoticeResponse> getNotices() {
        return notices;
    }

    public void setNotices(List<NoticeResponse> notices) {
        this.notices = notices;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public Byte getRestaurantStatus() {
        return restaurantStatus;
    }

    public void setRestaurantStatus(Byte restaurantStatus) {
        this.restaurantStatus = restaurantStatus;
    }
}
