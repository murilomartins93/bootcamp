package com.dio.santander.bankline.api.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "tab_transaction")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "date_time")
	private LocalDateTime dateTime;
	private String description;
	private Double value;
	
	@Enumerated(EnumType.STRING)
	private TransactionType type;
	
	@Column(name = "id_acc")
	private Integer idAcc;
	
	public Transaction() {
	}

	public Transaction(Integer id, LocalDateTime dateTime, String description, Double value, TransactionType type) {
		this.id = id;
		this.dateTime = dateTime;
		this.description = description;
		this.value = value;
		this.type = type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

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
