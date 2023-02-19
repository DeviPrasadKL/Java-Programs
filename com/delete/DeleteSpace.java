package com.delete;

public class DeleteSpace {
	public static void main(String[] args) {
		String s = "Hello World How are You";
		String res = "";
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==' ') {
				continue;
			}else {
				res += s.charAt(i);
			}
		}
		System.out.println(res);
	}
}
