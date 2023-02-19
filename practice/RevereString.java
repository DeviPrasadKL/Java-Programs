 package practice;
import java.util.Scanner;

public class RevereString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.nextLine();
		
		char[] ch = s.toCharArray();
		String rev="";
		
		for(int i=ch.length-1; i>=0; i--){
			rev = rev + ch[i];
		}
		System.out.println(s+" ");
		System.out.println(rev+" ");
		if(rev.equals(s)){
			System.out.println("Is Palindrome");
		}else{
			System.out.println("Is Not a Palindrome");
		}
	}
}
