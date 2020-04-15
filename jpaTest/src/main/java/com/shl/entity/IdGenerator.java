package com.shl.entity;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public class IdGenerator {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer ID;
	@Column(length=50)
	private String PK_NAME;
	
	private long PK_VALUE;
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getPK_NAME() {
		return PK_NAME;
	}
	public void setPK_NAME(String pK_NAME) {
		PK_NAME = pK_NAME;
	}
	public long getPK_VALUE() {
		return PK_VALUE;
	}
	public void setPK_VALUE(long pK_VALUE) {
		PK_VALUE = pK_VALUE;
	}
	
}
