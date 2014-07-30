package com.tja.domain;

import com.mysema.query.annotations.QueryEntity;

@QueryEntity
public class Address {

	private String cite;
	
	private String street;

	public String getCite() {
		return cite;
	}

	public void setCite(String cite) {
		this.cite = cite;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	
	
	
}
