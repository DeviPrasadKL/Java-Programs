package create;

public class StackDs {
	static int size = 4;
	static int[] arr = new int[size];
	static int top = -1;
	
	public static boolean isFull() {
		if(top == size-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void push(int ele) {
		if(isFull()) {
			System.out.println("Stack is full");
		}else {
			top++;
			arr[top] = ele;
		}
	}
	
	public static boolean isEmpty() {
		if(top == -1) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}else {
			System.out.println(arr[top] + " Deleted");
			top--;
		}
	}
	
	public static void peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");			
		}else {
			System.out.println(arr[top]);
		}
	}
	
	public static void disp() {
		if(isEmpty()) {
			System.out.println("Stack is empty");						
		}else {
			for(int i = top; i>=0; i--) {
				System.out.println(arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		push(40);
		push(30);
		push(20);
		push(10);
		push(5);
		disp();
		System.out.println("--------------");
		pop();
		pop();
		pop();
		pop();
		pop();
	}
}
















