package com.cg.capstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;







import com.cg.capstore.dto.Feedback;
//import com.cg.capstore.dto.Feedback;
import com.cg.capstore.dto.Product;
import com.cg.capstore.service.CapStoreServiceImpl;
import com.cg.capstore.service.ICapStoreService;




@Controller
public class controller {

	@Autowired
	ICapStoreService capstoreService;
	
	@RequestMapping(value="all")
	public String getall()
	{
		return "SelectProd";
	}
	
	@RequestMapping(value="sendProdId" , method=RequestMethod.GET)
	public String showProdDetailFeedbackSimiliarType(@RequestParam("pId") String prodId, Model model) 
	{	
		Product product=capstoreService.productDetails(prodId);
		model.addAttribute("prod", product);
		
		List<Feedback> feedback = capstoreService.productFeedback(prodId);
        model.addAttribute("feedbk", feedback);
		
		List<Product> proname = capstoreService.similartype(product.getSubCategoryId());
        model.addAttribute("proname",proname);
		
        System.out.println(proname);
		
		
		return "ProductPage";			
	}
	
}
