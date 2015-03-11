package com.tanixu.bean;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="user_info")
public class User
{
	private Integer userid;
	private String username;
	private String useracc;
	private String userpass;
	
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseracc() {
		return useracc;
	}
	public void setUseracc(String useracc) {
		this.useracc = useracc;
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	
}
