package librariesOfJava;
import java.util.Scanner;

class ExceptionHandling {
	public static void main(String[] args) {
		
		System.out.println("Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first a number");
		int a = sc.nextInt();

		System.out.println("Enter 2nd number");
		int b = sc.nextInt();

		sc.close();
		
//		try{
//			System.out.println(a/b);	//Throw New ArithmeticException
//		}
//		//Specialisation
//		catch(ArithmeticException obj){	//ArithmeticException obj = New ArithmeticException
//			System.out.println("Cannot divide by zero");
//		}
		
		//------OR--------------------------------------------------------//
		try{
			System.out.println(a/b);
		}
		//(Genralisation)
		catch(Exception obj){	//Exception obj = New ArithmeticException 
			System.out.println("Cannot divide by zero");
		}
		
		
		System.out.println("End");
	}
}
