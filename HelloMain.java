package helloSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("helloSpring/beans.xml");
		HelloBean hb=(HelloBean)context.getBean("hello");
		System.out.println(hb.getMessage());
	}

}
