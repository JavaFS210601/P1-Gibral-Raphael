package com.revature.controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.*;
import com.revature.models.ERS_Reimbursement;
import com.revature.models.ERS_Reimbursement_Status;
import com.revature.service.ReimbursementService;
import com.revature.service.ReimbursementStatusService;


public class ReimbursementController {
	
	private ReimbursementService rs = new ReimbursementService();
	private ReimbursementStatusService sts = new ReimbursementStatusService();
	private ObjectMapper om = new ObjectMapper();
	
	public void getAllReimbursements(HttpServletResponse res) throws IOException{
		// TODO Auto-generated method stub
		
		List<ERS_Reimbursement> reList = rs.getAllReimbursements();
		
		
		String json = om.writeValueAsString(reList);
		
		res.getWriter().print(json);
		
		
		res.setStatus(200);
	}

	public void insertReimbursements(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		if(req.getMethod().equals("POST")) {
			BufferedReader reader = req.getReader();
			
			StringBuilder sb = new StringBuilder();
			
			String line = reader.readLine();
			
			while(line != null) {
				sb.append(line);
				line = reader.readLine();
			}
			String body = new String(sb);
			ERS_Reimbursement eReimb = om.readValue(body, ERS_Reimbursement.class);
			
			rs.insertReimbursements(eReimb);
			
			res.setStatus(200);
			res.getWriter().print("Hi Add was successfully");	
					
		}
	}

	public void updateReimbursements(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
		// TODO Auto-generated method stub
		if(req.getMethod().equals("POST")) {
			BufferedReader reader = req.getReader();
			
			StringBuilder sb = new StringBuilder();
			
			String line = reader.readLine();
			
			while(line != null) {
				sb.append(line);
				line = reader.readLine();
			}
			String body = new String(sb);
			
			System.out.println(body.charAt(32));
			ERS_Reimbursement eReimb2 = rs.selectReimbursementById(Character.getNumericValue(body.charAt(7)));
			ERS_Reimbursement_Status eStatus2 = sts.selectStatusById(Character.getNumericValue(body.charAt(32)));
			eReimb2.setStatus(eStatus2);
//			ERS_Reimbursement eReimb = om.readValue(body, ERS_Reimbursement.class);
//			System.out.println(eReimb2);
			
			rs.updateReimbursements(eReimb2);
			
			res.setStatus(200);
			res.getWriter().print("Hi Update was successfully");	
					
		}
		
	}

	public void getPendingReimbursements(HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<ERS_Reimbursement> reList = rs.getPendingReimbursements();
		
		
		String json = om.writeValueAsString(reList);
		
		res.getWriter().print(json);
		
		
		res.setStatus(200);
		
	}

	public void getAllReimbursementsbyEmp(HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<ERS_Reimbursement> reList = rs.getAllReimbursementsbyEmp("demoman");
		
		
		String json = om.writeValueAsString(reList);
		
		res.getWriter().print(json);
		
		
		res.setStatus(200);
		
	}

}
