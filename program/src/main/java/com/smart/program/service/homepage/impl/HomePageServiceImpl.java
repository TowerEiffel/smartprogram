package com.smart.program.service.homepage.impl;

import com.smart.program.response.homepage.HomePageResponse;
import com.smart.program.service.homepage.HomePageService;
import org.springframework.stereotype.Service;

@Service
public class HomePageServiceImpl implements HomePageService {

    /**
     * 获取首页信息
     * @return
     * @throws Exception
     */
    @Override
    public HomePageResponse queryHomePage() throws Exception {
        // TODO 获取banner信息
        // TODO 获取提示信息
        return null;
    }
}
