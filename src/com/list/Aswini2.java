package com.list;

import java.util.ArrayList;
import java.util.List;

public class Aswini2 {

public static void main(String[] args) {
	
		Aswini1 a= new Aswini1();	
		a.setId(1268);
		a.setName("Jack");
				
		Aswini1 b = new Aswini1 ();
		
		b.setId(11115);
		b.setName("Lucky");
		
		Aswini1 c = new Aswini1();
		
		c.setId(6547);
		c.setName("Jerry");
		
		List<Aswini1>ap= new ArrayList();
		ap.add(a);
		ap.add(b);
		ap.add(c);
		
for (int i=0; i<ap.size(); i++) {
		Aswini1 Aswini1 = ap.get(i);
		int id= Aswini1.getId();
		System.out.println(id);
		String name = Aswini1.getName();
		System.out.println(name);
	}
}
}
