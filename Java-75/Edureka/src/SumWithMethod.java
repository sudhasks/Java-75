
public class SumWithMethod {

	public static void main(String[] args) {
		int sum = addNum(10,20);
		System.out.println("Sum = "+ sum);
	}
	
	static int addNum(int x, int y) {
		int s = x+y;
		return s;
	}

}
