package com.dio.santander.bankline.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.santander.bankline.api.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer>{

}
