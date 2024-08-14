package com.marcelmariani.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcelmariani.entity.CustomerRedis;
import com.marcelmariani.repository.CustomerRedisRepository;

@Service
public class CustomerRedisService {

	@Autowired
	private CustomerRedisRepository customerRedisRepository;

	public CustomerRedis save(CustomerRedis customerRedis) {
		return customerRedisRepository.save(customerRedis);
	}

	public List<CustomerRedis> findAll() {
		return (List<CustomerRedis>) customerRedisRepository.findAll();
	}

}
