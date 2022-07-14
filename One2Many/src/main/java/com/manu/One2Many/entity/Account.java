package com.manu.One2Many.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.*;

@Data
@Entity  
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor 

public class Account {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
    private Long accountId;
	private String accountCategory;
	private double accountBalance;
	private double accountIntRate;
//	private Long customerId;
	
		
}
