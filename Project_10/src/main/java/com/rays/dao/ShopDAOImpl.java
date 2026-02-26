package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ShopDTO;

@Repository
public class ShopDAOImpl extends BaseDAOImpl<ShopDTO> implements ShopDAOInt {

	@Override
	protected List<Predicate> getWhereClause(ShopDTO dto, CriteriaBuilder builder, Root<ShopDTO> qRoot) {
		// TODO Auto-generated method stub
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if(!isEmptyString(dto.getShopName())) {
			whereCondition.add(builder.like(qRoot.get("shopName"), dto.getShopName() + "%"));
		}
		
		if(!isEmptyString(dto.getCity())) {
			whereCondition.add(builder.like(qRoot.get("city"), dto.getCity() + "%"));
		}
		return whereCondition;
	}

	@Override
	public Class<ShopDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return ShopDTO.class;
	}

}
