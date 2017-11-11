package com.bulletproof.dao;

import org.springframework.data.repository.CrudRepository;

import com.bulletproof.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
