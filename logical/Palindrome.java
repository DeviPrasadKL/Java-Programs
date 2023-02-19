package logical;
/*An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.*/
import java.util.Scanner;
public class Palindrome{
	static void palindromeOrNot(int num )
	{
		int number=num;
		int sum=0,r;
		while(num!=0){
			r=num%10;
			sum=(sum*10)+r;
			num/=10;	
		}
		if (sum==number){
			System.out.println("Palindrome sequence");
		}else{
			System.out.println("Not Palindrome sequence");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an interger number:");
		int n = sc.nextInt();
		palindromeOrNot(n);
	}
	//product and sum difference 
	public static void subtractProductAndSum(int n) {
		int prod = 1, sum = 0, rem = 0;
		while(n>0) {
			rem = n%10;
			prod = prod * rem;
			sum = sum + rem;
			n = n/10;
		}
		System.out.println(prod);
		System.out.println(sum);
	}
}
