package objectContextRef;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppContextGet implements ApplicationContextAware{
	private static ApplicationContext context=null;

	
	public ApplicationContext getApplicationContext() {
		return context;
	}
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		context=arg0;
	}
	public AppContextGet() {
		
	}
}
