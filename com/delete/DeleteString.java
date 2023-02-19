package com.delete;

public class DeleteString {
	public static void main(String[] args) {
		String s = "Hello is what are is you doing is none";
		char[] is = {'i','s'};
		char[] cha = s.toCharArray();
		String res = "";
	
		
		for (int i=0; i<cha.length-1; i++) {
			if(cha[i]=='i' && cha[i+1]=='s') {
				continue;
			}else {
				res = res+cha[i];
			}
		}
		res = res + cha[cha.length-1];
		char[] cha2 = res.toCharArray();
		String res2 = "";
		
		for (int i=0; i<cha2.length; i++) {
			if(cha2[i]=='s') {
				continue;
			}else {
				res2 = res2+cha2[i];
			}
		}
		System.out.println(res2);
	}
}
