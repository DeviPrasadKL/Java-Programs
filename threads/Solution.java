package threads;

class Student1 implements Runnable{
	@Override
	public void run(){
		System.out.println("Studying");
	}
/*Thread class and Runnable interface are present in java.lang package
We need to follow Contract of Abstract when we implement Runnable interface*/
}
public class Solution {
	public static void main(String[] args) {
		Student1 s = new Student1();
		Thread t = new Thread(s);
		t.setName("Student1 String");
		t.start();
		
		//OR
		
		Thread t1 = new Thread(new Student1());
		t.setName("Student1 String");
		t.start();
		
		//OR
		
		Thread t2 = new Thread(new Student1(), "Student1 Thread");
		t2.start();
		
		//OR
		
		new Thread(new Student1(), "Student1 Thread").start();
	}
}
