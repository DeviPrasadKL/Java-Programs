package threads;

class Student1new extends Thread{
	String name;
	Trainer trainer;
	
	Student1new(String name,Trainer trainer){
		this.name = name;
		this.trainer = trainer;
	}
	
	@Override
	public void run(){
		trainer.askQuestion(name);
	}
}
class Trainer{
	synchronized void askQuestion(String name){
		System.out.println(name+" is asking question");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name+" has got the answer. \n--------");
	}
}
public class MultiThreading {
	public static void main(String[] args) {
		Trainer trainer = new Trainer();
		
		Student1new s1 = new Student1new("Tom", trainer);
		Student1new s2 = new Student1new("Jerry", trainer);
		Student1new s3 = new Student1new("Alex", trainer);
		
		s1.start();
		s2.start();
		s3.start();
	}
}

















