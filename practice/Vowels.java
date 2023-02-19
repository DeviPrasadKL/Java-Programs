package practice;
//W a p to findout number of vowels in the word

class Vowels{
    public static void main(String[] args){
        String str ="wearehere";
        
        int count=0;
        for(int i=0; i< str.length(); i++){
            char ch = str.charAt(i);
            if (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
            count++;
        }
        System.out.println("Number of vowels is "+count);
    }
}