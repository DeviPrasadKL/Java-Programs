package logical;
import java.util.Scanner;

public class SpecialSingleNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the int number");
		int num = sc.nextInt();
		sc.close();

		int sum=0;
		while(num!=0){
			int rem = num%10;
			sum = sum + rem;
			num = num/10;
		}

		int lastSum=0;
		int lastSum2=0;
		int rem=0;
		int rem2=0;

		if (sum>9){
			while(sum!=0){
				rem = sum%10;
				lastSum = lastSum+rem;
				sum = sum/10;
				if (lastSum>9){
					while(lastSum>0){
						rem2 = lastSum%10;
						lastSum2 = lastSum2+rem2;
						lastSum = lastSum/10;
					}
				}
			}
			if (lastSum>9){
				System.out.println(lastSum2);
			}else{
				System.out.println(lastSum);
			}
		}else{
			System.out.println(sum);
		}
	}
}
