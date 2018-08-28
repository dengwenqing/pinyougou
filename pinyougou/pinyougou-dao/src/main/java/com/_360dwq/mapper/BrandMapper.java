package com._360dwq.mapper;

import com._360dwq.pojo.TbBrand;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Author Dw_Qin
 * @Date 2018/08/26 23:57
 * @Email 569806951@qq.com
 */
public interface BrandMapper extends Mapper<TbBrand> {
    List<TbBrand> queryAll();
}
