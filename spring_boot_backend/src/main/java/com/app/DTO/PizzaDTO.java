package com.app.DTO;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.app.entity.Price;




public class PizzaDTO {
	
	@NotBlank
    private String name;
	
	@NotNull
    private List<Price> prices;
	
	@NotBlank
    private String category;
	
	
    private String image;
	
	@NotBlank
    private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Price> getPrices() {
		return prices;
	}

	public void setPrices(List<Price> prices) {
		this.prices = prices;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public PizzaDTO() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	

}
