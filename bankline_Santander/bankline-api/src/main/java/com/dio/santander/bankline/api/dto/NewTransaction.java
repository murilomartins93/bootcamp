package com.dio.santander.bankline.api.dto;

import com.dio.santander.bankline.api.model.TransactionType;

public class NewTransaction {

	private String description;
	private Double value;
	private TransactionType type;
	private Integer idAcc;
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Double getValue() {
		return value;
	}
	
	public void setValue(Double value) {
		this.value = value;
	}
	
	public TransactionType getType() {
		return type;
	}
	
	public void setType(TransactionType type) {
		this.type = type;
	}
	
	public Integer getIdAcc() {
		return idAcc;
	}

	public void setIdAcc(Integer idAcc) {
		this.idAcc = idAcc;
	}

}
