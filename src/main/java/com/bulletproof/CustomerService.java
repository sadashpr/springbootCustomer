package com.bulletproof;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class CustomerService {

    // API to send all customer data.( application 1)
    @RequestMapping(value = "/rest/showAllCustomer", method = RequestMethod.POST)
    public String sendAllCustomersJSON() {
	return CsvJsonApplication.jsonCustomer;
    }

    @RequestMapping(value = "/rest/customers", method = RequestMethod.POST)
    public String showAllCustomers1() {
	return CsvJsonApplication.jsonCustomer;
    }

    @RequestMapping(value = "/rest/addAllCustomer", method = RequestMethod.POST)
    public String addAllCustomers(@RequestBody(required = true) String data) {

	System.out.println(data);
	addAllCustomers(data);
	String msg = "all Customers data added to database";
	return msg;
    }
}
