package com.boa.kycprocess.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boa.kycprocess.models.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
