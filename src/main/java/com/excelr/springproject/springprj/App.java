package com.excelr.springproject.springprj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
    	String path="com/excelr/resources/applicationContext.xml";
    	//i m creating from where the bean will be fetched by my container
    	ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext(path);
    	//creating the container
    	
    	
    	Student s1=(Student) context.getBean("std1");
    	//container to get the bean
    	System.out.println(s1);
    	//printing the bean
    	
    	Student s2=(Student) context.getBean("std2");
    	//container to get the bean
    	System.out.println(s2);
    	//printing the bean
    	
    }
}
