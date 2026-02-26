package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ShopDTO;

public class ShopForm extends BaseForm {
	
	@NotEmpty(message = "please enter shop name")
	private String shopName;
	
	@NotEmpty(message = "please enter owner name")
	private String ownerName;
	
	@NotEmpty(message = "please enter city")
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
	public BaseDTO getDto() {
		
		ShopDTO dto  =initDTO(new ShopDTO());
		dto.setShopName(shopName);
		dto.setOwnerName(ownerName);
		dto.setCity(city);
		return dto;
		
		
	}

}
