package com.example.demo.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConverterController {
	
	
	@Autowired
	private CurrencyExchangeServiceProxy proxy;
	 
	
	@GetMapping("currencyconversion/{from}/{to}/{quantity}")
	public CurrencyConversionBean convertCurrency(@PathVariable String from,@PathVariable String to, @PathVariable BigDecimal quantity)
	{
		
		
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
	 ResponseEntity<CurrencyConversionBean> responseEntity=new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/{from}/{to}", CurrencyConversionBean.class,uriVariables);
	 
	  CurrencyConversionBean  response=responseEntity.getBody();
		return new CurrencyConversionBean(response.getId(),from,to,response.getConversionMultiple(),quantity,quantity.multiply(response.getConversionMultiple()), response.getPort());
		
	}
 
	//using feignclient for service invocation
	
	@GetMapping("feigncurrencyconversion/{from}/{to}/{quantity}")
	public CurrencyConversionBean convertCurrencyFeign(@PathVariable String from,@PathVariable String to, @PathVariable BigDecimal quantity)
	{
		
		
		
	  CurrencyConversionBean  response=proxy.retreiveExchangevalue(from, to);
		return new CurrencyConversionBean(response.getId(),from,to,response.getConversionMultiple(),quantity,quantity.multiply(response.getConversionMultiple()), response.getPort());
		
	}
 
}
