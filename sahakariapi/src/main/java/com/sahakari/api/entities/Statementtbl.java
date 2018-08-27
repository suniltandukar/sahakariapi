package com.sahakari.api.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class Statementtbl {
	private String Id;
	private String refNo;
	private String valueDate;
	private String bookingDate;
	private String AccountNumber;
	private String cusId;
	private String categoryid;
	private String debitamount;
	private String creditamount;
	private String balanceamount;
	private String narrative;
	private String chequename;
	private String paymentto;
	private String cheqNumber;
	private String branchId;
	private String inputter;
	private String authorizer;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getRefNo() {
		return refNo;
	}
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	public String getValueDate() {
		return valueDate;
	}
	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}
	public String getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}
	public String getCusId() {
		return cusId;
	}
	public void setCusId(String cusId) {
		this.cusId = cusId;
	}
	public String getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(String categoryid) {
		this.categoryid = categoryid;
	}
	public String getDebitamount() {
		return debitamount;
	}
	public void setDebitamount(String debitamount) {
		this.debitamount = debitamount;
	}
	public String getCreditamount() {
		return creditamount;
	}
	public void setCreditamount(String creditamount) {
		this.creditamount = creditamount;
	}
	public String getNarrative() {
		return narrative;
	}
	public void setNarrative(String narrative) {
		this.narrative = narrative;
	}
	public String getChequename() {
		return chequename;
	}
	public void setChequename(String chequename) {
		this.chequename = chequename;
	}
	public String getPaymentto() {
		return paymentto;
	}
	public void setPaymentto(String paymentto) {
		this.paymentto = paymentto;
	}
	public String getCheqNumber() {
		return cheqNumber;
	}
	public void setCheqNumber(String cheqNumber) {
		this.cheqNumber = cheqNumber;
	}
	public String getBranchId() {
		return branchId;
	}
	public void setBranchId(String branchId) {
		this.branchId = branchId;
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
	
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	
	public String getBalanceamount() {
		return balanceamount;
	}
	public void setBalanceamount(String balanceamount) {
		this.balanceamount = balanceamount;
	}
	@Override
	public String toString() {
		return "Statementtbl [Id=" + Id + ", refNo=" + refNo + ", valueDate=" + valueDate + ", bookingDate="
				+ bookingDate + ", AccountNumber=" + AccountNumber + ", cusId=" + cusId + ", categoryid=" + categoryid
				+ ", debitamount=" + debitamount + ", creditamount=" + creditamount + ", balanceamount=" + balanceamount
				+ ", narrative=" + narrative + ", chequename=" + chequename + ", paymentto=" + paymentto
				+ ", cheqNumber=" + cheqNumber + ", branchId=" + branchId + ", inputter=" + inputter + ", authorizer="
				+ authorizer + "]";
	}
	
}
