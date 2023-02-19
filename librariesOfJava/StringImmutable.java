package librariesOfJava;

public class StringImmutable {
	public static void main(String[] args) {
		String s1 = new String("Java");
		System.out.println(s1);		//Java
		s1.concat(" Program");		//A new concatinated object is created without reference
		System.out.println(s1);		//Java
		System.out.println("-------------------");
		
		String s2 = new String("Java");
		System.out.println(s2);		//Java
		s2 = s2.concat(" Program");	//Concatinated with ref s2, sal=me ref new object
		System.out.println(s2);		//Java Program
		System.out.println("-------------------");
		
		StringBuffer s3 = new StringBuffer("Good");
		System.out.println(s3);		//Good
		s3.append(" Afternoon");	//Mutable version of String
		System.out.println(s3);		//Good Afternoon
		System.out.println("-------------------");
		
		StringBuilder s4 = new StringBuilder("Good");
		System.out.println(s4);		//Good
		s4.append(" Afternoon");	//Mutable version of String
		System.out.println(s4);		//Good Afternoon
		System.out.println("-------------------");
		
		String s5 = new String("Good");
		System.out.println(s5);		//Good
		s5.concat(" Afternoon");
		System.out.println(s5);		//Good
	}
}
