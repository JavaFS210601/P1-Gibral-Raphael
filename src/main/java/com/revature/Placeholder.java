package com.revature;

import java.util.List;

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
import java.time.LocalDateTime;

public class Placeholder {
	//this is a placeholder so that this project pushes correctly
	
	//Remember your project won't have a launcher!! 
	//it'll have a master servlet though 
	private static ERS_UserDAO uDAO = new ERS_UserDAO();
	private static ERS_User_RoleDAO rDAO = new ERS_User_RoleDAO();
	private static ERS_ReimbursementDAO reDAO = new ERS_ReimbursementDAO();
	private static ERS_Reimbursement_TypeDAO tDAO = new ERS_Reimbursement_TypeDAO();
	private static ERS_Reimbursement_StatusDAO sDAO = new ERS_Reimbursement_StatusDAO();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		ERS_User_Role b1 = new ERS_User_Role("Employee");
//		ERS_User_Role b2 = new ERS_User_Role("Manager");
//		ERS_Reimbursement_Status c1 = new ERS_Reimbursement_Status("Pending", null);
//		ERS_Reimbursement_Status c2 = new ERS_Reimbursement_Status("Approved", null);
//		ERS_Reimbursement_Status c3 = new ERS_Reimbursement_Status("Denied", null);
//		ERS_Reimbursement_Type d1 = new ERS_Reimbursement_Type("Lodging", null);
//		ERS_Reimbursement_Type d2 = new ERS_Reimbursement_Type("Travel", null);
//		ERS_Reimbursement_Type d3 = new ERS_Reimbursement_Type("Food", null);
//		ERS_Reimbursement_Type d4 = new ERS_Reimbursement_Type("Other", null);
//		ERS_User a1 = new ERS_User("demoman","password","Johnathan", "Stroud","g@gmail",null);
//		ERS_User a2 = new ERS_User("adminman","password","Bob", "Base","b@gmail",null);
//		ERS_Reimbursement f1 = new ERS_Reimbursement(500, LocalDateTime.now(), null,"jetskis", null,a1,a2,c1,d4);
//
//		
//		rDAO.insertUserRole(b1);
//		rDAO.insertUserRole(b2);
//		uDAO.insertUser(a1);
//		a1.setRole(b1);
//		uDAO.updateUser(a1);
//		
//		System.out.println(a1.getRole().getId());
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

		
//		List<Book> books = bDAO.findAllBooks();
//		
//		for(Book b : books) {
//			System.out.println(b);
//			System.out.println();
//		}
//		
	
		
		
	}
}
