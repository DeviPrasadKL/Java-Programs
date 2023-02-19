package arrays;

//find out the repeated values in array
public class Forth {
	public static void main(String[] args) {
		int[] a = {10,20,10,30,20};
		int count= 0;
		for (int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				if (a[i]==a[j]){
					count++;
					System.out.print(a[j]+" ");
					System.out.println(count);
				}
			}
		}
	}
}
