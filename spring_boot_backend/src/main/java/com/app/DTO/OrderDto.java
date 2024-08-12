package com.app.DTO;



import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.app.entity.OrderStatus;




public class OrderDto {
	
//	@NotNull
//	private String date;
	
	@NotBlank
	private String userName;
	
	@Min(0)
	private Long addressId;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public OrderDto() {
		
		// TODO Auto-generated constructor stub
	}
	
//	@NotBlank
//	private List<Long> cartId;
	
//	@NotBlank
//	private OrderStatus orderStatus;
	
	
	
}
