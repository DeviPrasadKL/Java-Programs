package logical;

import java.util.Scanner;

public class EvenOddWithout {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		sc.close();
		
		if((a&1)==0){
			System.out.println("Even");
		}else{
			System.out.println("Odd");
		}
	}
}
