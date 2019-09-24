package com.boa.kycprocess.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boa.kycprocess.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
