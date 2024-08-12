package com.app.entity;

import javax.persistence.Embeddable;



@Embeddable

public class Price {
    private Double small;
    private Double medium;
    private Double large;
	public Double getSmall() {
		return small;
	}
	public void setSmall(Double small) {
		this.small = small;
	}
	public Double getMedium() {
		return medium;
	}
	public void setMedium(Double medium) {
		this.medium = medium;
	}
	public Double getLarge() {
		return large;
	}
	public void setLarge(Double large) {
		this.large = large;
	}
	public Price() {
		
		// TODO Auto-generated constructor stub
	}
    
    
    
}

