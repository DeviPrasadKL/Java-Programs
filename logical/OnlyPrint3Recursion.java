package logical;

import java.util.Scanner;

public class OnlyPrint3Recursion {
	static int print(int n){
		if(n==0){
			return 0;
		}else{
			System.out.println(n);
			return print(n-1);
		}
	}
	public static void main(String[] args) {
/*		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int i = sc.nextInt();
		sc.close();*/
		System.out.println(print(3));
	}
}
