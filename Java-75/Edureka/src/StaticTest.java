
public class StaticTest {
	static {
		System.out.println("Inside static block");
		System.out.println("Application designed & developed by");
	}
	public static void main(String[] args) {
		System.out.println("MAIN METHOD");
	}
	static {
		System.out.println("Inside static block");
		System.out.println("team@edureka");
	}
	static void hello() {
		System.out.println("Hello");
	}
}
