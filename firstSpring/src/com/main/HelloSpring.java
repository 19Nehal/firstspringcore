package com.main;


import java.nio.file.FileSystem;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.bean.HelloBean;


public class HelloSpring {
	public static void main(String[] args) {
		Resource res= null; 
		BeanFactory factory = null;
		HelloBean bean = null;
		res= new FileSystemResource("src/com/cnf/applicationContext.xml");
		factory = new XmlBeanFactory(res);
		
		bean = (HelloBean) factory.getBean("helloRef");
		System.out.println("Massage is "+ bean.getMassage());
	}
}
