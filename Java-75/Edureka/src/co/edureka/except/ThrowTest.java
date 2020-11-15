package co.edureka.except;

public class ThrowTest {

	public static void main(String[] args) {
		System.out.println("start main method...");
		//throw new ArithmeticException();
		//throw new ArithmeticException("cannot divide a number by zero!");
		try {
			throw new InterruptedException();
		}catch(Exception ex) {}
		
		//System.out.println("end main method...");
	}
}
