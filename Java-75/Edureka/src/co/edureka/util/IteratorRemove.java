package co.edureka.util;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemove {

	public static void main(String[] args) throws InterruptedException {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=10;i<=60;i+=10) {
			list.add(i);
		}
		
		System.out.println(list);
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext())
		{
		  Integer n = it.next();
		  System.out.print(n+"   ");
		  Thread.sleep(1000);
		  if(n == 30)
			  it.remove();
		}
		System.out.println("\n");	
		
		System.out.println(list);
	}

}
