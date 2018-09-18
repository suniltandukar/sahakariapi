package com.sahakari.api.entities;

public class IssueChequeTbl {
	private String id;
	private String accountNumber;
	private String chequeIssueId;
	private String issueDateen;
	private String issueDatenp;
	private String startChequeNumber;
	private String chequeCount;
	private String lastChequeNumber;
	private String inputter;
	private String authorizer;
	private String curDate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getChequeIssueId() {
		return chequeIssueId;
	}
	public void setChequeIssueId(String chequeIssueId) {
		this.chequeIssueId = chequeIssueId;
	}
	public String getIssueDateen() {
		return issueDateen;
	}
	public void setIssueDateen(String issueDateen) {
		this.issueDateen = issueDateen;
	}
	public String getIssueDatenp() {
		return issueDatenp;
	}
	public void setIssueDatenp(String issueDatenp) {
		this.issueDatenp = issueDatenp;
	}
	public String getStartChequeNumber() {
		return startChequeNumber;
	}
	public void setStartChequeNumber(String startChequeNumber) {
		this.startChequeNumber = startChequeNumber;
	}
	public String getChequeCount() {
		return chequeCount;
	}
	public void setChequeCount(String chequeCount) {
		this.chequeCount = chequeCount;
	}
	public String getLastChequeNumber() {
		return lastChequeNumber;
	}
	public void setLastChequeNumber(String lastChequeNumber) {
		this.lastChequeNumber = lastChequeNumber;
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
		return "IssueChequeTbl [id=" + id + ", accountNumber=" + accountNumber + ", chequeIssueId=" + chequeIssueId
				+ ", issueDateen=" + issueDateen + ", issueDatenp=" + issueDatenp + ", startChequeNumber="
				+ startChequeNumber + ", chequeCount=" + chequeCount + ", lastChequeNumber=" + lastChequeNumber
				+ ", inputter=" + inputter + ", authorizer=" + authorizer + ", curDate=" + curDate + "]";
	}
}
