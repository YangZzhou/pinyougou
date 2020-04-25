package com.pinyougou.sellergoods.service;

import java.util.List;
import java.util.Map;

import com.pinyougou.pojo.TbBrand;
import entity.PageResult;
import entity.Result;

/**
 * 品牌接口
 * @author Administrator
 *
 */
public interface BrandService {

	List<TbBrand> findAll();

	PageResult findPage(int pageNum,int pageSize);

	void add(TbBrand tbBrand);

	TbBrand findOne(Long id);

	void update(TbBrand tbBrand);

	void delete(Long[] ids);

	PageResult search(TbBrand tbBrand,int pageNum,int pageSize);

	List<Map> selectOptionList();
}
