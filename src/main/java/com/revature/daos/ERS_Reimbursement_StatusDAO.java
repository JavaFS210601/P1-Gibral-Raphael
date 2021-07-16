package com.revature.daos;

import java.util.List;

import org.hibernate.Session;

import com.revature.models.ERS_Reimbursement_Status;
import com.revature.utils.HibernateUtil;

public class ERS_Reimbursement_StatusDAO implements ERS_Reimbursement_StatusDAOInterface{

	@Override
	public List<ERS_Reimbursement_Status> getAllStatus() {
		// TODO Auto-generated method stub
		Session ses = HibernateUtil.getSession();
		
		List<ERS_Reimbursement_Status> statusList = ses.createQuery("FROM ERS_Reimbursement_Status").list();
		
		HibernateUtil.closeSession();
		
		return statusList;
	}

	@Override
	public void insertStatus(ERS_Reimbursement_Status status) {
		// TODO Auto-generated method stub
		Session ses = HibernateUtil.getSession();
		
		ses.save(status);
		
		HibernateUtil.closeSession();
		
	}

	@Override
	public void updateStatus(ERS_Reimbursement_Status status) {
		// TODO Auto-generated method stub
		Session ses = HibernateUtil.getSession();
		
		ses.merge(status);
		
		
	}

	@Override
	public ERS_Reimbursement_Status selectStatusById(int id) {
		// TODO Auto-generated method stub
		Session ses = HibernateUtil.getSession();
		
		ERS_Reimbursement_Status status = ses.get(ERS_Reimbursement_Status.class, id);
		
		return status;
	}

}
