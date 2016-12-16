package com.weikun.controller;

import com.weikun.model.Company;
import com.weikun.model.CompanyExample;
import com.weikun.service.CompanyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/12/16.
 */
@Controller
@RequestMapping("/com")
public class CompanyController {
    @Autowired
    private CompanyServiceImpl service;
    @RequestMapping("/query")
    public String queryAll(Map map){
        CompanyExample example=new CompanyExample();
        example.createCriteria().andCidIsNotNull();
        List<Company> list=service.selectByExample(example);
        map.put("list",list);
        return "show";
    }
}
