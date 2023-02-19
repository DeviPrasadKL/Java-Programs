package practice;
//Generate 2 random numbers between 10-300

import java.util.*;
class RandomNumber {
    public static void main(String[] args) {
        Random rnum = new Random();

        for (int a=1; a<3 ;a++){
            System.out.println(rnum.nextInt(300));
        }
        System.out.println("These are your random numbers");
    }
}
