package com.cb.service;

import com.cb.domain.Cat;

import java.util.List;

public interface ICatService {

    /** 查询全部汽车 */
    public List<Cat> SelectCat(Cat cat);

}
