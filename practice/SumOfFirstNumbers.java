package practice;
import java.util.Scanner;

class SumOfFirstNumbers {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
	     System.out.print("Enter number ");
	     int num = input.nextInt();
    	int sum=0;
        for(int i=num;i>0;i--){
            sum=sum+i;
        }
        System.out.println(sum);
    }    
}
