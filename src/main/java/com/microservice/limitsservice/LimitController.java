package com.microservice.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

	@Autowired
	private Limit limit;
	
	@GetMapping("/limits")
	public String getLimits() {
		return "limit = " + limit.getMax();
	}
}
