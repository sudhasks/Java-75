
public class ArrayInitialization {

	public static void main(String[] args) {
		int[] marks = {90,78,89,94,76,91};
		System.out.println("No of Subjects = "+ marks.length);
		
		//array iteration using for loop
		for(int i=0;i<marks.length;i++) {
			System.out.println("Subject-"+(i+1)+" = "+ marks[i]);
		}
		
		System.out.print("Marks Obtained : ");
		//array iteration using enhanced for loop		
		for(int mark : marks) {
			System.out.print(mark+" | ");
		}
		System.out.println();
		
		System.out.println(marks[6]); //java.lang.ArrayIndexOutOfBoundsException
	}
}
