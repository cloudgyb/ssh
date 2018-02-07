package com.gyb.ssh.dao;

import java.util.List;

import com.gyb.ssh.entity.User;

public interface UserDao {
	List<User> listAllUser();
	User getUser(int id);
}
