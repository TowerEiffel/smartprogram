package com.smart.program.response.homepage;

import com.smart.program.response.banner.BannerResponse;
import com.smart.program.response.notice.NoticeResponse;

import java.util.List;

public class HomePageResponse {

    /**banner信息*/
    private List<BannerResponse> banners;
    /**活动提示*/
    private List<NoticeResponse> notices;

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
}
