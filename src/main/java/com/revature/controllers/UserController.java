package com.revature.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.ERS_User;
import com.revature.service.UserService;


public class UserController {
	
	private UserService us = new UserService();
	private ObjectMapper om = new ObjectMapper();
	
	public void getAllUsers(HttpServletResponse res) throws IOException{
		// TODO Auto-generated method stub
		
		List<ERS_User> userList = us.getAllUsers();
		
		
		String json = om.writeValueAsString(userList);
		
		res.getWriter().print(json);
		
		
		res.setStatus(200);
	}

}
