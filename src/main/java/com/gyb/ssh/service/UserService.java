package com.gyb.ssh.service;

import java.util.List;

import com.gyb.ssh.entity.User;

public interface UserService {
	List<User> getAll();
	User getUser(int id);
}
