package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.bean.LimitConfiguration;

@RestController
public class LimitsConfiguration {
	
	@Autowired
private Configuration config;
	
	@GetMapping("/limit")
	public LimitConfiguration retreiveLimitsFromConfiguration()
	{
		return new LimitConfiguration(config.getMinimum(), config.getMaximum());
		
	}
	

}
