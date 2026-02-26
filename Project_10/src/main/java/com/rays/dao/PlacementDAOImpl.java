package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.PlacementDTO;

@Repository
public class PlacementDAOImpl extends BaseDAOImpl<PlacementDTO> implements PlacementDAOInt {

	@Override
	protected List<Predicate> getWhereClause(PlacementDTO dto, CriteriaBuilder builder, Root<PlacementDTO> qRoot) {
		// TODO Auto-generated method stub
		
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		
		if(!isNotNull(dto.getStudentName())) {
			whereCondition.add(builder.like(qRoot.get("studentName"), dto.getStudentName() + "%"));
		}
		
		if(!isEmptyString(dto.getPlacementStatus())) {
			whereCondition.add(builder.like(qRoot.get("placementStatus"), dto.getPlacementStatus() + "%"));
		}
		return whereCondition;
	}

	@Override
	public Class<PlacementDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return PlacementDTO.class;
	}

}
