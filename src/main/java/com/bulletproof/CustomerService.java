package com.bulletproof;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/rest/customer")
public class CustomerService {
		 
	@RequestMapping(value="/",method = RequestMethod.GET)
	public HashMap<Long,Customer> getAllCustomers(){
		return CsvJsonApplication.hmCustomer;
	}
	
}
	
	
