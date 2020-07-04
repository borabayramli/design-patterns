package com.works.threedays.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.works.threedays.model.Product;
import com.works.threedays.repostories.ProductRepository;

import channel.Customer;
import channel.Item;
import channel.Order;
import channel.OrderService;
import channel.OrderWorker;
import props.User;

@Controller
public class HomeController {
	
	Random rd = new Random();
	
	@GetMapping({"", "/"})
	public String home( Model model ) {
		model.addAttribute("rd", rd.nextInt(100));
		call();
		return "home";
	}
	
	
	@PostMapping({"", "/"})
	public String homeP( Model model ) {
		model.addAttribute("rd", rd.nextInt(100));
		call();
		return "home";
	}
	
	
	@PostMapping("/login")
	public String login( User us ) {
		System.out.println("Name : " + us.getUserName() + " Pass : " + us.getUserPass());
		return "redirect:";
	}
	
	
	public void call() {
		
		OrderWorker orderWorker = new OrderWorker();
		Thread th1 = new Thread(orderWorker);
		th1.start();
		
		Order order = new Order();
		Customer customer = new Customer();
		Item item = new Item();
		List<Item> lsx = new ArrayList<Item>();
		lsx.add(item);
		order.setCustomer(customer);
		order.setItems(lsx);
		order.setId(1000);
		
		OrderService orderService = new OrderService();
		orderService.newOrder(order);
		orderService.newOrder(order);
		orderService.newOrder(order);
		orderService.newOrder(order);
		orderService.newOrder(order);
		orderService.newOrder(order);
		orderService.newOrder(order);
		
		
	}
	
	
	

}
