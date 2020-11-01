import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("which number's multiplication table: ");
		int num = sc.nextInt();
		
		printTable(num); //method call with arguments 
	}
	
	static void printTable(int n) 
	{
		for(int i=1;i<=10;i++) {
			int prod = n * i;
			System.out.println(n+" x "+i+" = "+ prod);
		}
	}

}
