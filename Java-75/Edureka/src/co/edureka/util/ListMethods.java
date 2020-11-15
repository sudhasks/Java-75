package co.edureka.util;

import java.util.ArrayList;

public class ListMethods {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		System.out.println(names+" | Size="+names.size());
		
		System.out.println(names.add("Sunil"));
		System.out.println(names.add("Sunil"));
		names.add("Anil");
		names.add("Jeffery");
		names.add("Chris");
		names.add("Charles");
		names.add("Steve");
		System.out.println(names+" | Size="+names.size());
		
		names.add(1,"Praveen");
		names.set(3, "New Anil");
		names.add("Sunil");
		System.out.println(names+" | Size="+names.size());
		
		System.out.println("Is Sunil in List = "+ names.contains("Sunill"));
		
		System.out.println("Index of Sunil = "+ names.indexOf("Sunil"));
		System.out.println("Last Index of Sunil = "+ names.lastIndexOf("Sunil"));
		
		System.out.println("Person @ index 0 = "+ names.get(0));
		
		System.out.println("Removed Person @ index 5 = "+ names.remove(5)); //Chris
		System.out.println("Removed Sunil = "+ names.remove("Sunil")); //true
		System.out.println(names+" | Size="+names.size());
	}
}
