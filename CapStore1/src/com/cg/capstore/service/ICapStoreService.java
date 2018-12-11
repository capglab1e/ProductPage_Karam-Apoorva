package com.cg.capstore.service;

import java.util.List;


import com.cg.capstore.dto.Feedback;
//import com.cg.capstore.dto.Feedback;
import com.cg.capstore.dto.Product;

public interface ICapStoreService {

	
	public Product productDetails(String prodId);
	
	public List<Feedback> productFeedback(String prodId);
	
	public List<Product> similartype(String type);
}
