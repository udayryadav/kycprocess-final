package com.boa.kycprocess.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNT")
public class Account {

	/*
	 * 
Cascading is about persistence actions involving one object propagating to other objects via an association. 
Cascading can apply to a variety of Hibernate actions, and it is typically transitive. 
The "cascade=..." attribute of the annotation that defines the association says what actions should cascade for that association.

Cascade = "all" means to apply all primary cascade types. As of Hibernate 5.3, these types are:
"delete" / "remove",
"detach" / "evict",
"merge",
"lock",
"persist",
"refresh",
"replicate",
"save_update" / "update"
(Some of those cascade type names are old and/or deprecated.)
There are three more compound types:
"all_delete_orphan" - means the same as "all" plus enabling the deletion of entities that are orphaned by the cascading.
"delete_orphan" - means "delete" plus orphan deletion.
"none" - means no cascading.
	 * 
	 * 
	 */
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ACCOUNT_ID")
	private long accountId;

	@Column(name = "ACCOUNT_TYPE")
	private String accountType;

	@Column(name = "CUSTOMER_ID")
	private long customerId;

	@Column(name = "BALANCE")
	private double balance;

	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JoinColumn(name = "CUSTOMER_ID_FK")
	private Customer customer;

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
}
