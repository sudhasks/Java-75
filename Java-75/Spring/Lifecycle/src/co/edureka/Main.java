package co.edureka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//initializng the Spring Container (or) IoC
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("--------------------------------------");
		
		//closing the spring container
		//((ConfigurableApplicationContext)context).close();
		((AbstractApplicationContext)context).registerShutdownHook();
	}
}
