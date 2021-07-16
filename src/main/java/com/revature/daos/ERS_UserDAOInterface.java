package com.revature.daos;

import java.util.List;

import com.revature.models.ERS_User;

public interface ERS_UserDAOInterface {

	public List<ERS_User> getAllUsers();
	
	public void insertUser(ERS_User user);
	
	public void updateUser(ERS_User user);
	
	public ERS_User selectUserById(int id);
	
	public ERS_User selectUserByUsername(String username);

}
