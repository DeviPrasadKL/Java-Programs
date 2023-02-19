import java.util.Arrays;

public class Repeted {

    static void check(String[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(!(arr[i].equals(arr[j]))){
                    // System.out.println(arr[i]);
                    arr[j] = "0";
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        String[] arr = {"Facebook","Google","Facebook"};
        check(arr);
    }
}
