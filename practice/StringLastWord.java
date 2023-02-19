package practice;

//If a String is ending with last words "ly" ht==then return true
class StringLastWord {
	public static void main(String[] args) {
		System.out.println(endsLy("ly"));
	}

	static boolean endsLy(String str) {
		char[] strA = str.toCharArray();

		if(strA.length>1){
			char[] lastTwo = {strA[strA.length-2],strA[strA.length-1]};

			String b = "";
			for(int i=0; i<lastTwo.length; i++){
				b+=lastTwo[i];
			}
			
			String a = "ly";

			if(a.equals(b)){
				return true;
			}else{
				return false;
			} 
		}else{
			return false;
		}

	}
}
