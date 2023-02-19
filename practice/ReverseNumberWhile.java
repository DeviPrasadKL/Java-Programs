package practice;
import java.util.Scanner;

class ReverseNumberWhile {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
	     System.out.println("Enter number ");
	     int num = input.nextInt();
	     input.close();
        int reversenum=0;
        
        while (num!=0)
        {
            reversenum = reversenum*10;
            reversenum = reversenum+num%10;
            num = num/10;
        }
        System.out.println("Reversse of number is "+ reversenum);
    }
}

