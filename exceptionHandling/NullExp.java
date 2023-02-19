package exceptionHandling;

public class NullExp {
	int id = 10;
	public static void main(String[] args) {
		System.out.println("Start");
		
		NullExp n = new NullExp();
		n = null;
		
		if(n==null){
			System.out.println(n.id);
			//NullPointerException
		}
		
		System.out.println("End");
	}
}
