package com.revature.service;

import com.revature.models.ERS_User;

public class LoginService {
	
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		UserService uService = new UserService();
		ERS_User user = uService.selectUserByUsername(username);
		
		if(password.equals(user.getPassword())){
			return true;
		}
		
		return false;
	}

}
