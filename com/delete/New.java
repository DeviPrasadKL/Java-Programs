package com.delete;

public class New {
	public static void main(String[] args) {
		String str = "Hello 100 and 200";
		String num = "";
		int n = 0;
		
		char[] c = str.toCharArray();
		
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<10; j++) {
				if((c[i]-48)==j) {
					num = num + c[i];
					n = Integer.parseInt(num);
				}
			}
		}
		System.out.println(n);
		System.out.println(n+1);
	}
}
