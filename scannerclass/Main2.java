package scannerclass;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the integer value");
		int a = s.nextInt();
		s.nextLine();
		
		System.out.println("Enter the string value");
		String st = s.nextLine();
		
		System.out.println("The given integer is "+a);
		System.out.println("The giver string is "+st);
	}
}
