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
	 * @Description: չʾ�б�
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
	 * @Description: ����ȫ��Ʒ��
	 * @return
	 * @return: List<Brand>
	 */
	public List<Brand> getBrandList() {
		return dao.getBrandList();
	}

	/**
	 * 
	 * @Title: getGoodsKindList 
	 * @Description: ����ȫ������
	 * @return
	 * @return: List<GoodsKind>
	 */
	public List<GoodsKind> getGoodsKindList() {
		return dao.getGoodsKindList();
	}

	/**
	 * 
	 * @Title: doAddGoods 
	 * @Description: �����Ʒ
	 * @param g
	 * @return: void
	 */
	public void doAddGoods(Goods g) {
		dao.doAddGoods(g);
	}

	/**
	 * 
	 * @Title: getGoodsByGid 
	 * @Description: �����ѯ
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
	 * @Description: �޸Ĺ���
	 * @param g
	 * @return: void
	 */
	public void doUpdate(Goods g) {
		dao.doUpdate(g);
	}

	/**
	 * 
	 * @Title: deletes 
	 * @Description: ����ɾ������
	 * @param ids
	 * @return: void
	 */
	public void deletes(String ids) {
		dao.deletes(ids);
	}

}
