package com.dgg.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author chenxin
 * @date 2019/11/28 17:00
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		User user = (User)context.getBean("user");
		System.out.println(user.toString());
	}
}
