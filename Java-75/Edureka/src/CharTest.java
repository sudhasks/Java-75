
public class CharTest {

	public static void main(String[] args) {
		char c = 'A';
		System.out.println(c);
		
		c = 65; //implicit type conversion
		System.out.println(c);
		
		c = '\u0041'; //unicode character
		System.out.println(c);
		
		c = '\u0905';
		System.out.println(c);
		
		c = '\u4eca';
		System.out.println(c);
	}
}
