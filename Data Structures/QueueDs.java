package create;

public class QueueDs {
	static int size = 5;
	static int[] arr = new int[size];
	static int last = 0, first = 0;
	
	public static boolean isFull() {
		if(last==size) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void enQueue(int ele) {
		if(isFull()) {
			System.out.println("Queue is Full");
		}else {
			arr[last] = ele;
			last++;
		}
	}
	
	public static boolean isEmpty() {
		if(last==first) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}else {
			for(int i=0; i<last-1; i++) {
				arr[i] = arr[i+1];
			}
			last--;
		}
	}
	
	public static void disp() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}else {
			for(int i=0; i<last; i++) {
				System.out.println(arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		enQueue(10);
		enQueue(20);
		enQueue(30);
		enQueue(40);
		enQueue(50);
		enQueue(60);	//Full
		disp();
		System.out.println("---------------");
		deQueue();
//		deQueue();
//		deQueue();
//		deQueue();
//		deQueue();
		disp();
		System.out.println(isEmpty());
	}
}















