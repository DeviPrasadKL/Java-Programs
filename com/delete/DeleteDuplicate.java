package com.delete;

import java.util.ArrayList;

public class DeleteDuplicate {
	public static void main(String[] args) {
		int[] arr = {1,2,5,2,3,2,5,4,8,3};
		int n = arr.length;
		while(n>=0){
			for(int i=0; i<arr.length-1; i++){
				if(arr[i]>arr[i+1]){
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			n--;
		}
		System.out.println("Array before removing Duplicates");
		ArrayList a = new ArrayList();
		for(int i=0; i<arr.length; i++){
			a.add(arr[i]);
		}
		System.out.println(a);

		ArrayList b = new ArrayList();
		// int[] b = new int[arr.length];
		int x=0;

		for(int i=0; i<arr.length-1; i++){
			if(arr[i]!=arr[i+1]){
				// b[x++] = arr[i];
				b.add(arr[i]);
			}
		}
		b.add(arr[arr.length-1]);
		// b[x++] = arr[arr.length-1];
		// System.out.println(Arrays.toString(b));
		System.out.println("Array After removing Duplicates");
		System.out.println(b);
	}
}
