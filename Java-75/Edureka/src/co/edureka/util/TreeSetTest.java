package co.edureka.util;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<>();
		System.out.println(names+" | Size = "+ names.size());
		
		System.out.println(names.add("Anil")); //true
		System.out.println(names.add("Anil")); //false
		names.add("Sanjay");
		names.add("Rahul");
		names.add("Pankaj");
		names.add("Sunil");
		
		System.out.println(names+" | Size = "+ names.size());
		System.out.println(names.descendingSet());
		
		names.add(null);
		System.out.println(names);
	}

}
