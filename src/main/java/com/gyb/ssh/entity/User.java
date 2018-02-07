package com.gyb.ssh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_user")
public class User {
	@Id
	@Column(name="uid")
	private int uid;
	@Column(name="uname")
	private String uname;
	@Column(name="upasswd")
	private String upassword;
	
	public User() {
	}
	public User(int uid, String uname, String upassword) {
		this.uid = uid;
		this.uname = uname;
		this.upassword = upassword;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", upassword=" + upassword + "]";
	}
	
	
	
}
