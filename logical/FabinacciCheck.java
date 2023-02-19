package logical;
import java.util.Scanner;
/*
3 is a Fibonacci number since (5*3*3 + 4) is 49 which is 7*7
5 is a Fibonacci number since (5*5*5 – 4) is 121 which is 11*11
4 is not a Fibonacci number since neither (5*4*4 + 4) = 84 nor (5*4*4 – 4) = 76 are perfect squares.
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
 */
public class FabinacciCheck{

	static boolean checkPerfectSquare(int x){
		int s = (int) Math.sqrt(x);
		return (s*s==x);
	}
	static boolean checkFibonacci(int num){
		return checkPerfectSquare(5*num*num+4) || checkPerfectSquare(5*num*num-4);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an interger number:");
		int num = sc.nextInt();
		checkFibonacci(num);

		if (checkFibonacci(num) == true)
			System.out.println(num + " is a Fibonacci number");
		else
			System.out.println(num + " is not a Fibonacci number");
	}
}
