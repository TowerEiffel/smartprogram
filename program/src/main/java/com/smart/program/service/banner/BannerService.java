package com.smart.program.service.banner;

import com.smart.program.response.banner.BannerResponse;

import java.util.List;

public interface BannerService {

    /**
     * 获取banner响应对象
     * @return
     * @throws Exception
     */
    List<BannerResponse> queryBannerResponse() throws Exception;
}
