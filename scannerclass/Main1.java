package scannerclass;

import java.util.Scanner;

//Calculator program to add,sub,multi,div and mod functions
public class Main1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = s.nextInt();
		System.out.println("Enter Second number");
		int b = s.nextInt();

		System.out.println("<------Menu------->");
		System.out.println("Press \n 1) add\n 2) sub\n 3) multi\n 4) div\n 5) mod");
		int op =  s.nextInt();
		if (op==1){
			System.out.println("Addition: "+(a+b));
		}else if(op==2){
			System.out.println("Subtraction: "+(a-b));
		}else if(op==3){
			System.out.println("Subtraction: "+(a*b));
		}else if(op==4){
			System.out.println("Subtraction: "+(a/b));
		}else if(op==5){
			System.out.println("Subtraction: "+(a%b));
		}else{
			System.out.println("Invalid input");
		}
	}
}
