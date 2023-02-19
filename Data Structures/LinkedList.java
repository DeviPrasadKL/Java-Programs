package create;

class Node{
	int data;
	Node add;
	Node(int data){
		this.data=data;
		add=null;
	}
}

public class LinkedList{
	static Node root = null;

	//Insert    
	public static void insert(int ele){
		Node n = new Node(ele);
		if(root==null){
			root=n;
		}else{
			Node last = root;
			while(last.add != null){
				last = last.add;
			}
			last.add = n;
		}
	}
	//Delete
	public static void delete(){
		Node last = root, lastBefore = root;
		if(root==null){
			System.out.println("LinkedList is Empty");
		}else if(root.add == null){
			root = null;
		}else{
			while(last.add != null){
				lastBefore = last;
				last = last.add;
			}
			lastBefore.add = null;
		}
	}
	//Display
	public static void display(){
		Node last = root;
		if(root==null){
			System.out.println("LinkedList is Empty");
		}else{
			while(last != null){
				System.out.print(last.data+" ");
				last = last.add;
			}
			System.out.println();
		}
	}
 	//Size
	public static void size() {
		Node last = root;
		int size = 0;
		if(root==null){
			System.out.println("LinkedList is Empty");
		}else{
			while(last != null){
				size++;
				last = last.add;
			}
		}
	}
	public static void main(String[] args) {
		insert(10);
		insert(20);
		insert(30);
		insert(40);
		display();
		delete();
		delete();
		delete();
		delete();
		display();
	}
}



