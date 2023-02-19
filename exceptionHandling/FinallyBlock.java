package exceptionHandling;

public class FinallyBlock {
	public static void main(String[] args) {
		System.out.println("Start");
		
		try{
			System.out.println(10/0);
		}
		catch(Exception e){
			System.out.println("Cannot divide by 0");
		}
		
		finally{
			System.out.println("Inside finally block");
			//This block will be executed always
		}
		
		System.out.println("End");
	}
}
