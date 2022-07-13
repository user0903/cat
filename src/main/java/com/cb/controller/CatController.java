package com.cb.controller;

import com.cb.domain.Cat;
import com.cb.service.ICatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cb/cat")
public class CatController {

    @Autowired
    private ICatService catService;


    @GetMapping("/list")
    public List<Cat> CatList(Cat cat)
    {
        return catService.SelectCat(cat);
    }


}
