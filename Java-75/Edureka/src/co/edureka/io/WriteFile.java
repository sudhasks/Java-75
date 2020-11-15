package co.edureka.io;

import java.io.FileOutputStream;
import java.io.FileWriter;

public class WriteFile {

	public static void main(String[] args) throws Exception{
		FileOutputStream fout = new FileOutputStream("src/co/edureka/io/edureka.txt");
		//FileOutputStream fout = new FileOutputStream("src/co/edureka/io/edureka.txt",true); //appending mode
		
		String strData = "Edureka is an online training provider with the most effective learning system in the world. We help professionals learn trending technologies for career growth.";
		//to convert a String to byte[]
		byte[] data = strData.getBytes();
		
		//to write to file
		fout.write(data);
		
		System.out.println("file saved");
		fout.close();
		
		/*---------- using FileWriter ---------*/
		FileWriter fw = new FileWriter("src/co/edureka/io/edureka_1.txt");
		fw.write(strData);
		fw.close();
	}
}
