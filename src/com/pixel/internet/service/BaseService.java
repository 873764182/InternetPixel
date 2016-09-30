package com.pixel.internet.service;

/**
 * Service基础
 * 
 * @author Administrator
 *
 */
public class BaseService {

	private String testProperty;

	public String getTestProperty() {
		return testProperty;
	}

	public void setTestProperty(String testProperty) {
		this.testProperty = testProperty;
	}

	public void testMethod(String value) {
		System.out.println("属性 -> " + getTestProperty() + " 入参 -> " + value);
	}
}
