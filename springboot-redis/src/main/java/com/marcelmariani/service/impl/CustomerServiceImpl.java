package com.marcelmariani.service.impl;

import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.marcelmariani.controller.dto.filter.CustomerFilter;
import com.marcelmariani.entity.Customer;
import com.marcelmariani.repository.CustomerRepository;
import com.marcelmariani.service.CustomerService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

	private final CustomerRepository customerRepository;

	public Customer save(Customer Customer) {
		return customerRepository.save(Customer);
	}

	public Page<Customer> listCustomer(CustomerFilter customerFilter, Pageable pageable) {
		Customer customer = Customer.builder()
				.documentId(customerFilter.getDocumentId())
				.name(customerFilter.getName())
				.email(customerFilter.getEmail())
				.build();

		ExampleMatcher exampleMatcher = ExampleMatcher.matching()
				.withIgnoreNullValues()
				.withIgnoreCase()
				.withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);

		Example example = Example.of(customer, exampleMatcher);

		return customerRepository.findAll(example, pageable);
	}

	public Optional<Customer> findById(String id) {
		return this.customerRepository.findById(id);
	}

}