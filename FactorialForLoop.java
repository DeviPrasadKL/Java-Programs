class FactorialForLoop {
    public static void main(String[] args) {
        int i=6;
        int fact = 1;
        for (i=6;i>0;i--){
            fact=fact*i;
        }
        System.out.println(fact);
    }    
}