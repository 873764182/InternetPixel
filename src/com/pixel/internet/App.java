package com.pixel.internet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pixel.internet.service.BaseService;

/**
 * 全局程序代理对象
 * 
 * @author Administrator
 *
 */
public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");
		BaseService base = (BaseService) context.getBean("BaseService");
		base.testMethod("测试");
	}

}
