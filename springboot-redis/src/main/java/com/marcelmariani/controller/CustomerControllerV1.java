package com.marcelmariani.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.marcelmariani.controller.dto.filter.CustomerFilter;
import com.marcelmariani.entity.Customer;
import com.marcelmariani.service.impl.CustomerServiceImpl;

@RestController
@RequestMapping("/v1/customer")
public class CustomerControllerV1 {

	@Autowired
	private CustomerServiceImpl customerService;

	@Autowired
	private ModelMapper modelMapper;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Customer salvar(@RequestBody Customer customer) {
		return customerService.save(customer);
	}

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public Page<Customer> listCustomer(CustomerFilter customerFilter, Pageable pageable) {
		return customerService.listCustomer(customerFilter, pageable);
	}

//	@GetMapping("/{id}")
//	@ResponseStatus(HttpStatus.OK)
//	public Customer buscarCustomerPorId(@PathVariable("id") String id) {
//		return customerService.findById(id)
//				.orElseThrow(() -> new ResponseStatusException(HttpStatus
//						.NOT_FOUND, "Customer not found."));
//	}

}
