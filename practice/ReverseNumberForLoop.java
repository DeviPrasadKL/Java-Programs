package practice;

class ReverseNumberForLoop {
public static void main(String[] args) {
    int num=456;
    int reversenum=0;
    /*NO initialization part as num is already initialized and
     * NO increment?decrement partas Logic num = num/10 already
       decrements the value of num*/
    for ( ;num != 0; )
    {
        reversenum = reversenum * 10;
        reversenum = reversenum+num % 10;
        num = num/10;
    }
    System.out.println("Reversed number is "+reversenum);
}    
}
