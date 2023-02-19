class ReverseNumberWhile {
    public static void main(String[] args) {
        int num=456;
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

