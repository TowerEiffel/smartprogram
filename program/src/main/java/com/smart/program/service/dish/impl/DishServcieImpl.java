package com.smart.program.service.dish.impl;

import com.smart.program.domain.goods.*;
import com.smart.program.repository.goods.GoodsCateDao;
import com.smart.program.repository.goods.GoodsDao;
import com.smart.program.repository.goods.GoodsPropertyDao;
import com.smart.program.request.dish.DishTypeRequest;
import com.smart.program.response.dish.DishTypeResponse;
import com.smart.program.service.dish.DishService;
import com.smart.program.service.dish.spec.GoodsSpec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class DishServcieImpl implements DishService{
    @Autowired
    private GoodsCateDao goodsCateDao;
    @Autowired
    private GoodsDao goodsDao;
    @Autowired
    private GoodsPropertyDao goodsPropertyDao;

    /**
     * 获取菜单列表
     * @return
     */
    @Override
    public List<GoodsDTO>  findDishList() throws Exception{
        Sort sort = new Sort(Sort.Direction.DESC,"sort");
        List<GoodsCateEntity> allCate = goodsCateDao.findAll(GoodsSpec.findCate(), sort);
        List<GoodsDTO> dishList = new ArrayList<>();
        allCate.forEach(cate->{
            long cateId = cate.getCateId();
            List<GoodsEntity> allGoods = goodsDao.findAll(GoodsSpec.findGoods(cateId));
            GoodsDTO goodsDTO = new GoodsDTO();
            goodsDTO.setCateId(cateId);
            goodsDTO.setCateName(cate.getCateName());
            goodsDTO.setGoodsEntities(allGoods);
            dishList.add(goodsDTO);
        });
        return dishList;
    }

    /**
     * 获取菜品规格  类似微辣，中辣，大份小份
     * @param request
     * @return
     * @throws Exception
     */
    @Override
    public DishTypeResponse goodsType(DishTypeRequest request) throws Exception {
        List<GoodsPropertyEntity> allType = goodsPropertyDao.findAll(GoodsSpec.findType(request.getGoodsId()));
        Map<String, List<GoodsPropertyEntity>> collect = allType.stream().collect(Collectors.groupingBy(GoodsPropertyEntity::getPropertyName));
        DishTypeResponse dishTypeResponse = new DishTypeResponse();
        List<TypeDTO> objects = new ArrayList<>();
        collect.forEach((key,val)->{
            TypeDTO typeDTO = new TypeDTO();
            typeDTO.setGoodsId(request.getGoodsId());
            typeDTO.setTypeName(key);
            List<String> collect1 = val.stream().map(GoodsPropertyEntity::getPropertyMsg).collect(Collectors.toList());
            typeDTO.setTypeMsg(collect1);
            objects.add(typeDTO);
        });
        dishTypeResponse.setTypes(objects);
        return dishTypeResponse;
    }
}
