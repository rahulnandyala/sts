package com.creativecx.customer;

import org.springframework.data.annotation.Id;

public class Customer {
	@Id
	private String id;
	
	private String name;
	private int age;
	private boolean active;
	
	public Customer() {
		super();
	}
	
	public Customer(String id, String name, int age, boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.active = active;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
}
