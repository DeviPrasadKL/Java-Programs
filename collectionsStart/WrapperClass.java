package collectionsStart;

public class WrapperClass {
	public static void main(String[] args) {
		
//Auto Boxing 
		int a = 25;
		Integer b = new Integer(a);
		System.out.println(a+" "+b);  //25(Primitive type) 25(Non-Primitive type)
		
		char i = 'A';
		Character c = new Character(i);
		System.out.println(i+" "+c);  //A A(Non-Primitive type)
		
//Auto Unboxing
		Integer p = new Integer(20);
		int q = p;
		System.out.println(p+" "+q);
		
		Double x = new Double(45.78);	//20 20(Non-Primitive type)
		double y = x;
		System.out.println(x+" "+y);	//45.78 45.78(Non-Primitive type)
	}
}
