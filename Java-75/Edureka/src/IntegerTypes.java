
public class IntegerTypes 
{
	public static void main(String[] args) 
	{
	  byte b = 127;
	  //byte b = 128; //Type mismatch: cannot convert from int to byte
	  System.out.println(b);
	  
	  long pop = 12345678912L;
	  System.out.println("World Population = " + pop);
	  
	  int n = (int)12L;
	  System.out.println(n);
	}
}
