package com.tja.domain;

import java.util.HashSet;
import java.util.Set;

import com.mysema.query.annotations.QueryEntity;

@QueryEntity
public class Customer  {

	private String firstName;
	
	private String lastName;
	
	private EmailAddress emailAddress;
	
	private Set<Address> addresses = new HashSet<Address>();

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public EmailAddress getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(EmailAddress emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}
	
	
}
