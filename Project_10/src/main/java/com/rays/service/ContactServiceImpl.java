package com.rays.service;

import com.rays.dto.ContactDTO;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.ContactDAOInt;

@Service
@Transactional
public class ContactServiceImpl extends BaseServiceImpl<ContactDTO, ContactDAOInt> implements ContactServiceInt {

}
