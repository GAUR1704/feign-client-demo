package com.prowings.feignclientdemo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "productClient", url = "http://localhost:8084/product-management")
public interface FeignApiClient {
	
	@GetMapping(value = "/products")
	String getProduct();

}
