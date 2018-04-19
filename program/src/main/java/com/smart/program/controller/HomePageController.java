package com.smart.program.controller;

import com.smart.program.common.ErrorConstant;
import com.smart.program.response.ResponseVO;
import com.smart.program.response.homepage.HomePageResponse;
import com.smart.program.service.homepage.HomePageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 首页
 */
@RestController
public class HomePageController {

    @Autowired
    private HomePageService homePageService;

    private Logger log = LoggerFactory.getLogger(HomePageController.class);

    /**
     * 获取首页信息
     * @return
     */
    @RequestMapping(path = "/queryHomePage", method = RequestMethod.GET)
    public ResponseVO<List<HomePageResponse>> queryHomePage() {
        ResponseVO<List<HomePageResponse>> responseVO = new ResponseVO<>();
        try {
            List<HomePageResponse> responses = homePageService.queryHomePage();
            responseVO.setResult(ErrorConstant.SUCCESS_CODE, ErrorConstant.SUCCESS_MSG, responses);
        } catch (Exception e) {
            log.error("HomePageController queryHomePage Exception -> ", e);
            responseVO.setResult(ErrorConstant.ERROR_CODE, ErrorConstant.ERROR_MSG);
        }
        return responseVO;
    }
}
