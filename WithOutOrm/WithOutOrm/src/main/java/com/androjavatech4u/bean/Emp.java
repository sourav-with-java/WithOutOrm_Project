package com.androjavatech4u.bean;

public class Emp {
	
	private int id;
	public Emp() {
		super();
		
	}
	private String name,cmp;
	public Emp(int id, String name, String cmp) {
		super();
		this.id = id;
		this.name = name;
		this.cmp = cmp;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCmp() {
		return cmp;
	}
	public void setCmp(String cmp) {
		this.cmp = cmp;
	}
	

}
