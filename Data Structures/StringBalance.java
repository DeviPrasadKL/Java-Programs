package create;

public class StringBalance {
	static int top = -1;
	static boolean b = false;
	static String str = "[[[]]";
	static int size = str.length();
	static char[] stack = new char[size];

	public static boolean isFull() {
		if(top == size) {
			return true;
		}else {
			return false;
		}
	}

	public static void push(char ele) {
		if(isFull()) {
			System.out.println("Stack is full");
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
			b = true;
		}else {
			top--;
		}
	}

	public static void main(String[] args) {
		for(int i=0; i<size; i++) {
			if(str.charAt(i) == '[') {
				push(str.charAt(i));
			}else {
				pop();
			}
		}
		if(isEmpty() && b==false) {
			System.out.println("Balanced");
		}else {
			System.out.println("Not Balanced");
		}
	}
}


