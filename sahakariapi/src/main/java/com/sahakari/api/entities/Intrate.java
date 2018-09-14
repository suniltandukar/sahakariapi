package com.sahakari.api.entities;

public class Intrate {
	private String id;
	private String intereststartdate;
	private String categoryid;
	private String intrate;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIntereststartdate() {
		return intereststartdate;
	}
	public void setIntereststartdate(String intereststartdate) {
		this.intereststartdate = intereststartdate;
	}
	
	public String getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(String categoryid) {
		this.categoryid = categoryid;
	}
	public String getIntrate() {
		return intrate;
	}
	public void setIntrate(String intrate) {
		this.intrate = intrate;
	}
	@Override
	public String toString() {
		return "Intrate [id=" + id + ", intereststartdate=" + intereststartdate + ", categoryid=" + categoryid
				+ ", intrate=" + intrate + "]";
	}
	
}
