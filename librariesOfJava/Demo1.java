package librariesOfJava;
//Overriding 
class Car{
	String brand;
	int cost;
	
	Car(String brand,int cost){
		this.brand=brand;
		this.cost=cost;
	}
	@Override
	public boolean equals(Object obj){ //Object obj==New Car(); 
		Car c = (Car)obj;
		return this.brand.equals(c.brand) && this.cost==c.cost;
	}
//Don't write like this for String--> this.brand==c.brand;
	// Instead write like this -->this.brand.equals(c.brand);
}
public class Demo1 {
	public static void main(String[] args) {
		Car c1 = new Car("Audi", 45000);
		Car c2 = new Car("Audi", 45000);
		
		//We can write any of these formats
		System.out.println(c1.equals(c2));
		System.out.println(new Car("Audi", 45000).equals(c2));
		System.out.println(c1.equals(new Car("Audi", 45000)));
		System.out.println(new Car("Audi", 45000).equals(new Car("Audi", 45000)));
		
		if (c1.equals(c2)){
			System.out.println("Car Brand and cost are same");
		}else{
			System.out.println("Car Brand and cost are Different");
		}
	}
}
