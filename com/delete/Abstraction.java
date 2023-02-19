package com.delete;

interface Mobile{
	void start();
	void stop();
}
class Vivo implements Mobile{
	@Override
	public void start(){
		System.out.println("Vivo mobile started using");
	}
	@Override
	public void stop(){
		System.out.println("Vivo mobile stoped using");
	}
}
class Oppo implements Mobile{
	@Override
	public void start(){
		System.out.println("Oppo mobile started using");
	}
	@Override
	public void stop(){
		System.out.println("Oppo mobile stoped using");
	}
}
class Person{
	void use(Mobile m){
		m.start();
		m.stop();
	}
}
public class Abstraction {
	public static void main(String[] args) {
		Person p = new Person();
		Vivo v = new Vivo();
		Oppo o = new Oppo();
		
		p.use(v);
		p.use(o);
	}
}















