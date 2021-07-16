package com.revature.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.revature.controllers.LoginController;
import com.revature.controllers.UserController;



public class MasterServlet extends HttpServlet{
	
	private UserController uc = new UserController();
	private LoginController lc = new LoginController();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("application/json");
		
		res.setStatus(404);
		
		String URI = req.getRequestURI().replace("/P1-Gibral-Raphael/", "");
		
		
		switch(URI) {
		case "users":
			
			if (req.getSession(false) != null) {
				uc.getAllUsers(res);
			}else {
				res.setStatus(403);
			}
			
			
			break;
		
		case "login":
			
			lc.login(req, res);
			break;
		}
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
		
		
	}
	
	
	
}