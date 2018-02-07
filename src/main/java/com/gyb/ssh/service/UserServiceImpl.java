package com.gyb.ssh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gyb.ssh.dao.UserDao;
import com.gyb.ssh.entity.User;
@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> getAll() {
		return userDao.listAllUser();
	}

	@Override
	public User getUser(int id) {
		return userDao.getUser(id);
	}

}
