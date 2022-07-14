package com.manu.One2Many.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.manu.One2Many.dto.CusAcc;
import com.manu.One2Many.entity.*;


public interface CustomerRepository extends CrudRepository<Customer, Long>{

	@Query("SELECT new com.manu.One2Many.dto.CusAcc (c.customerId,c.customerName,a.accountId,a.accountCategory,a.accountIntRate,a.accountBalance) FROM Customer c JOIN c.account a")   
	public List<CusAcc> getCusAccSummary();
		
	
}
