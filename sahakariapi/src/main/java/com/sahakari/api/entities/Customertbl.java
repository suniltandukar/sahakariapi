package com.sahakari.api.entities;

public class Customertbl {
	private String accountName;
	private String name;
	private String curdate;
	
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	public String getCurdate() {
		return curdate;
	}
	public void setCurdate(String curdate) {
		this.curdate = curdate;
	}
	@Override
	public String toString() {
		return "Customertbl [accountName=" + accountName + ", name=" + name + ", curdate=" + curdate + "]";
	}
	
}
