package exceptionHandling;

public class MainMessage {
	public static void main(String[] args) {
		int[] a = {10,20,30};
		
		try{
			System.out.println(a[15]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
			
			/*String msg = e.getMessage();
			System.out.println(msg);
			*/
			
			//e.printStackTrace();
		}
	}
}
