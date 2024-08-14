package com.marcelmariani.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.marcelmariani.entity.CustomerRedis;

@Repository
public interface CustomerRedisRepository extends CrudRepository<CustomerRedis, String> {

}
