package logical;
import java.util.Scanner;

//0,1,1,2,4,7,13,24,44,81,149
public class Tripnacci {
	static void disp(int num){
		int a=0; 
		int b=1;
		int c=1;
		System.out.print(a+" "+b+" "+c);
		for(int i=1;i<=num-3;i++){
			int d=a+b+c;
			a=b;
			b=c;
			c=d;
			System.out.print(" "+d);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an interger number:");
		int n = sc.nextInt();
		disp(n);
	}
}
