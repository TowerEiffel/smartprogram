package com.smart.program.controller;

import com.smart.program.common.ErrorConstant;
import com.smart.program.response.ResponseVO;
import com.smart.program.response.homepage.HomePageResponse;
import com.smart.program.service.homepage.HomePageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 首页
 */
@RestController
@RequestMapping("/home")
@Slf4j
public class HomePageController {

    @Autowired
    private HomePageService homePageService;

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
