package com.revature.service;

import com.revature.daos.ERS_Reimbursement_StatusDAO;
import com.revature.daos.ERS_Reimbursement_StatusDAOInterface;
import com.revature.models.ERS_Reimbursement;
import com.revature.models.ERS_Reimbursement_Status;

public class ReimbursementStatusService {
	private ERS_Reimbursement_StatusDAOInterface stDAO = new ERS_Reimbursement_StatusDAO();
	
	public ERS_Reimbursement_Status selectStatusById(int id) {
		// TODO Auto-generated method stub
		return stDAO.selectStatusById(id);
	}

}
