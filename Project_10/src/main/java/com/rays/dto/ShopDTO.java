package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_SHOP")
public class ShopDTO extends BaseDTO {
	
	@Column(name = "SHOP_NAME",length = 50)
	private String shopName;
	
	@Column(name = "OWNER_NAME",length = 50)
	private String ownerName;
	
	@Column(name = "CITY",length = 50)
	private String city;
	
	

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return shopName;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "shopName";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return city;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Shop";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		// TODO Auto-generated method stub
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("shopName", "asc");
		
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		// TODO Auto-generated method stub
		LinkedHashMap<String, Object> map = new LinkedHashMap<String,Object>();
		map.put("ownerName", ownerName);
		return map;
	}

}
