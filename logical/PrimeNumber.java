package logical;
import java.util.Scanner;

public class PrimeNumber{
	//first approach
	public static void test(int num){
		int count=0;
		for (int i=2; i<=num-1; i++){
			if (num%i==0){
				count++;
			}
		}
		if (count==0){
			System.out.println("Prime");
		}else{
			System.out.println("Not prime");
		}
	}
	//Second approach
	static boolean test2(int num){
		int c=0;
		for(int i=2; i<=num-1; i++){
			if(num%i==0){
				c++;
			}
		}
		if (c==0){
			return true;
		}else{
			return false;
		}
	}
	//Third approach
	static boolean test3(int num){
		for(int i=2; i<=num-1; i++){
			if (num%i==0){
				return false;
			}
		}return true;
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an interger number:");
		int n=sc.nextInt();
		test(n);
//		System.out.println(test3(n));
	}
}