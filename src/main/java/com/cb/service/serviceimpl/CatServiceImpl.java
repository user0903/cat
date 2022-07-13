package com.cb.service.serviceimpl;

import com.cb.domain.Cat;
import com.cb.mapper.CatMapper;
import com.cb.service.ICatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatServiceImpl implements ICatService {

    /** 自动注入 */
    @Autowired
    private CatMapper catMapper;

    @Override
    public List<Cat> SelectCat(Cat cat) {
        return catMapper.selectCatList(cat);
    }
}
