package com.smart.program.service.homepage.impl;

import com.smart.program.response.banner.BannerResponse;
import com.smart.program.response.homepage.HomePageResponse;
import com.smart.program.response.notice.NoticeResponse;
import com.smart.program.service.banner.BannerService;
import com.smart.program.service.homepage.HomePageService;
import com.smart.program.service.notice.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomePageServiceImpl implements HomePageService {

    @Autowired
    private BannerService bannerService;

    @Autowired
    private NoticeService noticeService;

    /**
     * 获取首页信息
     *
     * @return
     * @throws Exception
     */
    @Override
    public HomePageResponse queryHomePage() throws Exception {
        HomePageResponse homePageResponse = new HomePageResponse();
        // 获取banner信息
        List<BannerResponse> bannerResponses = bannerService.queryBannerResponse();
        homePageResponse.setBanners(bannerResponses);
        // 获取提示信息
        List<NoticeResponse> noticeResponses = noticeService.queryNoticeResponse();
        homePageResponse.setNotices(noticeResponses);
        return homePageResponse;
    }
}
