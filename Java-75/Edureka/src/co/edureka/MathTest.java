package co.edureka;
import static java.lang.Math.*;
import static java.lang.System.out;

public class MathTest {

	public static void main(String[] args) {
		out.println(PI);
		out.println(E);
		out.println(sin(0));
		out.println(sin(0));
		out.println(sqrt(25));
		out.println(min(10,20));
		out.println(max(10,20));
		System.out.println(round(10.5345));
		System.out.println(floor(10.9)); //10.0
		System.out.println(ceil(10.1)); //11.0
		
		double rand = Math.random();//a floatingpoint value between 0 and 1
		System.out.println(rand);
		int otp = (int)(rand*10000);
		System.out.println("OTP = "+ otp);
	}

}
