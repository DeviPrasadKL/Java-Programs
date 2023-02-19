package com.delete;

public class Marks {
	public static String cal(int[] a) {
		String grade = "";
		int n = a.length;
		int total =0, per = 0;

		for(int i = 0; i<n; i++) {
			total = total + a[i];
		}

		per = total/n;
		System.out.println("Percentage is "+per);

		if(per >= 90) {
			grade = "Grade S";
		}else if(per < 90 && per>=80) {
			grade = "Grade A";
		}else if(per < 80 && per>=70) {
			grade = "Grade B";
		}else if(per < 70 && per>=60) {
			grade = "Grade C";
		}else if(per < 60 && per>=40) {
			grade = "Grade D";
		}else if(per < 40) {
			grade = "Grade E";
		}
		return grade;
	}
	public static void main(String[] args) {
		int[] scores = {95,35,57,68,90};
		System.out.println(cal(scores));
	}
}
