package com.tja;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.mysema.query.collections.CollQueryFactory;
import com.tja.domain.Address;
import com.tja.domain.Customer;
import com.tja.domain.EmailAddress;
import com.tja.domain.QCustomer;

public class Main {

	public static List<Customer> getDatas() {
		List<Customer> customers = new ArrayList<Customer>();
		
		//构造集合数据
		for(int i = 0 ;i<10;i++) {
			Customer c = new Customer();
			c.setFirstName("firstName-"+i);
			c.setFirstName("lastName-"+i);
			
			EmailAddress email = new EmailAddress();
			email.setEmail("lean-"+i+"@l63.com");
			c.setEmailAddress(email);
			
			Set<Address> ads = new HashSet<Address>();
			Address a1 = new Address();
			a1.setCite("cite-"+i);
			a1.setStreet("street-"+i);
			
			Address a2 = new Address();
			a2.setCite("cite-copy-"+i);
			a2.setStreet("street-copy-"+i);
			
			ads.add(a1);
			ads.add(a2);
			c.setAddresses(ads);
			customers.add(c);
		}
		
		return customers;
	}
	
	
	public static void main(String[] args) {
		QCustomer customer = QCustomer.customer;
		
        List<Customer> datas = Main.getDatas();
        
        List<Customer> cs = CollQueryFactory.from(customer, datas).where(customer.emailAddress.email.contains("7")).list(customer);
        
        System.out.println(cs.size());
        System.out.println("firstName:"+cs.get(0).getFirstName());
        System.out.println("email:"+cs.get(0).getEmailAddress().getEmail());
	}
	
}
