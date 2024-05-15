package com.prowings.feignclientdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeignService {
	
	@Autowired
	FeignApiClient apiClient;

	public String product() {
		
		return apiClient.getProduct();
		
	}
	
	

}
