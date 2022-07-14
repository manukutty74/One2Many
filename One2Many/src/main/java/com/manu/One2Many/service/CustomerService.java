package com.manu.One2Many.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manu.One2Many.dto.CusAcc;
import com.manu.One2Many.entity.Customer;
import com.manu.One2Many.others.ResourceNotFoundException;
import com.manu.One2Many.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	
	/*
	 * private ArrayList<Customer> customerList = new ArrayList<>(Arrays.asList( new
	 * Customer(1,"Aax","100 Ave","Aax@email.com"), new
	 * Customer(2,"Bax","200 Ave","Bax@email.com"), new
	 * Customer(3,"Cax","300 Ave","Cax@email.com") ));
	 */
	
	
	
	public String hello() {
		return "Hello SpringBoot + JPA + MySQL";
	}
	
	public ArrayList<Customer> getAllCustomers(){
	     return (ArrayList<Customer>) customerRepository.findAll();
	}
		
	public Customer getCustomerById(long customerId) {
		Optional<Customer> customer = customerRepository.findById(customerId);
		if (customer.isPresent()) {
			 return customer.get();
		} else {
			throw new ResourceNotFoundException(customer,"ID",customerId);
		}
			
	}
	
	public Customer addCustomer(Customer customer) {
	  	return customerRepository.save(customer);
	}
	
	
	public Customer updateCustomer(Customer newCustomer, long customerId) {
		Optional<Customer> oldCustomer = customerRepository.findById(customerId);
		if (oldCustomer.isPresent()) {
			 Customer customer = new Customer();
			 customer = oldCustomer.get();
	         customer.setCustomerName(newCustomer.getCustomerName());
	         customer.setCustomerAddress(newCustomer.getCustomerAddress());
	         customer.setCustomerEmail(newCustomer.getCustomerEmail());
	         return customerRepository.save(customer);
			 
		} else {
			throw new ResourceNotFoundException(oldCustomer,"ID",customerId);
		}
		
	}
	
	public Customer deleteCustomer( long customerId,Customer customer) {
		Optional<Customer> oldCustomer = customerRepository.findById(customerId);
		if (oldCustomer.isPresent()) {
			   customerRepository.delete(customer);
			   return customer;
		} else {
			throw new ResourceNotFoundException(oldCustomer,"ID",customerId);
		}	
	 }

	
	public List<CusAcc> getCusAccSummary() {
		return customerRepository.getCusAccSummary();
	}
	
		
	
}
