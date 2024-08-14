package com.marcelmariani.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.marcelmariani.entity.CustomerRedis;
import com.marcelmariani.service.CustomerRedisService;

@RestController
@RequestMapping("/v2/customer")
public class CustomerControllerV2 {

	@Autowired
	private CustomerRedisService customerRedisService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public CustomerRedis save(@RequestBody CustomerRedis customerRedis) {
		return customerRedisService.save(customerRedis);
	}

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<CustomerRedis> findAll() {
		return customerRedisService.findAll();
	}

}
