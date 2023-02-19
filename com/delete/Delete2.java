package com.delete;

public class Delete2 {
	public static void main(String[] args) {

		int[] arr = {2,3,1,6,5};
		String res = "";

		for(int i=0; i<arr.length; i++) {
			int number = 0;
			int cnt = 0;
			while (arr[i] != 0)
			{
				int rem = arr[i] % 2;
				double c = Math.pow(10, cnt);
				number += rem * c;
				arr[i] /= 2;
				cnt++;
			}
			res = res + number +" ";
		}

		System.out.println(res);
	}
}
