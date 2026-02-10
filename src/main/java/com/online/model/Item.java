package com.online.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class Item {
	
	private Long id;
	
	@NotBlank(message = "Name is required")
	private String name;
	
	private String description;
	
	 @NotNull(message = "Price is required")
	 @Positive(message = "Price must be greater than 0")
	private double price;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getPrice() {
		return price;
	}

	

}
