package com.bulletproof;


import java.util.HashMap;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CsvJsonApplication {

	public static HashMap<Long, Customer> hmCustomer;

	public static void main(String[] args) {

		hmCustomer = new HashMap<Long, Customer>();

		Customer c1 = new Customer("Pradeep", "Sadashiv", "Bangalore");
		hmCustomer.put((long) 1,c1);
		
		Customer c2 = new Customer("Rajesh", "Pai", "Sydney");
		hmCustomer.put((long) 2,c2);
		
	}

}
