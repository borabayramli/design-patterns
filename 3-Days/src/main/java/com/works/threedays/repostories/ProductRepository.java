package com.works.threedays.repostories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.works.threedays.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	@Query(" from Product p where p.pprice >= ?1")
	public List<Product> fncSearch(int price);
	
}
