package com.muniraja.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<Book> set=new HashSet<Book>();
		
		//adding elements to the AL by using add() method
			set.add(new Book(10,"os"));
			set.add(new Book(10,"toc"));
			set.add(new Book(20,"algo"));
			set.add(new Book(30,"ds"));
			System.out.println(set);
			
			Set<Customer> customers = new HashSet<Customer>();
			customers.add(new Customer(102, "Sachin"));
			customers.add(new Customer(106, "Sanjay"));
	        customers.add(new Customer(108, "Rajeev"));
	        customers.add(new Customer(103, "Chris"));
	        customers.add(new Customer(104, "Sarath"));
	        /*
	          HashSet will use the `equals()` & `hashCode()` implementations 
	          of the Customer class to check for duplicates and ignore them
	        */
	        customers.add(new Customer(102, "Ramesh"));
	        System.out.println(customers);
	        
	        Set<Customer> lhs = new LinkedHashSet<Customer>();
	        lhs.add(new Customer(105, "Hari"));
	        lhs.add(new Customer(102, "Sachin"));
	        lhs.add(new Customer(103, "Krishna"));
	        /*
	          HashSet will use the `equals()` & `hashCode()` implementations 
	          of the Customer class to check for duplicates and ignore them
	        */
	        lhs.add(new Customer(105, "sarath"));

	        System.out.println(lhs);
			
			

	}

}
