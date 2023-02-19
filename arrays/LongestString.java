package arrays;

public class LongestString {
	public static void main(String[] args) {
		String[] str = {"Hello", "World", "Apple", "Mango", "", "McLaren"};
		
		int max = 0;
		String longest = null;
		int res = 0;
		for(int i=0; i<str.length; i++) {
			if(str[i].length() > max) {
				max = str[i].length();
				longest = str[i];
			}
//			if(str[i].length()==0) {
//				res = -1;
//			}
		}
		System.out.println(longest);
//		System.out.println(res);
	}
}
