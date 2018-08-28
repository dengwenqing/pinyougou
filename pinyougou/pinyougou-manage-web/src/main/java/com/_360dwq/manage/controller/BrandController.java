package com._360dwq.manage.controller;

import com._360dwq.pojo.TbBrand;
import com._360dwq.sellergoods.service.BrandService;
import com._360dwq.vo.PageResult;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author Dw_Qin
 * @Date 2018/08/27 0:06
 * @Email 569806951@qq.com
 */
@RequestMapping("/brand")
@RestController
public class BrandController {
    @Reference
    private BrandService brandService;

    @GetMapping("/findAll")
    public List<TbBrand> findAll(){
        return brandService.findAll();
    }

    @GetMapping("/findPage")
    public PageResult testPage(@RequestParam(value="page", defaultValue = "1") Integer page,
                               @RequestParam(value="rows", defaultValue = "10") Integer rows){
        return  brandService.findPage(page,rows);
    }
}
