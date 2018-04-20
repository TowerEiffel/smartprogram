package com.smart.program.service.homepage.impl.Spec;

import com.github.wenhao.jpa.Specifications;
import com.smart.program.domain.HomeConfigEntity;
import com.smart.program.domain.HomeMsgEntity;
import org.springframework.data.jpa.domain.Specification;

public class HomeSpec {
    public static Specification<HomeConfigEntity> findAll(){
        return Specifications.<HomeConfigEntity>and()
                .eq("dataStatus",(byte)0)
                .build();
    }

    public static Specification<HomeMsgEntity> findMsgs(String areaTag){
        return Specifications.<HomeMsgEntity>and()
                .eq("areaTag",areaTag.trim())
                .eq("dataStatus",(byte)0)
                .build();
    }
}
