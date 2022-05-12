package com.dio.santander.bankline.api.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.santander.bankline.api.dto.NewHolder;
import com.dio.santander.bankline.api.model.Account;
import com.dio.santander.bankline.api.model.Holder;
import com.dio.santander.bankline.api.repository.HolderRepository;

@Service
public class HolderService {

	@Autowired
	private HolderRepository repository;
	 
	public void save(NewHolder newHolder) {
		Holder holder = new Holder();
		holder.setCpf(newHolder.getCpf());
		holder.setName(newHolder.getName());
		
		Account acc = new Account();
		acc.setBalance(0.0);
		acc.setNumber(new Date().getTime());;
		
		holder.setAccount(acc);
		repository.save(holder);
	}
}
