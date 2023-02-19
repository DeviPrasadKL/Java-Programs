package collectionsStart;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListEvenNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Enter "+size+" Elements");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		System.out.println("Array elements");
		for(int a : arr){
			System.out.println(a);
		}
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i : arr){	//Only even numbers are added to ArrayList
			if(i%2==0){
				al.add(i);
			}
		}
		System.out.println("---------------------------");
		System.out.println("ArrayList elements");
		
		for (int i : al){	//All the elements in ArrayList
			System.out.println(i);
		}
		
		//Even numbers in the range 20 to 50
		System.out.println("Even numbers in the range 20 to 50");
		for(int o : al){
			if (o>20 && o<50){
				System.out.println(o);
			}
		}
	}
}
