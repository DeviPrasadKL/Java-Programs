package logical;

import java.util.ArrayList;

public class Binary {
	public static void main(String[] agr){
        int[] a = {3,6,7,2,35};
        ArrayList al = new ArrayList();
        
        for(int i=0; i<a.length; i++){
        String res = "";
            while(a[i]>0){
                int rem = a[i]%2;
                res = rem + res;
                a[i]= a[i]/2;
            }
            al.add(res);
        }
        System.out.println(al);
    }
}
