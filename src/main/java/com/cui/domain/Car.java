package com.cui.domain;

import java.io.Serializable;

/**
 * project_name :hessianEx
 * @author kexiang.cui
 * create time :2014-6-18 下午3:57:49
 * 
 */
public class Car implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 118716158158884259L;
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
}
