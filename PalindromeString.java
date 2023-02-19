import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        String res = "";

        for(int i=str.length()-1; i>=0; i--){
            res = res+str.charAt(i);
        }
        System.out.println(str);
        System.out.println("Reversed-->"+res);
        
        if(res.equals(str)){
            System.out.println("This is a palindrome");
        }else{
            System.out.println("This is not a palindrome");
        }
    }
}