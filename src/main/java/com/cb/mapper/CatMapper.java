package com.cb.mapper;

import com.cb.domain.Cat;

import java.util.List;

public interface CatMapper {

    /** 查询全部汽车 */
    public List<Cat> selectCatList(Cat cat);

}
