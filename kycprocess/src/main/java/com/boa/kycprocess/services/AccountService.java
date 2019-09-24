package com.boa.kycprocess.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.boa.kycprocess.models.Account;
import com.boa.kycprocess.models.Customer;
import com.boa.kycprocess.repositories.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private CustomerService customerService;

	@Autowired
	private AccountRepository accountRepository;

	private Customer customer;

	// Insert query
	public Account addAccount(Account account, long customerId) {
		customer = customerService.getCustomerById(customerId);
		account.setCustomer(customer);
		return accountRepository.save(account);
	}

	// Select all
	public List<Account> getAllAccount() {
		return accountRepository.findAll();
	}

	// Select by id
	public Account getAccountByCustomerId(Long id) {
		return accountRepository.findById(id).orElse(null);
	}

	// delete account by id
	public void deleteAccount(Long accountNo) {
		accountRepository.deleteById(accountNo);
	}

	public void updateAccount(Account account, long customerId) {
		customer = customerService.getCustomerById(customerId);
		account.setCustomer(customer);
		account.setBalance(account.getBalance());
		accountRepository.save(account);
	}
}
