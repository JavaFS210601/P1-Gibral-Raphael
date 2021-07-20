package com.revature.daos;

import java.util.List;

import com.revature.models.ERS_User_Role;

public interface ERS_User_RoleDAOInterface {
	
	public List<ERS_User_Role> getAllUserRoles();
	
	public void insertUserRole(ERS_User_Role user_role);
	
	public void updateUserRole(ERS_User_Role user_role);
	
	public ERS_User_Role selectUserRoleById(int id);

}
