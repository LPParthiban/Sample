package org.sample;

import java.util.HashSet;
import java.util.Set;

import com.list.Company;

public class Staff {
	
	public static void main(String[] args) {
		
		Company a= new Company();	
		a.setId(1115);
		a.setName("Jack");
				
		Company b = new Company ();
		
		b.setId(1234);
		b.setName("Lucky");
		
		Company c = new Company();
		c.setId(6547);
		c.setName("Cherry");
		
		Set si=  new HashSet<>();
		
		si.add(a.getId());
		si.add(a.getName());
		
		si.add(b.getId());
		si.add(c.getName());
		
		si.add(c.getId());
		si.add(c.getName());
		
		for (Object entery : si) {
			System.out.println(entery);
		}
		
	}}
	
	
	
	