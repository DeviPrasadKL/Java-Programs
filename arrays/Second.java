package arrays;

public class Second {
	public static void main(String[] args) {
		//Both declaration and creation
		int[] a1 = new int[2];
		a1[0]=10;
		a1[1]=20;

		//Declaration and initialization
		int[] a2 = {10,80,40};

		//for printing array elements
		for (int i=0; i<a1.length; i++){
			System.out.println(a1[i]);
		}
		
		System.out.println("------------------");
		
		//Similarly
		for (int i=0; i<a2.length; i++){
			System.out.println(a2[i]);
		}
		System.out.println("-------for each loop-----------");
		
		//Printing the Array Elements
		for(int ele:a1){
			System.out.println(ele);
		}
		System.out.println("========");
		for (int ele:a2){
			System.out.println(ele);
		}
		
		System.out.println("--------for each loop----------");
		
		//To print it in reverse order
		for (int i=a1.length-1; i>=0; i--){
			System.out.println(a1[i]);
		}
		
		System.out.println("------------------");
		
		for (int i=a2.length-1; i>=0; i--){
			System.out.println(a2[i]);
		}
	}
}
