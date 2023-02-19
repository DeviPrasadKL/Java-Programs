package logical;
import java.util.Scanner;

//0,1,4,9,16,25,36,49,64
public class AnotherSeries {
	static void disp(int num){

		for(int i=0;i<=num-1;i++){
			System.out.print(i*i+" ");
		}
	}
	//3,6,12,24,48,96,192
	static void disp2(int num){
		int a=3;
		System.out.print(a);
		for(int i=1;i<=num-1;i++){
			a=a*2;
			System.out.print(" "+a);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an interger number:");
		int n = sc.nextInt();
		disp2(n);
	}
}
