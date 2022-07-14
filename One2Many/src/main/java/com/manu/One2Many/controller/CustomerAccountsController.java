package com.manu.One2Many.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.manu.One2Many.dto.CusAcc;
import com.manu.One2Many.dto.CustomerAccounts;
import com.manu.One2Many.entity.Customer;
import com.manu.One2Many.service.CustomerService;

@RestController
public class CustomerAccountsController {

@Autowired
 private CustomerService customerService;

  
	
 @PostMapping("/CustomerAccounts")
    public Customer createCustomerAccounts(@RequestBody CustomerAccounts customerAccount) {
	 return customerService.addCustomer(customerAccount.getCustomer());
   }

 @GetMapping("/CustomerAccounts/All")
  public ArrayList<Customer> getAllCustomerAccounts() {
	return customerService.getAllCustomers(); 
  }
  
 @GetMapping("/CustomerAccounts/Summary")
  public List<CusAcc> getCusAccSummary()  {
	   return customerService.getCusAccSummary();
	   }
 
}
