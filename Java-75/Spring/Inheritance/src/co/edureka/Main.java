package co.edureka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//initializng the Spring Container (or) IoC
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Student st1 = (Student)context.getBean("stud1");
		
		Student st2 = (Student)context.getBean("stud2");
		
		System.out.println(st1);
		System.out.println(st2);
	}
}
