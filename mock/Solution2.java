package mock;

import java.util.Scanner;
//nth Fibinacci is prime or not

public class Solution2 {
	static void check(int num){
		int a = 0;
		int b = 1;
		int c = 0;
		for(int i=3; i<=num; i++){
			c = a+b;
			a=b;
			b=c; 
		}
		System.out.println("nth number is "+c);
		int count = 0;
		
		if(c == 1){
			count++;
		}else{
			for(int i=2; i<c; i++){
				if(c%i == 0){
					count++;
				}
			}
		}
		
		if(count == 0){
			System.out.println("Prime");
		}else{
			System.out.println("Not Prime");
		}

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		check(num);
	}
}
