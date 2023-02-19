package logical;

import java.util.Scanner;

public class AddString {
	private static int pow(int n, int pow) {
		for (int i=0; i<pow;i++) {
			n = n*10;
		}
		return n;
	}
	private static int run(String s1, String s2) {
		int n1=0;
		int n2=0;
		for (int i=s1.length()-1; i>=0; i--) {
			n1 += pow((int)s1.charAt(i)-48, s1.length()-i-1);
		}
		for (int i=s2.length()-1; i>=0; i--) {
			n2 += pow((int)s2.charAt(i)-48, s2.length()-i-1);
		}
		return n1+n2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String number");
		String a = sc.next();
		System.out.println("Enter Second String number");
		String b = sc.next();
		sc.close();
		System.out.println("Sum of "+a+" and "+b+" is ");
		System.out.println(run(a,b));
	}

}
