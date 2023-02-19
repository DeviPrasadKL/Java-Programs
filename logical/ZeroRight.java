package logical;

import java.util.Scanner;

public class ZeroRight {

	public static void swap(int[] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length");
		int alength = sc.nextInt();
		int[] a = new int[alength];
		System.out.println("Now enter the elements");

		for(int i=0; i<a.length; i++){
			a[i]=sc.nextInt();
		}

		boolean done = true;

		//Swaping to right
		while (done==true){
			done = false;
			for (int i=0; i<a.length-1; i++){
				if (a[i]==0 && a[i+1]!=0){
					swap(a, i, i+1);
					done = true;
				}
			}
		}


		for (int ar : a){
			System.out.print(ar+" ");
		}
	}
}
