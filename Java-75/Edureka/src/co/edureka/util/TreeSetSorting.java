package co.edureka.util;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetSorting {

	public static void main(String[] args) 
	{
		TreeSet<String> names = new TreeSet<>(new MyComparator());
		System.out.println(names+" | Size = "+ names.size());
		
		System.out.println(names.add("Anil")); //true
		System.out.println(names.add("Anil")); //false
		names.add("Sanjay");
		names.add("Rahul");
		names.add("Pankaj");
		names.add("Sunil");
		
		System.out.println(names);
	}
}

class MyComparator implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {		
		if(o1.compareTo(o2)>0)
			return -1;
		else if(o1.compareTo(o2)<0)
			return 1;
		else
			return 0;
	}	
}
