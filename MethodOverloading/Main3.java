package MethodOverloading;

public class Main3 {
	//Sum of n numbers
	static void sum(int...n){
		int result=0;
		for (int i=0; i<n.length; i++){
			result=result+n[i];
		}
		System.out.println("Summ of all the numbers is "+result);
	}
	public static void main(String[] args) {
		sum(856,94,84,80);
		sum(525,23,4,6,5,354,6,24,955,5);
	}
}