package com.example.movierec;

import com.example.movierec.collection.CollectionTest;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class Driver {
	//Bean definitions

	/**
	 * Adding comments test
	 * @param args
	 */
	public static void main(String[] args) {

		//Creating a Spring Context manually and configuration
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User usr = (User) context.getBean("userbean");
		Person pers = (Person) context.getBean("person");

		usr.displayInfo();
		System.out.println(pers.getName());

		System.out.println("******Collections Spring Testing*****");
		CollectionTest ct = (CollectionTest) context.getBean("collectionTest");

		System.out.println("Map:\n" + ct.getAddrMap());
		System.out.println("List: " + ct.getAddrList());
		System.out.println("Prop: " + ct.getAddrProp());
		System.out.println("Set:" + ct.getAddrSet());
		
		context.registerShutdownHook();
	}

}
