package co.edureka.util;

import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<String,Float> bank = new TreeMap<>();
		
		System.out.println(bank.put("Sunil",25000f)); //null
		System.out.println(bank.put("Sunil",15000.5f)); //25000.0
		bank.put("Anil",45000f);
		bank.put("Chris",35000f);
		bank.put("Charles",14500.5f);
		bank.put("Sanjay",65000.5f);
		
		System.out.println(bank);
		
		//bank.put("Arun",null);
		bank.put(null,24000f);
		System.out.println(bank);
	}
}
