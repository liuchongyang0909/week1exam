package com.liuchongyang.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.liuchongyang.domain.Brand;
import com.liuchongyang.domain.Goods;
import com.liuchongyang.domain.GoodsKind;

public interface GoodsService {

	/**
	 * 
	 * @Title: getGoodsList 
	 * @Description: չʾ�б�
	 * @param pageNum
	 * @param likeName
	 * @return
	 * @return: PageInfo<Goods>
	 */
	PageInfo<Goods> getGoodsList(Integer pageNum, String likeName);

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
	Goods getGoodsByGid(Integer gid);

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
	void deletes(String ids);

}
