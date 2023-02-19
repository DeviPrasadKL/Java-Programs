package polymorphism;

class Animal{
	
	void sound(){
		System.out.println("Animal sound");
	}
	Coller c = new Coller();
	void col(){
		c.animalcoller();
	}
}
class Dog extends Animal{
	
	void sound(){
		System.out.println("Dog sound");
	}
}
class Cat extends Animal{
	void sound(){
		System.out.println("Cat sound");
	}
}
class Bulldog extends Dog{
	void sound(){
		System.out.println("Bulldog sound");
	}
}
class Elephant extends Animal{
	void sound(){
		System.out.println("Elephant sound");
	}
}
class Coller{
	void animalcoller(){
		System.out.println("Animal coller");
	}
}
public class MainAnimal {
	public static void main(String[] args) {
		Animal a = (Animal) new Dog();
		a.sound();
		a.col();
		Animal a1 = new Cat();
		a1.sound();  //Cannot do like this--> Dog d = (Dog) new Animal();
		a1.col();
		Animal a2 = new Elephant();
		a2.col();
		System.out.println("-----------------------");
		
		Animal[] all = new Animal[5];
		all[0] = new Animal();
		all[1] = new Dog();
		all[2] = new Cat();
		all[3] = new Bulldog();
		all[4] = new Elephant();
		
		for (int i=0; i< all.length; i++){
			all[i].sound();
		}
	}
}
