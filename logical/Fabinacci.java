package logical;
import java.util.Scanner;

//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
public class Fabinacci {
  static void disp(int num){
      int a = 0;
      int b = 1;
      int c = 0;
      System.out.print(a+" ");
      for(int i=2; i<=num; i++){
          c = a+b;
          a=b;
          b=c;
          System.out.print(c+" ");
      }
  }

//Last number of Fabinacci
  static void disp1(int num){
      int a = 0;
      int b = 1;
      int c = 0;
      for(int i=3; i<=num; i++){
          c = a+b;
          a=b;
          b=c; 
      }
      System.out.print(c);
  }

//Sum of Fabinacci
  static void disp2(int num){
      int a = 0;
      int b = 1;
      int c = 0;
      int d = 1;
      for(int i=3; i<=num; i++){
          c = a+b;
          a=b;
          b=c;
          d=d+c;
      }
      System.out.print(d);
  }
  
//Weather the number is fibnacci or not
static boolean disp3(int num, int key){
      int a = 0;
      int b = 1;
      
      int c = 0;

      for(int i=3; i<=num; i++){
          c = a+b;
          if(c==key){
          return true;
          }
          a=b;
          b=c;

      }
      return false;
  }

public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter an interger number:");
      int n = sc.nextInt();
     // int n1=sc.nextInt();
     // System.out.println(disp3(n,n1));
     disp2(n);
  }
}
