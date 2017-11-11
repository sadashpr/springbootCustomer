package com.bulletproof;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Parser {

    private static final String csvFile = "Book1.csv";
    private static ArrayList<Customer> customers = new ArrayList<>();

    void parseData() throws FileNotFoundException, IOException {

	BufferedReader bReader = new BufferedReader(
		new InputStreamReader(this.getClass().getResourceAsStream("/" + csvFile)));

	String[] str;
	String line;
	while ((line = bReader.readLine()) != null) {
	    str = line.split(",");
	    Customer c = new Customer(str[0], str[1], str[2]);
	    customers.add(c);
	    // System.out.println(c);
	}

    }

    public String getJsondata() throws JsonProcessingException {

	ObjectMapper mapper = new ObjectMapper();
	String jsonStr = mapper.writeValueAsString(customers);

	return jsonStr;
    }

}
