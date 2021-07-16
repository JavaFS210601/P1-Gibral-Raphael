package com.revature.service;

import java.util.List;

import com.revature.daos.ERS_UserDAO;
import com.revature.daos.ERS_UserDAOInterface;
import com.revature.models.ERS_User;


public class UserService {
	
	private ERS_UserDAOInterface uDAO = new ERS_UserDAO();
	
	public List<ERS_User> getAllUsers(){
		return uDAO.getAllUsers();
	}
	
	public ERS_User selectUserByUsername(String username) {
		return uDAO.selectUserByUsername(username);
	}

}
