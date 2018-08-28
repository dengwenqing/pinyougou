package com._360dwq.sellergoods.service.impl;

import com._360dwq.mapper.BrandMapper;
import com._360dwq.pojo.TbBrand;
import com._360dwq.sellergoods.service.BrandService;
import com._360dwq.service.BaseService;
import com._360dwq.service.impl.BaseServiceImpl;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author Dw_Qin
 * @Date 2018/08/27 0:04
 * @Email 569806951@qq.com
 */

@Service(interfaceClass = BrandService.class)
public class BrandServiceImpl extends BaseServiceImpl<TbBrand> implements BrandService{
    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<TbBrand> queryAll() {
        return brandMapper.queryAll();
    }

    @Override
    public List<TbBrand> testPage(Integer page, Integer rows) {
        PageHelper.startPage(page,rows);
        return brandMapper.queryAll();
    }
}
