package mock;

import java.util.Scanner;
//Circular Prime or not

public class Solution {
	static int pow(int n, int pow){
		for(int i=0; i<pow; i++){
			n = n * 10;
		}
		return n;
	}
	static void check(int n){
		int num1 = n;
		int num = n;
		int digits = 0;
		int count = 0;

		while(num1 != 0){
			num1 = num1/10;
			digits++;
		}
		int c = digits;

		while(c>0){
			for(int i=2; i<num; i++){
				if(num%i==0){
					count++;
				}
			}
			int rem = num%10;
			num = num/10;
			num = pow(rem,digits-1)+rem;
			
			c--;
		}
		if(count==0){
			System.out.println("Number "+n+" is a Circular prime");
		}else{
			System.out.println("Number "+n+" is a Not Circular prime");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		check(num);
	}
}























