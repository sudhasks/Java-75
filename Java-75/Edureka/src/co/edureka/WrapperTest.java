package co.edureka;

public class WrapperTest {
	public static void main(String[] args) {		
		/*---- creating a wrapper instance ---- */		
		Integer i1 = new Integer(25);
		Integer i2 = Integer.valueOf(25);
		
		Integer i3 = new Integer("25");
		Integer i4 = Integer.valueOf("25");
		
		System.out.println(i1+" | "+i2+" | "+i3+" | "+i4);
		
		Character c1 = new Character('A');
		Character c2 = Character.valueOf('A');
		System.out.println(c1+" | "+c2); 
		System.out.println("---------------------------------");
		
		Float floatData = Float.valueOf(12.34f);
		byte b = floatData.byteValue();
		short s = floatData.shortValue();
		int n = floatData.intValue();
		long l = floatData.longValue();
		float f = floatData.floatValue();
		double d = floatData.doubleValue();
		System.out.println(b+" | "+s+" | "+n+" | "+l+" | "+f+" | "+d);
	}
}
