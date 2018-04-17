package com.smart.program.response.homepage;

import com.smart.program.domain.banner.BannerEntity;
import com.smart.program.domain.notice.NoticeEntity;

import java.util.List;

public class HomePageResponse {

    /**banner信息*/
    private List<BannerEntity> banners;
    /**活动提示*/
    private List<NoticeEntity> notices;

    public HomePageResponse() {
    }

    public List<BannerEntity> getBanners() {
        return banners;
    }

    public void setBanners(List<BannerEntity> banners) {
        this.banners = banners;
    }

    public List<NoticeEntity> getNotices() {
        return notices;
    }

    public void setNotices(List<NoticeEntity> notices) {
        this.notices = notices;
    }
}
