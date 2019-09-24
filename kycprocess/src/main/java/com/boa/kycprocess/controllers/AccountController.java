package com.boa.kycprocess.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.boa.kycprocess.models.Account;
import com.boa.kycprocess.services.AccountService;

@RestController
public class AccountController {

	@Autowired
	private AccountService accountService;

	@CrossOrigin("*")
	@PostMapping("/addAccount/{customerId}")
	public @ResponseBody Account saveAccount(@RequestBody Account account,
			@PathVariable("customerId") long customerId) {
		return accountService.addAccount(account, customerId);
	}

	@CrossOrigin("*")
	@GetMapping("/getAccounts")
	public List<Account> findAllAccounts() {
		return accountService.getAllAccount();
	}

	@CrossOrigin("*")
	@GetMapping("/getAccountById/{id}")
	public Account findAccountById(@PathVariable("id") long id) {
		return accountService.getAccountByCustomerId(id);
	}
}
