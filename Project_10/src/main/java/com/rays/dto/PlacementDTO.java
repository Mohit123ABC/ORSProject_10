package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_PLACEMENT")
public class PlacementDTO extends BaseDTO {
	
	@Column(name = "PLACEMENT_CODE",length = 50)
	private String placementCode;
	
	@Column(name = "STUDENT_NAME",length = 50)
	private String studentName;
	
	@Column(name = "COMPANY_NAME",length = 50)
	private String companyName;
	
	@Column(name = "PLACEMENT_STATUS")
	private String placementStatus;
	
	

	public String getPlacementCode() {
		return placementCode;
	}

	public void setPlacementCode(String placementCode) {
		this.placementCode = placementCode;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPlacementStatus() {
		return placementStatus;
	}

	public void setPlacementStatus(String placementStatus) {
		this.placementStatus = placementStatus;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return placementCode;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "placementCode";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return placementCode;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Placement";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		// TODO Auto-generated method stub
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("placementCode", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		// TODO Auto-generated method stub
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("placementCode", placementCode);
		return map;
	}

}
