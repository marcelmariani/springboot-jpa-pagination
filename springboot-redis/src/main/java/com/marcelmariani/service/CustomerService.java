package com.marcelmariani.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.marcelmariani.controller.dto.filter.CustomerFilter;
import com.marcelmariani.entity.Customer;

public interface CustomerService {

	Customer save(Customer customer);

	Page<Customer> listCustomer(CustomerFilter customerFiltro, Pageable pageable);

//	Optional<Customer> findById(String id);

}
