package com.manu.One2Many.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.*;

/*Indicated to Spring that this is Object to Map to a Table in RDBMS 
 At a minimum , need table name and id . 
 The auto id generation is also specified. Will create a table when in RDBMS on its own.
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
    private Long customerId;
	private String customerName;
	private String customerAddress;
	private String customerEmail;
	
		
	  @OneToMany(targetEntity=Account.class,cascade = CascadeType.ALL)
	  @JoinColumn(name = "cust_id",referencedColumnName = "customerId") 
	  private Set<Account> account;
	 
	 
}
