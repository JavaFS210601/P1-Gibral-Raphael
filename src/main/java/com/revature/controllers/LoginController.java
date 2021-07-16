package com.revature.controllers;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.LoginDTO;
import com.revature.service.LoginService;

public class LoginController {
	
	ObjectMapper om = new ObjectMapper();
	private LoginService ls = new LoginService();
	
	public void login(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		if(req.getMethod().equals("POST")) {
			BufferedReader reader = req.getReader();
			
			StringBuilder sb = new StringBuilder();
			
			String line = reader.readLine();
			
			while(line != null) {
				sb.append(line);
				line = reader.readLine();
			}
			String body = new String(sb);
			
			LoginDTO lDTO = om.readValue(body, LoginDTO.class);
			
			if(ls.login(lDTO.username, lDTO.password)) {
				HttpSession ses = req.getSession();
				
				ses.setAttribute("user", lDTO);
				ses.setAttribute("loggedin", true);
				
				res.setStatus(200);
				res.getWriter().print("Hi login was successfully");		
			}else {
				HttpSession ses = req.getSession(false);
				
				if(ses != null) {
					ses.invalidate();
				}
				
				res.setStatus(401);
				res.getWriter().print("login failed");
			}
		}
	}

}
