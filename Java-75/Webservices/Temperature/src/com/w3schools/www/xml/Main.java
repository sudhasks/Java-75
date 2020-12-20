package com.w3schools.www.xml;

public class Main {

	public static void main(String[] args) throws Exception{
		TempConvertLocator locator = new TempConvertLocator();
		TempConvertSoap ref = locator.getTempConvertSoap();
		
		//call web method
		String cel = "110";
		String fah = ref.celsiusToFahrenheit(cel);
		
		System.out.println(cel+"C = "+fah+"F");
	}
}
