package com.revature.daos;

import java.util.List;

import org.hibernate.Session;
import com.revature.models.ERS_User;
import com.revature.utils.HibernateUtil;

public class ERS_UserDAO implements ERS_UserDAOInterface {

	@Override
	public List<ERS_User> getAllUsers() {
		// TODO Auto-generated method stub
		Session ses = HibernateUtil.getSession();
		
		List<ERS_User> userList = ses.createQuery("FROM ERS_User").list();
		
		HibernateUtil.closeSession();
		
		return userList;
	}

	@Override
	public void insertUser(ERS_User user) {
		// TODO Auto-generated method stub
		Session ses = HibernateUtil.getSession();
		
		ses.save(user);
		
		HibernateUtil.closeSession();
		
	}

	@Override
	public void updateUser(ERS_User user) {
		// TODO Auto-generated method stub
		Session ses = HibernateUtil.getSession();
		
		ses.merge(user);
		
		
		
	}

	@Override
	public ERS_User selectUserById(int id) {
		// TODO Auto-generated method stub
		Session ses = HibernateUtil.getSession();
		
		ERS_User user = ses.get(ERS_User.class, id);
		
		
		return user;
	}

	@Override
	public ERS_User selectUserByUsername(String username) {
		// TODO Auto-generated method stub
		Session ses = HibernateUtil.getSession();
		
		//List<ERS_User> userList  = ses.createQuery("FROM ERS_User WHERE ers_username = " + username).list();
		
		List<ERS_User> userList = ses.createQuery("FROM ERS_User").list();
		
		ERS_User findUser = new ERS_User();
		
		for(ERS_User user: userList) {
			if(user.getUsername().equals(username)) {
				findUser = user;
			}
		}
		
		
		return findUser;
	}

}
