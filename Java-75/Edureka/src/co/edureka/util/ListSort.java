package co.edureka.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSort {

	public static void main(String[] args) {
		List<Integer> marks = Arrays.asList(65,78,56,92,83);		
		System.out.println(marks);		
		
		Collections.sort(marks);
		System.out.println(marks);
	}
}
