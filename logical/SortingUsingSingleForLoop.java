package logical;
import java.util.ArrayList;
import java.util.Scanner;

public class SortingUsingSingleForLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ArraySize");
		int[] arr = new int[sc.nextInt()];

		System.out.println("Enter "+arr.length+" Elements");
		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}

		int n =arr.length;

		while(n>=0){
			for(int i=0; i<arr.length-1; i++){
				if(arr[i]>arr[i+1]){
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			n--;
		}
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int j = 0; j < arr.length; j++) {
			al.add(arr[j]);
		}
		System.out.println(al);
	}
}
