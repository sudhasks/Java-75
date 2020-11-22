package co.edureka.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIterations {

	public static void main(String[] args) throws Exception {
		//create a List with elements
		List<Integer> list = Arrays.asList(10,20,30,40,50,60);
		System.out.println(list);
		
		iterate1(list);
		Thread.sleep(1500); //1500ms
		
		iterate2(list);
		Thread.sleep(1500); //1500ms
		
		iterate3(list);
		Thread.sleep(1500); //1500ms
		
		iterate4(list);
		Thread.sleep(1500); //1500ms
		
		iterate5(list);
		Thread.sleep(1500);
	}
	
	static void iterate1(List<Integer> list) {
		System.out.println(">>>List iteration using a normal for loop - only for List");
		for(int i=0;i<list.size();i++) {
			Integer n = list.get(i);
			System.out.print(n+"   ");
		}
		System.out.println("\n");
	}
	
	static void iterate2(List<Integer> list) {
		System.out.println(">>>List iteration using enhanced for loop");
		for(Integer n : list) {			
			System.out.print(n+"   ");
		}
		System.out.println("\n");
	}
	
	static void iterate3(List<Integer> list) {
		System.out.println(">>>List iteration using java.util.Iterator");
		Iterator<Integer> it = list.iterator();
		while(it.hasNext())
		{
		  Integer n = it.next();
		  System.out.print(n+"   ");
		}
		System.out.println("\n");
	}
	
	static void iterate4(List<Integer> list) {
		System.out.println(">>>List iteration using java.util.ListIterator - only for List");
		ListIterator<Integer> it = list.listIterator();
		while(it.hasNext())
		{
		  Integer n = it.next();
		  System.out.print(n+"   ");
		}
		System.out.println();
		while(it.hasPrevious()) {
			Integer n = it.previous();
			System.out.print(n+"   ");
		}
		System.out.println("\n\n");
	}	
	
	static void iterate5(List<Integer> list) {
		System.out.println("<<<List iteration using java.util.Enumeration (a legacy interface)");
		Enumeration<Integer> en = Collections.enumeration(list);
		while(en.hasMoreElements()) {
			Integer n = en.nextElement();
			System.out.print(n+"   ");
		}		
		System.out.println("\n");
	}
}
