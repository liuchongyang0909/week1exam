package com.liuchongyang.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.liuchongyang.domain.Brand;
import com.liuchongyang.domain.Goods;
import com.liuchongyang.domain.GoodsKind;

public interface GoodsDao {

	/**
	 * 
	 * @Title: getGoodsList 
	 * @Description: 展示列表
	 * @param likeName
	 * @return
	 * @return: List<Goods>
	 */
	List<Goods> getGoodsList(@Param("likeName")String likeName);

	/**
	 * 
	 * @Title: getBrandList 
	 * @Description: 查找全部品牌
	 * @return
	 * @return: List<Brand>
	 */
	List<Brand> getBrandList();

	/**
	 * 
	 * @Title: getGoodsKindList 
	 * @Description: 查找全部种类
	 * @return
	 * @return: List<GoodsKind>
	 */
	List<GoodsKind> getGoodsKindList();

	/**
	 * 
	 * @Title: doAddGoods 
	 * @Description: 添加商品
	 * @param g
	 * @return: void
	 */
	void doAddGoods(Goods g);

	/**
	 * 
	 * @Title: getGoodsByGid 
	 * @Description: 详情查询
	 * @param gid
	 * @return
	 * @return: Goods
	 */
	Goods getGoodsByGid(@Param("gid")Integer gid);

	/**
	 * 
	 * @Title: doUpdate 
	 * @Description: 修改功能
	 * @param g
	 * @return: void
	 */
	void doUpdate(Goods g);

	/**
	 * 
	 * @Title: deletes 
	 * @Description: 批量删除功能
	 * @param ids
	 * @return: void
	 */
	void deletes(@Param("ids")String ids);

}
