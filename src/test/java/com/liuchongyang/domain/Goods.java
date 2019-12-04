package com.liuchongyang.domain;

import com.liuchongyang.domain.Brand;
import com.liuchongyang.domain.GoodsKind;

public class Goods {
	private Integer gid;
	private String gname;
	private String datea;
	private Integer price;
	private Integer gstatus;
	private Integer type_id;
	private Integer pinpai_id;
	private Brand bra;
	private GoodsKind kin;
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getDatea() {
		return datea;
	}
	public void setDatea(String datea) {
		this.datea = datea;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getGstatus() {
		return gstatus;
	}
	public void setGstatus(Integer gstatus) {
		this.gstatus = gstatus;
	}
	public Integer getType_id() {
		return type_id;
	}
	public void setType_id(Integer type_id) {
		this.type_id = type_id;
	}
	public Integer getPinpai_id() {
		return pinpai_id;
	}
	public void setPinpai_id(Integer pinpai_id) {
		this.pinpai_id = pinpai_id;
	}
	public Brand getBra() {
		return bra;
	}
	public void setBra(Brand bra) {
		this.bra = bra;
	}
	public GoodsKind getKin() {
		return kin;
	}
	public void setKin(GoodsKind kin) {
		this.kin = kin;
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", datea=" + datea + ", price=" + price + ", gstatus="
				+ gstatus + ", type_id=" + type_id + ", pinpai_id=" + pinpai_id + ", bra=" + bra + ", kin=" + kin + "]";
	}
}
