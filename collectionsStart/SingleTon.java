package collectionsStart;

class PrimeMinister{
	String name;
	int age;
	private static PrimeMinister pm;
	
	private PrimeMinister(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public static PrimeMinister getInstance(String name, int age){
	    if(pm==null){
	    	pm = new PrimeMinister(name, age);
	    }else{
	    	System.out.println("Can't create");
	    }
		return pm;
	}
	
	public String toString(){
		return "Age of "+pm.name+" is "+pm.age;
	}
}
public class SingleTon {
	public static void main(String[] args) {
		//Internally PrimeMinister pm = new PrimeMinister()
		PrimeMinister pm = PrimeMinister.getInstance("Modi", 70);
//		System.out.println("Name: "+pm.name+"-> Age: "+pm.age);
		System.out.println(pm);
	}
}
