package com.revature.daos;

import java.util.List;

import org.hibernate.Session;

import com.revature.models.ERS_Reimbursement;
import com.revature.utils.HibernateUtil;

public class ERS_ReimbursementDAO implements ERS_ReimbursementDAOInterface {

	@Override
	public List<ERS_Reimbursement> getAllReimbursements() {
		// TODO Auto-generated method stub
		Session ses = HibernateUtil.getSession();
		
		List<ERS_Reimbursement> reimbList = ses.createQuery("FROM ERS_Reimbursement").list();
		
		HibernateUtil.closeSession();
		
		return reimbList;
	}

	@Override
	public void insertReimbursement(ERS_Reimbursement reimb) {
		// TODO Auto-generated method stub
		Session ses = HibernateUtil.getSession();
		
		ses.save(reimb);
		
		HibernateUtil.closeSession();
		
	}

	@Override
	public void updateReimbursement(ERS_Reimbursement reimb) {
		// TODO Auto-generated method stub
		Session ses = HibernateUtil.getSession();
		
		ses.merge(reimb);
	}

	@Override
	public ERS_Reimbursement selectReimbursementById(int id) {
		// TODO Auto-generated method stub
		Session ses = HibernateUtil.getSession();
		
		ERS_Reimbursement reimb = ses.get(ERS_Reimbursement.class, id);
		
		return reimb;
	}

}
