package com.revature.daos;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.revature.models.ERS_Reimbursement;
import com.revature.models.ERS_User;
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
		
		HibernateUtil.closeSession();
	}

	@Override
	public ERS_Reimbursement selectReimbursementById(int id) {
		// TODO Auto-generated method stub
		Session ses = HibernateUtil.getSession();
		
		ERS_Reimbursement reimb = ses.get(ERS_Reimbursement.class, id);
		
		return reimb;
	}

	@Override
	public List<ERS_Reimbursement> getPendingReimbursements() {
		// TODO Auto-generated method stub
		Session ses = HibernateUtil.getSession();
		
		List<ERS_Reimbursement> reimbList = ses.createQuery("FROM ERS_Reimbursement").list();
		List<ERS_Reimbursement> pendList =  new ArrayList<>();
		
		for(ERS_Reimbursement pend: reimbList) {
			if(pend.getStatus().getStatus().equals("Pending")) {
				pendList.add(pend);
			}
		}
		
		HibernateUtil.closeSession();
		
		return pendList;
	}

	@Override
	public List<ERS_Reimbursement> getAllReimbursementsbyEmp(String username) {
		// TODO Auto-generated method stub
		Session ses = HibernateUtil.getSession();
		
		List<ERS_Reimbursement> reimbList = ses.createQuery("FROM ERS_Reimbursement").list();
		List<ERS_Reimbursement> empList =  new ArrayList<>();
		
		for(ERS_Reimbursement pend: reimbList) {
			System.out.println(pend.getAuthor().getUsername().equals(username));
				if(pend.getAuthor().getUsername().equals(username)) {
					empList.add(pend);
				}
		}
		
		HibernateUtil.closeSession();
		
		return empList;
	}

}
