package com.revature.service;

import java.util.List;

import com.revature.daos.ERS_ReimbursementDAO;
import com.revature.daos.ERS_ReimbursementDAOInterface;
import com.revature.models.ERS_Reimbursement;
import com.revature.models.ERS_Reimbursement_Status;


public class ReimbursementService {
	
	private ERS_ReimbursementDAOInterface rDAO = new ERS_ReimbursementDAO();
	
	public List<ERS_Reimbursement> getAllReimbursements(){
		return rDAO.getAllReimbursements();
	}

	public void insertReimbursements(ERS_Reimbursement eReimb) {
		// TODO Auto-generated method stub
		rDAO.insertReimbursement(eReimb);
		
	}

	public void updateReimbursements(ERS_Reimbursement eReimb) {
		// TODO Auto-generated method stub
		rDAO.updateReimbursement(eReimb);
		
	}

	public ERS_Reimbursement selectReimbursementById(int id) {
		// TODO Auto-generated method stub
		return rDAO.selectReimbursementById(id);
	}

	public List<ERS_Reimbursement> getPendingReimbursements() {
		// TODO Auto-generated method stub
		return rDAO.getPendingReimbursements();
	}

	public List<ERS_Reimbursement> getAllReimbursementsbyEmp(String username) {
		// TODO Auto-generated method stub
		return rDAO.getAllReimbursementsbyEmp(username);
	}



}
