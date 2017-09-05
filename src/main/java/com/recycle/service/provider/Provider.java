package com.recycle.service.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {

	// ClassPathXmlApplicationContext context = new
	// ClassPathXmlApplicationContext( new String[] { "applicationContext.xml"
	// ,"dubbo-provider.xml"});
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "RS-provider.xml" });
		context.start();
		System.out.println("=============服务者已启动成功================");
		/*
		 * UserService userService = (UserService)
		 * context.getBean("userService"); User
		 * user=userService.getUserById("123");
		 * System.out.println(userService+"#####################"
		 * +user+"#########################");
		 * System.out.println(user.getPostname()+"|"+user.getUsername());
		 */
		System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟
	}

}
