package com.example.movierec;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SpringBootApplication
public class Driver {
	//Bean definitions
	public static void main(String[] args) {

		//Creating a Spring Context manually
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		User usr = (User) context.getBean("user");
		usr.displayInfo();

	}

}
