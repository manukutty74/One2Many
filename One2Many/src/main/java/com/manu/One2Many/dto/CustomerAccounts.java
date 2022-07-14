package com.manu.One2Many.dto;

import com.manu.One2Many.entity.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class CustomerAccounts {

		private Customer customer;
}
