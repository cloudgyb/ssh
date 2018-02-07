package com.gyb.ssh.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.json.annotations.JSON;
import org.springframework.beans.factory.annotation.Autowired;

import com.gyb.ssh.entity.User;
import com.gyb.ssh.service.UserService;

public class ListUserAction extends JsonAction {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private UserService userService;
	
	@Override
	@Action(value="listuser")
	public String execute() throws Exception {
		List<User> all = userService.getAll();
		System.out.println("+++++++++++");
		for (User user : all) {
			System.out.println(user);
		}
		resultMap.put("users1", all);
		User user = userService.getUser(1);
		resultMap.put("users", user);
		return super.execute();
	}
	
	@JSON
	public Map<Object, Object> getResultMap() {
		return resultMap;
	}
}
