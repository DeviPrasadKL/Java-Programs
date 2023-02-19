class FactorialRecursion {
    static int fact(int a){
        int output;
        if (a==1){
            return 1;
        }
        //Recursion: Function calling itself
        output = fact(a-1)*a;
        return output;
    }
    public static void main(String[] args) {
    System.out.println("Factorial of the number is "+fact(5));
    }
}
