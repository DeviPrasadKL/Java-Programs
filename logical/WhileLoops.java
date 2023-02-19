package logical;
import java.util.Scanner;

public class WhileLoops{
//Number of digits in given number
static int check(int num){
    int count=0;
    while(num>0){
        count++;
        num=num/10;
    }
    return count;
}

// Check how many numbers are even and odd in the given number
static void check1(int num){
    int countev=0;
    int countodd=0;
    while(num>0){
        int rem=num%10;
        
        if(rem%2==0){
            countev++;
        }else{
            countodd++;
        }
        num=num/10;
    }
    System.out.println("Even numbers are ->"+countev);
    System.out.println("Odd numbers are ->"+countodd);
    
}

//Check weather last two digts are even or not
static String check2(int n1){
      if(n1>9){
            int num=n1;
            int count=0;
        for (int i=0; i<=1; i++){
            int rem=num%10;
            if (rem%2==0){
                count++;
            }
            num=num/10;
        }
          if(count==2){
           return "Two numbers are even"; 
          }else {
            return "Two numbers are not even";
        }
      }
        return "Invalid number";
}

//Add even numbers and odd numbers 



 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter int number");
        int n = sc.nextInt();
        
        System.out.println(check2(n));
        //check2(n);
    }
}