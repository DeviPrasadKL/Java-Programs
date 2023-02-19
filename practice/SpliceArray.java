package practice;
import java.util.ArrayList;
import java.util.Scanner;

public class SpliceArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int[] res = new int[arr.length];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index to splice");
		int n = sc.nextInt();
		int x = n;

		for (int i = 0; i<arr.length; i++) {
			if(i<=x){
				res[i]=arr[n];
				n--;
			}else{
				res[i]=arr[x+1];
				x++;
			}
		}
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0; i<res.length; i++){
			al.add(res[i]);
		}
		System.out.println(al);
	}
}

