package exceptionHandling;

public class SpeacialAndGeneral {
	public static void main(String[] args) {
		System.out.println("Start-1");
		int[] a = {10,20,30};

		try{
			System.out.println(a[100]);  //Throws new ArrayIndexOutOfBoundsException()
		}
		catch(ArrayIndexOutOfBoundsException e){		
			//This is Specialization 
			System.out.println("Invalid Arrray Index");
		}
//Internally ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException();

		System.out.println("End-1");
		System.out.println("------------------------------------------");
		
		System.out.println("Start-2");
		
		GeneralizationException g = new GeneralizationException();
		g.general();
		
		System.out.println("End-2");
	}
}

class GeneralizationException{
	void general(){
		int[] b = {10,20,30,40};
		
		try{
			System.out.println(b[50]);	//Throws new ArrayIndexOutOfBoundsException()
		}
		catch(Exception e){		
			//This is Generalization 
			System.out.println("Invalid Arrray Index");
		}
	}
}
//Internally Exception e = new ArrayIndexOutOfBoundsException();







