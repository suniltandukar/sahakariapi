package com.sahakari.api.entities;

import java.util.Arrays;

public class MemberDocument {
	
	private String id;
	private String[] document_type;
	private byte[] image;
	private String pid;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String[] getDocument_type() {
		return document_type;
	}
	public void setDocument_type(String[] document_type) {
		this.document_type = document_type;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	@Override
	public String toString() {
		return "MemberDocument [id=" + id + ", document_type=" + Arrays.toString(document_type) + ", image="
				+ Arrays.toString(image) + ", pid=" + pid + "]";
	}
	
}
