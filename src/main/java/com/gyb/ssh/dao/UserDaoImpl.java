package com.gyb.ssh.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.gyb.ssh.entity.User;

@Repository
public class UserDaoImpl  implements UserDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public List<User> listAllUser() {
		List<User> loadAll = hibernateTemplate.loadAll(User.class);
		return loadAll;
	}

	@Override
	public User getUser(int id) {
		User user = hibernateTemplate.get(User.class, 1);
		return user;
	}

}
