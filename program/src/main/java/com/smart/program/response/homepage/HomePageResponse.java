package com.smart.program.response.homepage;

import com.smart.program.domain.HomeConfigEntity;
import com.smart.program.domain.HomeMsgEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class HomePageResponse {
    private String areaName;
    private String areaTag;
    private int areaHight;
    private int areaSort;
    private List<HomeMsgEntity> msgEntities;

    public HomePageResponse(HomeConfigEntity configEntity, List<HomeMsgEntity> msgEntities){
        this.areaHight=configEntity.getAreaHight();
        this.areaName=configEntity.getAreaName();
        this.areaSort=configEntity.getAreaSort();
        this.areaTag=configEntity.getAreaTag();
        this.msgEntities=msgEntities;
    }
}
