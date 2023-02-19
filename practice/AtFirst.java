package practice;


//Given a string, return a string length 2 made of its first 2 chars. 
//If the string length is less than 2, use '@' for the missing chars.

class AtFirst {
	public static void main(String[] args) {
		atFirst(" ");
	}
	static public void atFirst(String str) {
		char[] strA = str.toCharArray();
		String s = "";

		if (strA.length>1){
			s= s+strA[0]+strA[1];
			System.out.println(s);
		}else if(strA.length==1){
			s = s+strA[0]+'@';
			System.out.println(s);
		}else{
			System.out.println(s);
		}
	}
}
