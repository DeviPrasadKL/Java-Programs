package practice;

import java.util.Scanner;

//Peck Series:-0,1,2,5,12,29,70,169,408
public class Seris {
	static void disp(int num){
		int a=0; 
		int b=1;
		System.out.print(a+" ");
		for(int i=1;i<num;i++){
			int c=b+2*a;
			b=a;
			a=c;
			System.out.print(c+" ");
		}
	}
//Tripnocci Series:-0,1,1,2,4,7,13,24,44,81,149
	static void disp1(int num){
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
//0,1,4,9,16,25,36,49,64
	    static void disp2(int num){

	        for(int i=0;i<=num-1;i++){
	       System.out.print(i*i+" ");
	        }
	    }
//3,6,12,24,48,96,192
	static void disp3(int num){
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
		disp(n);
	}
}
