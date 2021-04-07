package com.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "count")
public class history {
	private String nameString;
	private String url;
	
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "history [nameString=" + nameString + ", url=" + url + "]";
	}
	public history(String nameString, String url) {
		super();
		this.nameString = nameString;
		this.url = url;
	}
	
	
	


}
