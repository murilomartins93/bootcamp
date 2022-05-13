package com.dio.santander.bankline.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.santander.bankline.api.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer>{

     public List<Transaction>findByidAcc(Integer idAcc);

}
