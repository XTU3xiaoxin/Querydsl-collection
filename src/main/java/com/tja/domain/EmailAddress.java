package com.tja.domain;

import com.mysema.query.annotations.QueryEmbeddable;

@QueryEmbeddable
public class EmailAddress {

	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
