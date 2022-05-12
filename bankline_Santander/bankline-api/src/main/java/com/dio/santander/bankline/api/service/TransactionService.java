package com.dio.santander.bankline.api.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.santander.bankline.api.dto.NewTransaction;
import com.dio.santander.bankline.api.model.Holder;
import com.dio.santander.bankline.api.model.Transaction;
import com.dio.santander.bankline.api.model.TransactionType;
import com.dio.santander.bankline.api.repository.HolderRepository;
import com.dio.santander.bankline.api.repository.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	private TransactionRepository repository;
	
	@Autowired
	private HolderRepository holderRepository;
	
	public void save(NewTransaction newTransaction) {
		Transaction transaction = new Transaction();
		
		/*double value = newTransaction.getType() == TransactionType.INCOME ?
				newTransaction.getValue() : newTransaction.getValue() * -1;
		*/
		
		double value = newTransaction.getValue();
		if(newTransaction.getType() == TransactionType.EXPENSE) {
			value *= -1;
		}
		
		transaction.setDateTime(LocalDateTime.now());
		transaction.setDescription(newTransaction.getDescription());
		transaction.setIdAcc(newTransaction.getIdAcc());
		transaction.setType(newTransaction.getType());
		transaction.setValue(value);
		
		Holder holder = holderRepository.findById(newTransaction.getIdAcc()).orElse(null);
		
		if(holder != null) {
			holder.getAccount().setBalance(holder.getAccount().getBalance() + value);
			holderRepository.save(holder);
		}
		
		repository.save(transaction);
	}
	
}
