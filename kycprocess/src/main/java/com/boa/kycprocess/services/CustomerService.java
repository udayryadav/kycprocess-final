package com.boa.kycprocess.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boa.kycprocess.models.Customer;
import com.boa.kycprocess.repositories.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	// Insert query
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	// Select all
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	// Select by id
	public Customer getCustomerById(Long id) {
		return customerRepository.findById(id).orElse(null);
	}

}
