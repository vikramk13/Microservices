package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	@Autowired
	private Environment env;
	
	@Autowired
	private CurrencyExchangeRepository rep;
	      
	@GetMapping("currency-exchange/{from}/{to}")
	public ExchangeValue retreiveExchangeValue(@PathVariable String  from ,@PathVariable String to)
	{
		 ExchangeValue exchangevalue = rep.findByFromAndTo(from, to);
		/*
		 * exchangevalue.setPort(
		 * Integer.parseInt(env.getProperty("local.server.port")));
		 */
		return exchangevalue;
		
		
		
	}
}
