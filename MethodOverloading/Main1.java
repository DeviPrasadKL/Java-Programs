package MethodOverloading;
class Graph{
	public void drawpoint(int x,int y){
		System.out.println(x+","+y);
	}
	public void drawpoint(int x,double y){
		System.out.println(x+","+y);
	}
	public void drawpoint(double x,int y){
		System.out.println(x+","+y);
	}
	public void drawpoint(double x,double y){
		System.out.println(x+","+y);
	}
}
public class Main1 {
	public static void main(String[] args) {
		Graph g = new Graph();
		g.drawpoint(2, 4);
		g.drawpoint(4, 20.7);
		g.drawpoint(20.4, 7);
		g.drawpoint(40.5, 94.6);
	}
}
