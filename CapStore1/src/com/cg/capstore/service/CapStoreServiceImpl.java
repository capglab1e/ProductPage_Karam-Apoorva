package com.cg.capstore.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.capstore.dao.CapStoreDaoImpl;
import com.cg.capstore.dao.ICapStoreDao;
import com.cg.capstore.dto.Feedback;
//import com.cg.capstore.dto.Feedback;
import com.cg.capstore.dto.Product;


@Service("capstoreService")

@Transactional
public class CapStoreServiceImpl implements ICapStoreService{

	@Autowired
	ICapStoreDao capstoreDao;
	
	@Override
	public Product productDetails(String prodId) {
		
		return capstoreDao.productDetails(prodId);
	}

	@Override
	public List<Feedback> productFeedback(String prodId) {
		
		return capstoreDao.productFeedback(prodId);
	}

	

	@Override
	public List<Product> similartype(String type) {
		// TODO Auto-generated method stub
		return capstoreDao.similartype(type);
	}

	
}
