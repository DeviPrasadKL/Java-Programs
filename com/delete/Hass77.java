package com.delete;

/*[1,7,7]=true
[1,7,1,1,7]=false*/
public class Hass77 {
	
	static boolean check(int[] num){
		for(int i=0; i<num.length-1; i++){
			if((num.length>0 && num[i]==7 && num[i+1]==7) || (num.length>3 && num[i]==7 && num[i+2]==7)){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] a = {2,7,2,2,7,2};
		System.out.println(check(a));
	}
}
