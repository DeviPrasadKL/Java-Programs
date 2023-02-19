package practice;


//Given a string, return true if "bad" appears starting at index 0 or 1 
//in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". 
//The string may be any length, including 0.

class HasBad {
	public static void main(String[] args) {
		System.out.println(test("xbadxx"));
	}

	static boolean test(String str){
		String ref = "bad";

		char[] strA = str.toCharArray();
		String first = "";
		String second = "";

		if (strA.length>3){
			for (int i=0; i<3; i++){
				first+=strA[i];
			}
			for (int i=1; i<4; i++){
				second+=strA[i];
			}
			if (first.equals(ref) || second.equals(ref)){
				return true;
			}else{
				return false;
			}
		}else if (strA.length==3){
			for (int i=0; i<3; i++){
				first+=strA[i];
			}
			if (first.equals(ref)){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
}
