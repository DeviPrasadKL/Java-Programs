package practice;

class MiddleThree {
	public static void main(String[] args) {
		middleThree("Candy");
	}

	static void middleThree(String str) {
		char[] strA = str.toCharArray();
		String s = "";
		s = s+strA[(strA.length/2)-1]+strA[(strA.length/2)]+strA[(strA.length/2)+1];
		System.out.println(s);
	}
}
