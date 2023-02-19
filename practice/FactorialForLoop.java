package practice;
import java.util.Scanner;

class FactorialForLoop {
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
	     System.out.print("Enter number ");
	     int i = input.nextInt();
        int fact = 1;
        for (i=6;i>0;i--){
            fact=fact*i;
        }
        System.out.println(fact);
    }    
}