package co.edureka.util;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueTest {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=10;i>0;i--) {
			pq.add(i);
		}
		System.out.println(pq);
		
		Iterator<Integer> it = pq.iterator();
		while(it.hasNext()) {
			Integer n = it.next();
			System.out.print(n+"   ");
		}
		System.out.println();
		
		for(int i=1;i<=10;i++) {
			Integer n = pq.poll();
			System.out.println(n);
		}
	}
}
