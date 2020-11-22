package co.edureka.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductList {

	public static void main(String[] args) throws InterruptedException {
		List<Product> products = new ArrayList<Product>();
		
		products.add(new Product(1001,"Computer",25,25000f));
		products.add(new Product(1002,"Mobile Phone",54,15000.5f));
		products.add(new Product(1003,"Tables",12,35000f));
		
		Iterator<Product> it = products.iterator();
		while(it.hasNext()) {
			Product p = it.next();
			System.out.println(p); //toString()
			Thread.sleep(2000);
		}
	}
}
