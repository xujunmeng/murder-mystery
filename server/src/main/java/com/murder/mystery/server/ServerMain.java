package com.murder.mystery.server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 启动函数
 * @author admin
 *
 */
public class ServerMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Server server = applicationContext.getBean(Server.class);
		
		server.start();
	}

}