package com.cg.capstore.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;




import com.cg.capstore.dto.Feedback;
//import com.cg.capstore.dto.Feedback;
import com.cg.capstore.dto.Product;


@Repository("capstoreDao")
@Transactional
public class CapStoreDaoImpl implements ICapStoreDao{

	@PersistenceContext
	EntityManager entitymanager;

	
	@Override
	public Product productDetails(String prodId) {
		
		Product product=entitymanager.find(Product.class, prodId);
		System.out.println(product);
		return product;		
	}

	@Override
	public List<Feedback> productFeedback(String prodId) {
		
		TypedQuery<Feedback> queryOne=(TypedQuery<Feedback>) entitymanager.createQuery("FROM Feedback where productId =:pId");
        queryOne.setParameter("pId", prodId);       
        List<Feedback> feedbkList=queryOne.getResultList();        
                return feedbkList;
		
	}
	

    public List<Product> similartype(String type) {
       
        TypedQuery<Product> queryOne=(TypedQuery<Product>) entitymanager.createQuery("FROM Product where subCategoryId =:type");
        queryOne.setParameter("type", type);       
        List<Product> myList=queryOne.getResultList();
        System.out.println("in dao");
        System.out.println(myList);
                return myList;
    }

}
