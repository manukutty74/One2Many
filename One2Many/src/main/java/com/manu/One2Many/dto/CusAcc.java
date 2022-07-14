package com.manu.One2Many.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class CusAcc {
 
 private long CustomerId;
 private String CustomerName;
 private long AccountId;
 private String AccountCategory;
 private double AccountIntRate;
 private double AccountBalance; 
	
  
	
}
