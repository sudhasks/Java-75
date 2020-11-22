package co.edureka.util;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) throws InterruptedException {
		HashSet<String> names = new HashSet<>();
		
		System.out.println(names+" | Size = "+ names.size());
		
		System.out.println(names.add("Anil")); //true
		System.out.println(names.add("Anil")); //false
		names.add("Sanjay");
		names.add("Rahul");
		names.add("Pankaj");
		names.add("Sunil");
		
		System.out.println(names+" | Size = "+ names.size());
		
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			Thread.sleep(1000);
		}
		
		names.add(null);
		System.out.println(names);
	}
}
