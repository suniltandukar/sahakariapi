package com.sahakari.api.entities;

public class ChequeIssued {
	private String id;
	private String chequeIssueId;
	private String usedyn;
	private String stopyn;
	private String stopReason;
	private String revokeyn;
	private String inputter;
	private String authorizer;
	private String curDate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getChequeIssueId() {
		return chequeIssueId;
	}
	public void setChequeIssueId(String chequeIssueId) {
		this.chequeIssueId = chequeIssueId;
	}
	public String getUsedyn() {
		return usedyn;
	}
	public void setUsedyn(String usedyn) {
		this.usedyn = usedyn;
	}
	public String getStopyn() {
		return stopyn;
	}
	public void setStopyn(String stopyn) {
		this.stopyn = stopyn;
	}
	public String getStopReason() {
		return stopReason;
	}
	public void setStopReason(String stopReason) {
		this.stopReason = stopReason;
	}
	public String getRevokeyn() {
		return revokeyn;
	}
	public void setRevokeyn(String revokeyn) {
		this.revokeyn = revokeyn;
	}
	public String getInputter() {
		return inputter;
	}
	public void setInputter(String inputter) {
		this.inputter = inputter;
	}
	public String getAuthorizer() {
		return authorizer;
	}
	public void setAuthorizer(String authorizer) {
		this.authorizer = authorizer;
	}
	public String getCurDate() {
		return curDate;
	}
	public void setCurDate(String curDate) {
		this.curDate = curDate;
	}
	@Override
	public String toString() {
		return "ChequeIssued [id=" + id + ", chequeIssueId=" + chequeIssueId + ", usedyn=" + usedyn + ", stopyn="
				+ stopyn + ", stopReason=" + stopReason + ", revokeyn=" + revokeyn + ", inputter=" + inputter
				+ ", authorizer=" + authorizer + ", curDate=" + curDate + "]";
	}

}
