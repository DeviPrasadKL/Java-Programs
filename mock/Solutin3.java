package mock;

import java.util.Scanner;
//Two Strings are Anagram or not

public class Solutin3 {
	static char[] sort(char[] c){
		int n = c.length;
		while(n != 0){
			for(int i=0; i<c.length-1; i++){
				if(c[i]>c[i+1]){
					char temp = c[i];
					c[i] = c[i+1];
					c[i+1] = temp;
				}
			}
			n--;
		}
	
		return c;
	}
	static String check(String a, String b){
		if(a.length() == b.length()){
			String one = a.toLowerCase();
			String two = b.toLowerCase();
			
			char[] c1 = one.toCharArray();
			char[] c2 = two.toCharArray();
			
			sort(c1);
			sort(c2);
			
			int count = 0;
			for(int i=0; i<c1.length; i++){
				if(c1[i]!=c2[i]){
					count++;
				}
			}
			if(count==0){
				return "Strings are Anagram";
			}else{
				return "Strings are Not an Anagram";
			}
		}else{
			return "Strings are Not an Anagram";
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		sc.close();
		
		System.out.println(check(a,b));
	}
}
