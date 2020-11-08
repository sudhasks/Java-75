
public class ArrayInitialization1 {

	public static void main(String[] args) {
		int[][] n = {{1,2,3},{4,5},{6,7,8,9}};
		
		System.out.println("Size of Array = "+ n.length);
		
		for(int i=0;i<n.length;i++) {
			System.out.println("Size of n["+i+"] = "+ n[i].length);
		}
		
		/*----array contents in a matrix from using for enhanced for loop ----*/
		for(int x[] : n) {
			for(int y : x) {
				System.out.print(y+"    ");
			}
			System.out.println();
		}//for
		
		System.out.println("---------------------------------\n");
		
		int[][] x = new int[][] {{10,20,30}};
		System.out.println("Size of x = "+ x.length);
		System.out.println("Size of x[0] = "+ x[0].length);
		
		for(int y[] : x) {
			for(int z : y) {
				System.out.print(z+"    ");
			}
			System.out.println();
		}//for
	}
}
