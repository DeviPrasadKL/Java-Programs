package create;

public class StringReverseUsingStack {
	static String str = "java pro";
	static int  top = -1;
	static int size = str.length();
	static char[] stack = new char[size];

	public static boolean isFull() {
		if(top == size-1) {
			return true;
		}else {
			return false;
		}
	}

	public static void push(char ele) {
		if(isFull()) {
			System.out.println("Stack is Full");
		}else {
			top++;
			stack[top] = ele;
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
			System.out.println("Stack is empty");;
		}else {
			System.out.println(stack[top]+" deleted");
			top--;
		}
	}
	
	public static void disp() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}else {
			for(int i=top; i>=0; i--) {
				System.out.println(stack[i]+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		for(int i=0; i<size; i++) {
			push(str.charAt(i));
		}
		disp();
	}
}



