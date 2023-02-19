package arrays;

public class First {
	public static void main(String[] args) {
		//Array declaration
		int[] a ;
		
		//Array creation
		a = new int[4];
		
		//Array Initialization
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		
		//Both declaration and creation
		int[] a1 = new int[2];
		
		//Declaration and initialization
		int[] a3 = {10,80,40};
		
		//array.length-->gives length of array
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		
		System.out.println("---------------");
		
		System.out.println(a3[0]);
		System.out.println(a3[1]);
		System.out.println(a3[2]);
	}
}
