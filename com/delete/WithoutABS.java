package com.delete;

import java.util.Scanner;

public class WithoutABS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter Second number");
		int b = sc.nextInt();
		sc.close();
		
		int c = a-b;
		if(c<0){
			System.out.println(c*-1);
		}else{
			System.out.println(c);
		}
	}
}
