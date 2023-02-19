package collectionsStart;

import java.util.Comparator;

public class SortByName implements Comparator<StudentNew>{
	@Override
	public int compare(StudentNew x, StudentNew y){
		return  x.name.compareTo(y.name);
	}
}


class SortByAge implements Comparator<StudentNew>{
	@Override
	public int compare(StudentNew x, StudentNew y){
		return  x.age-y.age;
	}
}