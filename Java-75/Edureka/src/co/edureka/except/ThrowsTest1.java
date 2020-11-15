package co.edureka.except;

public class ThrowsTest1 {

	public static void main(String[] args) {
		System.out.println("main method...");
		System.out.println("sleeping for 3 seconds");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		} //3000ms
		System.out.println("got up");
	}
}
