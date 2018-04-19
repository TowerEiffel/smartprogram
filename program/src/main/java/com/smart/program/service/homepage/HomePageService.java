package com.smart.program.service.homepage;

import com.smart.program.response.homepage.HomePageResponse;

import java.util.List;

public interface HomePageService {

    /**
     * 查询首页信息
     * @return
     * @throws Exception
     */
    List<HomePageResponse> queryHomePage() throws Exception;
}
