package com.revature.daos;

import java.util.List;

import org.hibernate.Session;

import com.revature.models.ERS_Reimbursement_Type;
import com.revature.utils.HibernateUtil;

public class ERS_Reimbursement_TypeDAO implements ERS_Reimbursement_TypeDAOInterface{

	@Override
	public List<ERS_Reimbursement_Type> getAllTypes() {
		// TODO Auto-generated method stub
		Session ses = HibernateUtil.getSession();
		
		List<ERS_Reimbursement_Type> typeList = ses.createQuery("FROM ERS_Reimbursement_Type").list();
		
		HibernateUtil.closeSession();
		
		return typeList;
	}

	@Override
	public void insertType(ERS_Reimbursement_Type type) {
		// TODO Auto-generated method stub
		Session ses = HibernateUtil.getSession();
		
		ses.save(type);
		
		HibernateUtil.closeSession();
		
	}

	@Override
	public void updateType(ERS_Reimbursement_Type type) {
		// TODO Auto-generated method stub
		Session ses = HibernateUtil.getSession();
		
		ses.merge(type);
		
	}

	@Override
	public ERS_Reimbursement_Type selectTypeById(int id) {
		// TODO Auto-generated method stub
		Session ses = HibernateUtil.getSession();
		
		ERS_Reimbursement_Type type = ses.get(ERS_Reimbursement_Type.class, id);
		
		return type;
	}

}
