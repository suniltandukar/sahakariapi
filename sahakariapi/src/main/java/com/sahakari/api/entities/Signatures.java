package com.sahakari.api.entities;

public class Signatures {
	
	private String signatureid;
	private String accountNumber;
	private byte[] image;

	public String getSignatureid() {
		return signatureid;
	}
	public void setSignatureid(String signatureid) {
		this.signatureid = signatureid;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}

}
