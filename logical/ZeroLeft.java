package logical;

import java.util.Scanner;

public class ZeroLeft {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length");
		int blength = sc.nextInt();
		int[] b = new int[blength];
		System.out.println("Now enter the elements");

		for(int i=0; i<b.length; i++){
			b[i]=sc.nextInt();
		}

		boolean done1 = true;

		//Swaping to left
		while (done1==true){
			done1 = false;
			for (int i=b.length-1; i>=1; i--){
				if (b[i]==0 && b[i-1]!=0){
					int temp=b[i];
					b[i]=b[i-1];
					b[i-1]=temp;
					done1 = true;
				}
			}
		}
		for (int ab : b){
			System.out.print(ab+" ");
		}
	}
}
