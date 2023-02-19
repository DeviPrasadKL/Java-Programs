package librariesOfJava;

class StringClassMethods {
	public static void main(String[] args) {
		String s = "Software Developer";

		System.out.println(s.length());		//18
		System.out.println(s.startsWith("soft"));	//false
		System.out.println(s.endsWith("er"));	//true
		System.out.println(s.toUpperCase());	//SOFTWARE DEVELOPER
		System.out.println(s.toLowerCase());	//software developer

		System.out.println(s.charAt(2));		//f
		System.out.println(s.indexOf('w'));		//4
		System.out.println(s.contains("ware"));	//true

		String a = "Java";
		String b = "Java";
		String c = "JaVA";
		System.out.println(a.equals(b));	//true
		System.out.println(a.equals(c));	//false
		System.out.println(a.equalsIgnoreCase(c)); //true
	}
}
