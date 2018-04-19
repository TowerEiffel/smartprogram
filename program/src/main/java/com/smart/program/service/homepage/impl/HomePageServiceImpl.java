package com.smart.program.service.homepage.impl;

import com.smart.program.domain.HomeConfigEntity;
import com.smart.program.domain.HomeMsgEntity;
import com.smart.program.repository.HomeConfigDao;
import com.smart.program.repository.HomeMsgDao;
import com.smart.program.response.homepage.HomePageResponse;
import com.smart.program.service.homepage.HomePageService;
import com.smart.program.service.homepage.impl.Spec.HomeSpec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomePageServiceImpl implements HomePageService {

    @Autowired
    private HomeConfigDao homeConfigDao;
    @Autowired
    private HomeMsgDao homeMsgDao;
    /**
     * 获取首页信息
     * @return
     * @throws Exception
     */
    @Override
    public List<HomePageResponse> queryHomePage() throws Exception {

        List<HomeConfigEntity> allConfig = homeConfigDao.findAll(HomeSpec.findAll());
        List<HomePageResponse> responses = new ArrayList<>();
        allConfig.forEach(configEntity->{
            String areaTag = configEntity.getAreaTag();
            List<HomeMsgEntity> allMsg = homeMsgDao.findAll(HomeSpec.findMsgs(areaTag));
            responses.add(new HomePageResponse(configEntity,allMsg));
        });
        return responses;
    }
}
