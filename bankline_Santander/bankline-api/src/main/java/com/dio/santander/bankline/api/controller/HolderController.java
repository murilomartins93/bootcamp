package com.dio.santander.bankline.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.bankline.api.dto.NewHolder;
import com.dio.santander.bankline.api.model.Holder;
import com.dio.santander.bankline.api.repository.HolderRepository;
import com.dio.santander.bankline.api.service.HolderService;

@RestController
@RequestMapping("/holders")
public class HolderController {
	
	@Autowired
	private HolderRepository repository;
	
	@Autowired
	private HolderService service;
	
	@GetMapping
	public List<Holder> findAll(){
		return repository.findAll();
	}
	
	@PostMapping
	public void save(@RequestBody NewHolder newHolder) {
		service.save(newHolder);
	}
	
}
