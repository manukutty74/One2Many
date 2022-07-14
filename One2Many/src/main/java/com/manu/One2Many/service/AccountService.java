package com.manu.One2Many.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manu.One2Many.entity.Account;
import com.manu.One2Many.repository.AccountRepository;

@Service

public class AccountService {

 @Autowired	
 private AccountRepository accountRepository; 

 
  public ArrayList<Account> getAllAccounts(){
     return (ArrayList<Account>) accountRepository.findAll();
   }
  
  public Account addAccount(Account account, long customerId) {
	//  account.setCustomerId(customerId);
	  return accountRepository.save(account);
	  
  }
  
} 

 

