package arrays;

//To calculate the sum of elements in array
public class Third {
	public static void main(String[] args) {
		
		int[] a = new int[4];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		//int[] a = {10,20,30,40};
		
		int sum = 0;
		for(int i=0; i<a.length; i++){
			sum = sum + a[i];
		}
		System.out.println("Sum is-->"+sum);
		System.out.println("Average is-->"+ sum/a.length);
	}
}
