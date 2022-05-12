package com.dio.santander.bankline.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.santander.bankline.api.model.Holder;

public interface HolderRepository extends JpaRepository<Holder, Integer>{

	
}
