package objectContextRef;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppContextMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppContextGet acg=new AppContextGet();
		acg.setApplicationContext(new ClassPathXmlApplicationContext("objectContextRef/beanscontext.xml"));
		ApplicationContext context=acg.getApplicationContext();
		//ApplicationContext context=new ClassPathXmlApplicationContext("helloSpring/beans.xml");
		TestBean tb=(TestBean)context.getBean("test");
		System.out.println(tb.getField());
	}	

}
