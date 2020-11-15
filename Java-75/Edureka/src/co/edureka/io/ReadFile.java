package co.edureka.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReadFile {

	public static void main(String[] args) throws Exception {
		FileInputStream fin = new FileInputStream("src/co/edureka/io/java.txt");
		
		/*
		System.out.println("No of characters to read = "+ fin.available());
		System.out.println(fin.read());
		System.out.println(fin.read());
		System.out.println("No of characters to read = "+ fin.available());
		*/
		
		/*
		//to read file contents byte-by-byte
		int n = fin.read();
		while(n != -1) {
			System.out.print((char)n);
			Thread.sleep(100); //100ms delay
			n = fin.read();
		}
		*/
		
		/*
		//to read file contents completely
		byte[] b = new byte[fin.available()]; //creating a byte[] with size of file
		fin.read(b);
		String str = new String(b);
		System.out.println(str);
		
		for(int i=0;i<b.length;i++) {
			System.out.print((char)b[i]);
			Thread.sleep(100);
		}
		*/
		
		//to read file contents line-by-line
		//--to convert a bytestream to character stream
		InputStreamReader source = new InputStreamReader(fin);
		BufferedReader br = new BufferedReader(source);
		String line = br.readLine();
		while(line != null) {
			System.out.println(line);
			Thread.sleep(2000);
			line = br.readLine();
		}
		fin.close();
		br.close();
	}
}
