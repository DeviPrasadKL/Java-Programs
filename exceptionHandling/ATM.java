package exceptionHandling;
import java.util.Scanner;

//Creating Custom Exception i.e InvalidPinException
public class ATM {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Pin:");
		int pin = sc.nextInt();

		if(pin==123){
			System.out.println("Sucessfull");
		}else{
			try{
				throw new InvalidPinException("Please enter valid pin"); 
			}
			catch(InvalidPinException e){
				System.out.println(e.getMessage());
			}
		}
	}
} 

class InvalidPinException extends RuntimeException{
	private String message;

	InvalidPinException(String message){
		this.message=message;
	}

	@Override
	public String getMessage(){
		return message;
	}
}


