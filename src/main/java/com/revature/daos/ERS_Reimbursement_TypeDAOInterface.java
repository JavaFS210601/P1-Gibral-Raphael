package com.revature.daos;

import java.util.List;

import com.revature.models.ERS_Reimbursement_Type;


public interface ERS_Reimbursement_TypeDAOInterface {

	public List<ERS_Reimbursement_Type> getAllTypes();
	
	public void insertType(ERS_Reimbursement_Type type);
	
	public void updateType(ERS_Reimbursement_Type type);
	
	public ERS_Reimbursement_Type selectTypeById(int id);
}
