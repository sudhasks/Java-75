
public class ArrayCreation1 {

	public static void main(String[] args) {
		int[][] n = new int[5][4];
		n[0][0]=34;
		
		System.out.println("Size of Array = "+ n.length);
		
		for(int i=0;i<n.length;i++) {
			System.out.println("Size of n["+i+"] = "+ n[i].length);
		}
		
		/*----array contents in a matrix from using for loop ----*/
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n[i].length;j++) {
				System.out.print(n[i][j]+"    ");
			}
			System.out.println();
		}//for
		
	}
}
