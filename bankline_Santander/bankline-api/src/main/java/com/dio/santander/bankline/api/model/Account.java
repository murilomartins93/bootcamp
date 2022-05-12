package com.dio.santander.bankline.api.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Account {
	
	@Column(name = "acc_number")
	private Long number;
	
	@Column(name = "acc_balance")
	private Double balance;
	
	public Account() {
	}
	
	public Account(Long number, Double balance) {
		this.number = number;
		this.balance = balance;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
}
