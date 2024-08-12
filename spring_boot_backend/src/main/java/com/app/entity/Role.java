package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity

public class Role {

//	@Column(unique = true, length = 30)
	@Id
	private String roleName;
	
	@Column(length = 255)
	private String roleDescription;

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public Role() {
		
		// TODO Auto-generated constructor stub
	}
	
	
}
