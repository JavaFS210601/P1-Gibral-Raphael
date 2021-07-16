package com.revature.daos;

import java.util.List;

import com.revature.models.ERS_Reimbursement;



public interface ERS_ReimbursementDAOInterface {
	
	public List<ERS_Reimbursement> getAllReimbursements();
	
	public void insertReimbursement(ERS_Reimbursement reimb);
	
	public void updateReimbursement(ERS_Reimbursement reimb);
	
	public ERS_Reimbursement selectReimbursementById(int id);

}
