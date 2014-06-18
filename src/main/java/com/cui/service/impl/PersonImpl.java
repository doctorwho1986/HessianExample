package com.cui.service.impl;

import com.cui.domain.Car;
import com.cui.service.Person;

/**
 * project_name :hessianEx
 * @author kexiang.cui
 * create time :2014-6-18 下午3:59:12
 * 
 */
public class PersonImpl implements Person {

	public String hello() {
		return "hello,word";
	}

	public Car getCar() {
		Car car = new Car();
		car.setAge(11);
		car.setName("bao ma");
		return car;
	}

}
