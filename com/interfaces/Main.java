package com.interfaces;

interface Demo1 {
	int var1=100; //variable becomes final variable (constant)
	//by default var1 is static,final,public
	void disp(); //abstract class
	void test();
}
class Sample implements Demo1{
	public void test(){
		System.out.println("Test() implemented in Sample");
	}
	public void disp(){
		System.out.println("disp() implemeted in Sample");
		//Sample is a implement class of Demo1 interference
	}
}
public class Main {
	public static void main(String[] args) {
		System.out.println("------------");
		Sample s = new Sample();
		s.test();
		s.disp();
		System.out.println("Var1 value is "+Demo1.var1);
		System.out.println("---------------");
	}
}
