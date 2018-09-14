package com.sahakari.api.entities;

public class Intrate {
	private String id;
	private String intratestartdate;
	private String categoryid;
	private String intrate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIntratestartdate() {
		return intratestartdate;
	}
	public void setIntratestartdate(String intratestartdate) {
		this.intratestartdate = intratestartdate;
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
		return "Intrate [id=" + id + ", intratestartdate=" + intratestartdate + ", categoryid=" + categoryid
				+ ", intrate=" + intrate + "]";
	}
}
