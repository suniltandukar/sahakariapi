package com.sahakari.api.entities;

import java.util.Arrays;

public class MultipleTransactiontbl {
	
	private String id;
	private String transactionId;
	private int transactionNo;
	private String bookingDate;
	private String[] valueDate;
	private String processingDate;
	private String[] accountNumber;
	private String[] drcr;
	private String[] amount;
	private String[] narrative;
	private String[] cheqNumber;
	private String[] transactionCode;
	private String branchId;
	private String inputter;
	private String authorizer;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	
	public int getTransactionNo() {
		return transactionNo;
	}
	public void setTransactionNo(int transactionNo) {
		this.transactionNo = transactionNo;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String[] getValueDate() {
		return valueDate;
	}
	public void setValueDate(String[] valueDate) {
		this.valueDate = valueDate;
	}
	public String getProcessingDate() {
		return processingDate;
	}
	public void setProcessingDate(String processingDate) {
		this.processingDate = processingDate;
	}
	public String[] getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String[] accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String[] getDrcr() {
		return drcr;
	}
	public void setDrcr(String[] drcr) {
		this.drcr = drcr;
	}
	public String[] getAmount() {
		return amount;
	}
	public void setAmount(String[] amount) {
		this.amount = amount;
	}
	public String[] getNarrative() {
		return narrative;
	}
	public void setNarrative(String[] narrative) {
		this.narrative = narrative;
	}
	public String[] getCheqNumber() {
		return cheqNumber;
	}
	public void setCheqNumber(String[] cheqNumber) {
		this.cheqNumber = cheqNumber;
	}
	public String[] getTransactionCode() {
		return transactionCode;
	}
	public void setTransactionCode(String[] transactionCode) {
		this.transactionCode = transactionCode;
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
	@Override
	public String toString() {
		return "MultipleTransactiontbl [id=" + id + ", transactionId=" + transactionId + ", transactionNo="
				+ transactionNo + ", bookingDate=" + bookingDate + ", valueDate=" + Arrays.toString(valueDate)
				+ ", processingDate=" + processingDate + ", accountNumber=" + Arrays.toString(accountNumber) + ", drcr="
				+ Arrays.toString(drcr) + ", amount=" + Arrays.toString(amount) + ", narrative="
				+ Arrays.toString(narrative) + ", cheqNumber=" + Arrays.toString(cheqNumber) + ", transactionCode="
				+ Arrays.toString(transactionCode) + ", branchId=" + branchId + ", inputter=" + inputter
				+ ", authorizer=" + authorizer + "]";
	}

}
