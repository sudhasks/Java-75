package co.edureka.util;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet<String> names = new LinkedHashSet<>();
		
		System.out.println(names+" | Size = "+ names.size());
		
		System.out.println(names.add("Anil")); //true
		System.out.println(names.add("Anil")); //false
		names.add("Sanjay");
		names.add("Rahul");
		names.add("Pankaj");
		names.add("Sunil");
		
		System.out.println(names+" | Size = "+ names.size());
	}
}
