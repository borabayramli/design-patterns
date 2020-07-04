package com.works.twodays.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.BridgeMethodResolver;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import adapter.AdapterClass;
import adapter.IUser;
import birdge.BridgeAction;
import builder.Araba;
import builder.SiparisBuilder;
import builder.SiparisManager;
import objpool.Connection;
import objpool.DataSource;
import singleton.Singleton;

@Controller
public class HomeController {
	
	// builder
	SiparisManager manager = new SiparisManager();
	List<Araba> cls = new ArrayList<Araba>();
	
	public HomeController() {
		System.out.println("HomeController call");
	}
	
	@GetMapping("")
	public String home( Model model ) {
		//singletonCall();
		// objPool Fnc Call
		objPool();
		model.addAttribute("cls", cls);
		
		// adapter call
		IUser adc = new AdapterClass();
		adc.fncUserName();
		
		// bridge call
		BridgeAction br = new BridgeAction();
		br.action();
		
		
		return "home";
	}
	

	public void singletonCall() {
		for (int i = 0; i < 1000; i++) {
			Singleton.instance().write(i);
		}
	}
	
	
	
	@PostMapping("/order")
	public String order( 
			@RequestParam String marka,
			@RequestParam String model,
			@RequestParam String renk,
			@RequestParam int beygirGucu
			) {
		
		Araba ar = manager.createOrder(marka, model, renk, beygirGucu);
		cls.add(ar);
		return "redirect:";
	}
	
	
	// obj pool call
	public void objPool() {
		try {
			Connection cn1 = DataSource.getConnection();
			Connection cn2 = DataSource.getConnection();
			Connection cn3 = DataSource.getConnection();
			
			//Connection cn4 = DataSource.getConnection();
			DataSource.relase(cn1);
			DataSource.relase(cn2);
			DataSource.relase(cn3);
			
			
			List<Connection> ls = DataSource.instance.pool;
			for (int i = 0; i < ls.size(); i++) {
				ls.get(i).write(i);
			}
			
			
		} catch (Exception e) {
			System.err.println("objPool error : " + e);
		}
		
		
	}
	
	
}
