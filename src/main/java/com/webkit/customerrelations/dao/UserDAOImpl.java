package com.webkit.customerrelations.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.webkit.customerrelations.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<User> getUsers() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<User> query = currentSession.createQuery("from User", User.class);
		List<User> user = query.getResultList();
		return user;
	}

	@Override
	public void saveUser(User user) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(user);
	}

}
