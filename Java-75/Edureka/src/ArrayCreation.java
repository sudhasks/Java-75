
public class ArrayCreation {

	public static void main(String[] args) {
		/*---- creating an int array with 8 locations ----*/
		int[] marks = new int[8];
		marks[0] = 98;
		marks[1] = 96;
		System.out.println("Size of Array = "+ marks.length);
		
		/*----- array iteration using for loop ----*/
		for(int i=0;i<marks.length;i++) {
			System.out.print(marks[i]+"   ");
		}
		System.out.println();
		
		float []salaries = new float[5];
		for(float sal : salaries) {
			System.out.print(sal+"   ");
		}
		System.out.println();
		
		boolean status[] = new boolean[10];
		for(boolean stat : status) {
			System.out.print(stat+"   ");
		}
		System.out.println();
		
		String[] names = new String[9];
		for(String name : names) {
			System.out.print(name+"   ");
		}
		System.out.println();
		
		
		int[] x = new int[] {10,20,30};
		for(int y : x) {
			System.out.print(y+"   ");
		}
	}
}
