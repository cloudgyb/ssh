package com.gyb.ssh.action;

import org.springframework.context.annotation.Scope;

import com.opensymphony.xwork2.ActionSupport;
/**
 * index page Action
 * @author GengYB
 *
 */
@Scope("prototype")
public class IndexAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String hello = "geng";
	@Override
	public String execute() throws Exception {
		System.out.println("index action");
		return super.execute();
	}
	public String getHello() {
		return hello;
	}

	
}
