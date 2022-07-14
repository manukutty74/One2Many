package com.manu.One2Many.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manu.One2Many.entity.Customer;
import com.manu.One2Many.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/hello")
	public String hello() {
		return customerService.hello();
	}
	
	@GetMapping("/all")
    public ArrayList<Customer> getAllCustomers() {
      return customerService.getAllCustomers();
	}
   
	@GetMapping("/{customerId}")
	 public ResponseEntity<Customer> getCustomerById(@PathVariable long customerId) {
		return new ResponseEntity<Customer>(customerService.getCustomerById(customerId),HttpStatus.OK);
	}
	 
	@PostMapping("/{customerId}")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer,@PathVariable  long customerId) {
		return new ResponseEntity<Customer>(customerService.addCustomer(customer),HttpStatus.CREATED);
	}
	
	
	@PutMapping("/{customerId}")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer,@PathVariable long customerId) {
		return new ResponseEntity<Customer>(customerService.updateCustomer(customer, customerId),HttpStatus.OK);
	}
	
	@DeleteMapping("/{customerId}")
	public ResponseEntity<Customer> deleteCustomer(@PathVariable long customerId,@RequestBody Customer customer) {
		return new ResponseEntity<Customer>(customerService.deleteCustomer(customerId,customer),HttpStatus.OK);
	}
	
	
}
