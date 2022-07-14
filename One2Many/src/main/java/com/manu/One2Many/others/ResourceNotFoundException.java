package com.manu.One2Many.others;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

	
	private static final long serialVersionUID = 1L;
	private Object resource;
	private String fieldName;
	private long fieldValue;
	
	
	public ResourceNotFoundException(Object resource, String fieldName, long customerId) {
		super(String.format("%s not found with %s : '%s'",resource,fieldName,customerId));
		this.resource = resource;
		this.fieldName = fieldName;
		this.fieldValue = customerId;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public Object getResource() {
		return resource;
	}


	public String getFieldName() {
		return fieldName;
	}


	public Object getFieldValue() {
		return fieldValue;
	}

	
	
}
