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
	 * @Description: չʾ�б�
	 * @param likeName
	 * @return
	 * @return: List<Goods>
	 */
	List<Goods> getGoodsList(@Param("likeName")String likeName);

	/**
	 * 
	 * @Title: getBrandList 
	 * @Description: ����ȫ��Ʒ��
	 * @return
	 * @return: List<Brand>
	 */
	List<Brand> getBrandList();

	/**
	 * 
	 * @Title: getGoodsKindList 
	 * @Description: ����ȫ������
	 * @return
	 * @return: List<GoodsKind>
	 */
	List<GoodsKind> getGoodsKindList();

	/**
	 * 
	 * @Title: doAddGoods 
	 * @Description: �����Ʒ
	 * @param g
	 * @return: void
	 */
	void doAddGoods(Goods g);

	/**
	 * 
	 * @Title: getGoodsByGid 
	 * @Description: �����ѯ
	 * @param gid
	 * @return
	 * @return: Goods
	 */
	Goods getGoodsByGid(@Param("gid")Integer gid);

	/**
	 * 
	 * @Title: doUpdate 
	 * @Description: �޸Ĺ���
	 * @param g
	 * @return: void
	 */
	void doUpdate(Goods g);

	/**
	 * 
	 * @Title: deletes 
	 * @Description: ����ɾ������
	 * @param ids
	 * @return: void
	 */
	void deletes(@Param("ids")String ids);

}
