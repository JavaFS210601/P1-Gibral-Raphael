package com.revature.daos;

import java.util.List;

import com.revature.models.ERS_Reimbursement_Status;



public interface ERS_Reimbursement_StatusDAOInterface {

	public List<ERS_Reimbursement_Status> getAllStatus();
	
	public void insertStatus(ERS_Reimbursement_Status status);
	
	public void updateStatus(ERS_Reimbursement_Status status);
	
	public ERS_Reimbursement_Status selectStatusById(int id);
}
