package exceptionHandling;

public class ThrowsDemo1 {
	static void disp() throws Exception{
		for(int i=0; i<=5; i++){
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
	
	public static void main(String[] args) {
		try{
			disp();
		}
		catch(Exception e){
			System.out.println("Handled");
		}
	}
}
