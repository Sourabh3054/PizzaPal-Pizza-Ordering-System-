package com.app.entity;


//{
//    name: "Margherita",
//    varients: ["small", "medium", "large"],
//    prices: [
//      {
//        small: 99,
//        medium: 199,
//        large: 399,
//      },
//    ],
//    category: "veg",
//    image: "/Data/pizza.png",
//    description: "Classic delight with 100% real mozzarella cheese",
//}


import javax.persistence.*;



import java.util.ArrayList;
import java.util.List;


public class Pizza extends BaseEntity {
	
    @Column(length = 30, unique = true)
    private String name;
    
    
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "pizza_price", joinColumns = @JoinColumn(name = "pizza_id"))
    private List<Price> prices = new ArrayList<Price>(); // If using the embeddable class
    
    @Column(length = 30)
    private String category;
    
    @Column(length = 30)
    private String image;
    
    @Column(length = 255)
    private String description;

	@Override
	public String toString() {
		return "Pizza [name=" + name + ", prices=" + prices + ", category=" + category + ", image=" + image
				+ ", description=" + description + "]";
	}

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

	public Pizza() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	
    
    

}
