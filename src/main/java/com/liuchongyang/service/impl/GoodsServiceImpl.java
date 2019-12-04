package com.liuchongyang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liuchongyang.dao.GoodsDao;
import com.liuchongyang.domain.Brand;
import com.liuchongyang.domain.Goods;
import com.liuchongyang.domain.GoodsKind;
import com.liuchongyang.service.GoodsService;


@Service
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	private GoodsDao dao;
	
	/**
	 * 
	 * @Title: getGoodsList 
	 * @Description: 展示列表
	 * @param pageNum
	 * @param likeName
	 * @return
	 * @return: PageInfo<Goods>
	 */
	public PageInfo<Goods> getGoodsList(Integer pageNum, String likeName) {
		PageHelper.startPage(pageNum, 3);
		
		List<Goods> list = dao.getGoodsList(likeName);
		
		PageInfo<Goods> info = new PageInfo<Goods>(list);
		
		return info;
	}

	/**
	 * 
	 * @Title: getBrandList 
	 * @Description: 查找全部品牌
	 * @return
	 * @return: List<Brand>
	 */
	public List<Brand> getBrandList() {
		return dao.getBrandList();
	}

	/**
	 * 
	 * @Title: getGoodsKindList 
	 * @Description: 查找全部种类
	 * @return
	 * @return: List<GoodsKind>
	 */
	public List<GoodsKind> getGoodsKindList() {
		return dao.getGoodsKindList();
	}

	/**
	 * 
	 * @Title: doAddGoods 
	 * @Description: 添加商品
	 * @param g
	 * @return: void
	 */
	public void doAddGoods(Goods g) {
		dao.doAddGoods(g);
	}

	/**
	 * 
	 * @Title: getGoodsByGid 
	 * @Description: 详情查询
	 * @param gid
	 * @return
	 * @return: Goods
	 */
	public Goods getGoodsByGid(Integer gid) {
		return dao.getGoodsByGid(gid);
	}

	/**
	 * 
	 * @Title: doUpdate 
	 * @Description: 修改功能
	 * @param g
	 * @return: void
	 */
	public void doUpdate(Goods g) {
		dao.doUpdate(g);
	}

	/**
	 * 
	 * @Title: deletes 
	 * @Description: 批量删除功能
	 * @param ids
	 * @return: void
	 */
	public void deletes(String ids) {
		dao.deletes(ids);
	}

}
