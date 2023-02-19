package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsDemo2 {
	static void read() throws FileNotFoundException{
		FileReader f = new FileReader("NotFile.txt");
	}
	
	public static void main(String[] args) {
		try{
			read();
		}
		catch(FileNotFoundException e){
			System.out.println("File not Found");
		}
	}
}
