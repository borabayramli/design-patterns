package com.works.threedays.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.works.threedays.bo.BOProduct;
import com.works.threedays.model.Product;
import com.works.threedays.repostories.ProductRepository;

@Controller
public class ProdcutController {
	
	@Autowired ProductRepository prepo;
	@Autowired BOProduct bop;
	
	@GetMapping("/product")
	public String product( Model model ) {
		model.addAttribute("ls", bop.fncPriceSearch(1000));
		return "product";
	}
	
	@PostMapping("/productInsert")
	public String productInsert( Product pr ) {
		Product pro =  prepo.save(pr);
		System.out.println("pid : " + pro.getPid());
		return "redirect:/product";
	}
	
	
	@GetMapping("/productDelete/{pid}")
	public String productDelete( @PathVariable int pid ) {
		prepo.deleteById(pid);
		return "redirect:/product";
	}

}
