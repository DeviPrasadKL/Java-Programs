package mock;

import java.util.LinkedList;
import java.util.Scanner;
//Binary Arrays elements in LinkedList

public class Soulition4 {
	static void convert(int[] a){
		LinkedList<String> l = new LinkedList<String>();
		for(int i=0; i<a.length; i++){
			String res = "";
			if(a[i]==0){
				l.add("0");
				continue;
			}
			while(a[i] > 0){
				int rem = a[i]%2;
				a[i] = a[i]/2;
				res = rem + res;
			}
			l.add(res);
		}
		System.out.println(l);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter "+size+" Elements");
		for(int i=0; i<size; i++){
			arr[i]=sc.nextInt();
		}
		
		convert(arr);
	}
}
