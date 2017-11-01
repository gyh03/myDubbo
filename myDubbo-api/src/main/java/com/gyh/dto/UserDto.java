package com.gyh.dto;

import java.io.Serializable;

public class UserDto implements Serializable{

	private String name;
	private int age;
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
	@Override
	public String toString() {
		return "UserDto [name=" + name + ", age=" + age + "]";
	}
	
	
}
