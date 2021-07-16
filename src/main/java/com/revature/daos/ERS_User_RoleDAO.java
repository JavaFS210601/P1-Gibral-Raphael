package com.revature.daos;

import java.util.List;

import org.hibernate.Session;

import com.revature.models.ERS_User;
import com.revature.models.ERS_User_Role;
import com.revature.utils.HibernateUtil;

public class ERS_User_RoleDAO implements ERS_User_RoleDAOInterface{

	@Override
	public List<ERS_User_Role> getAllUsers() {
		// TODO Auto-generated method stub
		Session ses = HibernateUtil.getSession();
		
		List<ERS_User_Role> userRoleList = ses.createQuery("FROM ERS_User_Role").list();
		
		HibernateUtil.closeSession();
		
		return userRoleList;
	}

	@Override
	public void insertUserRole(ERS_User_Role user_role) {
		// TODO Auto-generated method stub
		Session ses = HibernateUtil.getSession();
		
		ses.save(user_role);
		
		HibernateUtil.closeSession();
		
	}

	@Override
	public void updateUserRole(ERS_User_Role user_role) {
		// TODO Auto-generated method stub
		Session ses = HibernateUtil.getSession();
		ses.merge(user_role);
		
	}

	@Override
	public ERS_User_Role selectUserRoleById(int id) {
		// TODO Auto-generated method stub
		Session ses = HibernateUtil.getSession();
		
		ERS_User_Role user_role = ses.get(ERS_User_Role.class, id);
		
		return user_role;
		
	}

}
