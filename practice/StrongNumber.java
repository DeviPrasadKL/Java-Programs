package practice;

import java.util.Scanner;

class StrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int num= number;

		int sum = 0;
		while(num>0){
			int r = num%10;
			sum = sum +check(r);
			num = num/10;
		}
		if (sum==number){
			System.out.println("Strong nnumber");
		}else{
			System.out.println("Not a Strong Number");
		}
	}

	static int check(int n){
		int fact = 1;
		int r = n%10;
		for (int i=1; i<=r; i++){
			fact=fact*i;
		}
		n=n/10;
		return fact;
	}
}
