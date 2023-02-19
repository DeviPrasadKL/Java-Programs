package logical;

public class AddStringWithoutPow {

	private static int run(String s1, String s2) {
		int n1=0;
		int n2=0;
		int pow=1;
		for (int i=s1.length()-1; i>=0; i--) {
			n1 += ((int)s1.charAt(i)-48)*pow;
			pow = pow*10;
		}
		pow=1;
		for (int i=s2.length()-1; i>=0; i--) {
			n2 += ((int)s2.charAt(i)-48)*pow;
			pow = pow*10;
		}
		return n1+n2;
	}

	public static void main(String[] args) {
		System.out.println(run("157","74"));
	}

}
