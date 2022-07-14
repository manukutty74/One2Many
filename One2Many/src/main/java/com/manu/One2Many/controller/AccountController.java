package com.manu.One2Many.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manu.One2Many.entity.Account;
import com.manu.One2Many.service.AccountService;



@RestController

@RequestMapping("/CustomerAccount")
public class AccountController {
	
	Logger logger = LoggerFactory.getLogger(AccountController.class);

//@Autowired
 private AccountService accountService; 
 
@GetMapping("/helloac")
public String helloac() {
	return "Hello from Ac";
}
 
@GetMapping("/all")
	public ArrayList<Account> getAllAccounts(){
		 return accountService.getAllAccounts();
	}

@PostMapping("/Customer/{customerId}/Account")
    public Account addAccount(@RequestBody Account account , @PathVariable long customerId) {
	logger.trace("Post method of AccountService accessed");
	  return accountService.addAccount(account,customerId);
}
	
}
