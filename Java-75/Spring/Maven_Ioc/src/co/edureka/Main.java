package co.edureka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("--------------------------------");
		
		Student st1 = (Student)factory.getBean("stud1");
		System.out.println(st1);

		System.out.println("--------------------------------");
		
		Student st2 = (Student)factory.getBean("stud1");
		System.out.println(st2);
		
		System.out.println("--------------------------------");
		
		Student st3 = (Student)factory.getBean("stud1");
		System.out.println(st3);
		
		System.out.println("--------------------------------");
	}
}
