package com.liuchongyang.controller;

import java.util.List;

import org.json.simple.JSONArray;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.liuchongyang.domain.Brand;
import com.liuchongyang.domain.Goods;
import com.liuchongyang.domain.GoodsKind;
import com.liuchongyang.service.GoodsService;

@Controller
public class GoodsController {
	
	@Autowired
	private GoodsService service;
	
	/**
	 * 
	 * @Title: list 
	 * @Description: 列表
	 * @param m
	 * @param pageNum
	 * @param likeName
	 * @return
	 * @return: String
	 */
	@RequestMapping("list")
	public String list(Model m, @RequestParam(defaultValue = "1")Integer pageNum, String likeName) {
		PageInfo<Goods> info = service.getGoodsList(pageNum, likeName);
		
		m.addAttribute("info", info);
		m.addAttribute("likeName", likeName);
		
		return "list";
	}
	
	/**
	 * 
	 * @Title: toAdd 
	 * @Description: 跳转到添加
	 * @param m
	 * @return
	 * @return: String
	 */
	@RequestMapping("toAdd")
	public String toAdd(Model m) {
		List<Brand> brands = service.getBrandList();
		List<GoodsKind> kinds = service.getGoodsKindList();
		
		m.addAttribute("brands", brands);
		m.addAttribute("kinds", kinds);
		m.addAttribute("goods", new Goods());
		
		return "add";
	}
	
	/**
	 * 
	 * @Title: doAdd 
	 * @Description: 添加
	 * @param g
	 * @return
	 * @return: String
	 */
	@Test
	@RequestMapping("doAdd")
	public String doAdd(Goods g) {
		service.doAddGoods(g);
		
		return "redirect:/list";
	}
	
	/**
	 * 
	 * @Title: xiangqing 
	 * @Description: 详情
	 * @param gid
	 * @param m
	 * @return
	 * @return: String
	 */
	@RequestMapping("xiangqing")
	public String xiangqing(Integer gid, Model m) {
		Goods good = service.getGoodsByGid(gid);
		
		m.addAttribute("good", good);
		
		return "xiangqing";
	}
	
	/**
	 * 
	 * @Title: toUpdate 
	 * @Description: 跳到修改
	 * @param gid
	 * @param m
	 * @return
	 * @return: String
	 */
	@RequestMapping("toUpdate")
	public String toUpdate(Integer gid, Model m) {
		List<Brand> brands = service.getBrandList();
		List<GoodsKind> kinds = service.getGoodsKindList();
		Goods goods = service.getGoodsByGid(gid);
		
		m.addAttribute("brands", brands);
		m.addAttribute("kinds", kinds);
		m.addAttribute("goods", goods);
		
		return "update";
	}
	
	/**
	 * 
	 * @Title: doUpdate 
	 * @Description: 修改
	 * @param g
	 * @return
	 * @return: String
	 */
	@Test
	@RequestMapping("doUpdate")
	public String doUpdate(Goods g) {
		service.doUpdate(g);
		
		return "redirect:/list";
	}
	
	/**
	 * 
	 * @Title: deletes 
	 * @Description: 删除
	 * @param ids
	 * @return
	 * @return: Object
	 */
	@Test
	@ResponseBody
	@RequestMapping("deletes")
	public Object deletes(String ids) {
		try {
			service.deletes(ids);
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			
			return false;
		}
	}
	
	/**
	 * 
	 * @Title: kindList 
	 * @Description: 查找种类
	 * @param m
	 * @return
	 * @return: Object
	 */
	@ResponseBody
	@RequestMapping("kindList")
	public Object kindList(Model m) {
		List<GoodsKind> kinds = service.getGoodsKindList();
		
		String jsonString = JSONArray.toJSONString(kinds);
		
		return jsonString;
	}
}
