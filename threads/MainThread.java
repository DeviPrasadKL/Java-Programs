package threads;
class Jerry extends Thread{
	@Override
	public void run(){
		for(int i=6; i<=10; i++){
			System.out.println("Jerry->"+i);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
class Tom1 extends Thread{
	
	@Override
	public void run(){
		for(int i=1; i<=5; i++){
			System.out.println("Tom->"+i);
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
public class MainThread {
	public static void main(String[] args) {
		Tom1 t = new Tom1();
		t.setName("Tom Thread");
		t.start();
		
		Jerry j = new Jerry();
		j.setName("Jerry Thread");
		j.start();
	}
}
