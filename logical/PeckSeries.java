package logical;

import java.util.Scanner;

//0,1,2,5,12,29,70,169,408
public class PeckSeries {
	static void disp(int num){
		int a=0; 
		int b=1;
		System.out.println(a);
		for(int i=1;i<=num-2;i++){
			int c=b+2*a;
			b=a;
			a=c;
			System.out.println(c);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an interger number:");
		int n = sc.nextInt();
		disp(n);
	}
}
