package collectionsStart;

import java.util.ArrayList;

public class ForLoop {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);

		//Forward Direction (Normal for loop)
		for (int i=0; i<a.size(); i++){
			System.out.println(a.get(i));	//10 20 30 
		}
		
		System.out.println("-----------------------------------");

		//Reverse Direction (Normal for loop)
		for (int i=a.size()-1; i>=0; i--){
			System.out.println(a.get(i));	//30 20 10 
		}
		
		System.out.println("-----------------------------------");
		
		//Enhanced For Loop
		int[] arr = {10,20,30,70,80};
		for (int i : arr){
			System.out.println(i);	//10 20 30 70 80
		}
		
		System.out.println("-----------------------------------");
		
		//For double array
		double[] d = {98.4, 57.9, 78.76};
		for(double i : d){
			System.out.println(i);	//98.4 57.9 78.76
		}
	}
}






















