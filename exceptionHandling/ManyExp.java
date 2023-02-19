package exceptionHandling;

public class ManyExp {
	public static void main(String[] args) {

		try{
			System.out.println(10/0);
		}
		catch(NullPointerException e){
			System.out.println("Cannot divide by zero");
		}
		catch(ArithmeticException e){
			System.out.println("Cannot divide by zero");
		}
		catch(Exception e){
			System.out.println("Cannot divide by zero");
		}
	//If we write Exception first then no need to write other catch blocks
	}
}
