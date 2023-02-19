package logical;

public class EvenRecursion {
	static int print(int n){
		if (n>=10){
			return 10;
		}else{
			System.out.println(n);
			return print(n+2);
		}
	}
	public static void main(String[] args) {
		int a = 10;
		System.out.println(print(0));
	}
}
