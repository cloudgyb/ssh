package com.gyb.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 测试Action
 * @author GengYB
 *
 */
public class TestAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	@Override
	public String execute() throws Exception {
		System.out.println("test action!");
		return super.execute();
	}
}
