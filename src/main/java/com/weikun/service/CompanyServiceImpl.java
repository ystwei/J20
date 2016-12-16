package com.weikun.service;

import com.weikun.mapper.CompanyMapper;
import com.weikun.mapper.MyCompanyMapper;
import com.weikun.model.Company;
import com.weikun.model.CompanyExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/12/16.
 */
@Service
public class CompanyServiceImpl {
    @Autowired
    private CompanyMapper dao;


    @Autowired
    private MyCompanyMapper mdao;

    public List<Company> selectByExample(CompanyExample example){
        return mdao.selectByExample(example);
    }
}
