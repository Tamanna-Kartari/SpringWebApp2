package org.nlt.model;

public class Persons {
	private int id;
	private String name;
	private int age;
	private long phone;
	private int status;
	private String gender;
	
	public Persons(int id, String name, int age, long phone, int status, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.status = status;
		this.gender = gender;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	
}
