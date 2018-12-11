package com.cg.capstore.dao;

import java.util.List;



import com.cg.capstore.dto.Feedback;
//import com.cg.capstore.dto.Feedback;
import com.cg.capstore.dto.Product;

public interface ICapStoreDao {
	
	public Product productDetails(String prodId);
	public List<Feedback> productFeedback(String prodId);
	//public Feedback similiarProduct(String prodId);
	
	//public List<String> similarproducts(String cat);
	public List<Product> similartype(String type);
}
