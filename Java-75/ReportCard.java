/*
 * Reportcard Generation
*/
import java.util.Scanner;
class ReportCard 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter student name: ");
		String name = sc.nextLine();

		System.out.print("enter the no of subjects: ");
		int no = sc.nextInt();
		
		//create an int array to store marks
		int[] marks = new int[no];
		
		marksEntry(marks); //method call for marks entry
		printRC(name, marks); //method call for printing report card
	}

	/*----------- method for marks entry ---------*/
	static void marksEntry(int[] marks)
	{
		for(int i=0;i<marks.length;i++){
			System.out.print("mark for Subject-"+(i+1)+": ");
			marks[i] = sc.nextInt();
		}
	}

	/*----------- method for generating report card ----------*/
	static void printRC(String name, int[] marks)
	{
		System.out.println("-----------------------------------------");
		System.out.println("\tREPORT CARD");
		System.out.println("NAME: "+ name);
		System.out.println("-----------------------------------------");
		System.out.println("  SUBJECT\t MARKS");
		System.out.println("-----------------------------------------");
		int total = 0;
		for(int i=0;i<marks.length;i++){
			System.out.println("Subject-"+(i+1)+"\t   "+marks[i]);
			total += marks[i];
		}
		System.out.println("-----------------------------------------");
		float avg = ((float)total)/marks.length;

		System.out.printf("TOTAL: %d \tAVERAGE: %.2f\n",total,avg);
		System.out.println("-----------------------------------------");
	}
}
