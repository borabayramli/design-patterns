package com.works.threedays.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.works.threedays.model.Product;
import com.works.threedays.repostories.ProductRepository;

@Service
public class BOProduct {
	
	@Autowired ProductRepository productRepository;
	
	public List<Product> fncPriceSearch( int price ) {
		List<Product> lss = productRepository.fncSearch(price);
		return lss;
	}
	
	
}
