package MethodOverloading;

class Calculator{
	void square(int n){
		int res=n*n;
		System.out.println("Square of "+n+" is "+res);
	}
	void square(double n){
		double res=n*n;
		System.out.println("Square of "+n+" is "+res);
	}
	void sum(int a,int b){
		int res=a+b;
		System.out.println("Sum of "+a+" and "+b+" is "+res);
	}
	void sum(int a,int b, int c){
		int res=a+b+c;
		System.out.println("Sum of "+a+" , "+b+" and "+c+" is "+res);
	}
	void sum(double a,double b){
		double res=a+b;
		System.out.println("Sum of "+a+" and "+b+" is "+res);
	}
}
public class Main2 {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.square(2);
		c.square(5.2);
		c.sum(20, 10);
		c.sum(42.5, 20.1);
		c.sum(8, 7, 4);
	}
}
