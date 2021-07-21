package com.revature.web;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.revature.controllers.LoginController;
import com.revature.controllers.ReimbursementController;
import com.revature.controllers.UserController;
import com.revature.daos.ERS_ReimbursementDAO;
import com.revature.daos.ERS_Reimbursement_StatusDAO;
import com.revature.daos.ERS_Reimbursement_TypeDAO;
import com.revature.daos.ERS_UserDAO;
import com.revature.daos.ERS_User_RoleDAO;
import com.revature.models.ERS_Reimbursement;
import com.revature.models.ERS_Reimbursement_Status;
import com.revature.models.ERS_Reimbursement_Type;
import com.revature.models.ERS_User;
import com.revature.models.ERS_User_Role;

public class MasterServlet extends HttpServlet{
	
	private UserController uc = new UserController();
	private LoginController lc = new LoginController();
	private ReimbursementController rc = new ReimbursementController();
	
	private static ERS_UserDAO uDAO = new ERS_UserDAO();
	private static ERS_User_RoleDAO rDAO = new ERS_User_RoleDAO();
	private static ERS_ReimbursementDAO reDAO = new ERS_ReimbursementDAO();
	private static ERS_Reimbursement_TypeDAO tDAO = new ERS_Reimbursement_TypeDAO();
	private static ERS_Reimbursement_StatusDAO sDAO = new ERS_Reimbursement_StatusDAO();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//		ERS_User_Role b1 = new ERS_User_Role("Employee");
//		ERS_User_Role b2 = new ERS_User_Role("Manager");
//		ERS_Reimbursement_Status c1 = new ERS_Reimbursement_Status("Pending");
//		ERS_Reimbursement_Status c2 = new ERS_Reimbursement_Status("Approved");
//		ERS_Reimbursement_Status c3 = new ERS_Reimbursement_Status("Denied");
//		ERS_Reimbursement_Type d1 = new ERS_Reimbursement_Type("Lodging");
//		ERS_Reimbursement_Type d2 = new ERS_Reimbursement_Type("Travel");
//		ERS_Reimbursement_Type d3 = new ERS_Reimbursement_Type("Food");
//		ERS_Reimbursement_Type d4 = new ERS_Reimbursement_Type("Other");
//		ERS_User a1 = new ERS_User("demoman","password","Johnathan", "Stroud","g@gmail",b1);
//		ERS_User a2 = new ERS_User("adminman","password","Bob", "Base","b@gmail",b2);
//		ERS_Reimbursement f1 = new ERS_Reimbursement(500, "07-20-21", null,"jetskis", null,a1,a2,c1,d4);
//
//		
//		rDAO.insertUserRole(b1);
//		rDAO.insertUserRole(b2);
//		uDAO.insertUser(a1);
//		uDAO.insertUser(a2);
//
//		
//		sDAO.insertStatus(c1);
//		sDAO.insertStatus(c2);
//		sDAO.insertStatus(c3);
//		
//		tDAO.insertType(d1);
//		tDAO.insertType(d2);
//		tDAO.insertType(d3);
//		tDAO.insertType(d4);
//		
//		reDAO.insertReimbursement(f1);
//		
//		System.out.println("Done!");
		
		res.setContentType("application/json");
		
		res.setStatus(404);
		
		String URI = req.getRequestURI().replace("/P1-Gibral-Raphael/", "");
		System.out.println("===================================");
		
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
		
		case "employee":
			if (req.getSession(false) != null) {
				rc.getAllReimbursements(res);
			}else {
				res.setStatus(403);
			}
			
			break;
			
		case "manager":
			if (req.getSession(false) != null) {
				rc.getAllReimbursements(res);
			}else {
				res.setStatus(403);
			}
			
			break;
			
		case "addreimb":
			
			rc.insertReimbursements(req,res);
		
			break;
		case "updatereimb":
			
			rc.updateReimbursements(req,res);
		
			break;
		case "pendingreimb":
			
			rc.getPendingReimbursements(res);
			break;
		
		}
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
		
		
	}
	
	
	
}