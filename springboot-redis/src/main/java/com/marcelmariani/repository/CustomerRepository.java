package com.marcelmariani.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelmariani.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {

}