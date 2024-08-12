package com.app.DTO;

import javax.validation.constraints.NotBlank;





public class RoleDTO {
	
	@NotBlank
    private String roleName;
	
	@NotBlank
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

	public RoleDTO() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
