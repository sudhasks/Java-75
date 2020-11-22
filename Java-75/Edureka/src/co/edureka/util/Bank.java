package co.edureka.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Bank {

	public static void main(String[] args) {
		HashMap<String,Float> bank = new HashMap<String,Float>();
		
		System.out.println(bank.put("Sunil",25000f)); //null
		System.out.println(bank.put("Sunil",15000.5f)); //25000.0
		bank.put("Anil",45000f);
		bank.put("Chris",35000f);
		bank.put("Charles",14500.5f);
		bank.put("Sanjay",65000.5f);
		
		System.out.println(bank);
		System.out.println("-------------------------------");
		if(bank.containsKey("Sunil")) {
			float bal = bank.get("Sunil");
			System.out.println("A/C Balance of Sunil = "+ bal);
			bal += 1150.5f;
			bank.put("Sunil",bal);
		}
		else {
			System.out.println("-- The specified key is not in list");
		}
		System.out.println(bank);
		System.out.println("-------------------------------");
		
		System.out.print("A/C Holders ::   ");
		Set<String> names = bank.keySet();
		for(String name : names) {
			System.out.print(name + " | ");
		}
		System.out.println();
		System.out.println("-------------------------------");
		
		
		Set<Map.Entry<String, Float>> entries = bank.entrySet();
		Iterator<Map.Entry<String, Float>> it = entries.iterator();
		while(it.hasNext())
		{
			Map.Entry<String, Float> entry = it.next();
			String key = entry.getKey();
			float balance = entry.getValue();
			System.out.println(key+" : "+balance);
		}
		
		System.out.println();
		
		bank.put(null,null);
		System.out.println(bank);
	}
}
