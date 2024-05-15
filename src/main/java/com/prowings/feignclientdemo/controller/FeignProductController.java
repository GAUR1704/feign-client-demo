package com.prowings.feignclientdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.feignclientdemo.service.FeignService;

@RestController
public class FeignProductController {
	
	@Autowired
	FeignService feignService;

	@GetMapping("/productFeign")
	public String ProductFeign()
	{
		return feignService.product();
	}
}
