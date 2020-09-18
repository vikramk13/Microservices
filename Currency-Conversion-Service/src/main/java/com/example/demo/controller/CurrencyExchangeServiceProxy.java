package com.example.demo.controller;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="Currency-Exchange-Service")
@RibbonClient(name="Currency-Exchange-Service")
public interface CurrencyExchangeServiceProxy {

	@GetMapping("currency-exchange/{from}/{to}")
	public CurrencyConversionBean retreiveExchangevalue(@PathVariable("from") String  from ,@PathVariable("to") String to);
}
