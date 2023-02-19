package practice;
class New{
	public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		  if (isAsleep || (isMorning && isMom)){
		    return false;
		  }else{
		    return true;
		  }
		}
}
public class Practice12 {
	public static void main(String[] args) {
		System.out.println(New.answerCell(true, false, false));
	}
}
