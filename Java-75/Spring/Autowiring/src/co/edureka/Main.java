package co.edureka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.entity.Product;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		Inventory inv = (Inventory)context.getBean("inventory");
		
		Product product = inv.getProd();
		
		System.out.println(product);
	}
}
