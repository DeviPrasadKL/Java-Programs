package logical;

import java.util.Scanner;

public class FactRecursion {
	static int fact(int n){
		if (n==0){
			return 1;
		}else{
			return (n*fact(n-1));
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int i = sc.nextInt();
		sc.close();
		
		System.out.println(fact(i));
	}
}