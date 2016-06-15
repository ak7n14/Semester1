import java.util.*;
public class Demo {
	public static void main(String[] args){
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Cow("MOO MOO",1));
		animals.add(new Wolf("JOJO",2));
		animals.add(new Cow("Mike",5));
		animals.add(new Parrot("Jay",3));
		animals.add(new Wolf("David",4));
		animals.add(new Cow("Miranda",10));
		//Iterates through the array list and prints name and age
		for(Animal animal : animals)
			System.out.println(animal.getName()+ " " + animal.getAge());
		System.out.println();
		//sorts the array list
		Collections.sort(animals);
		//Iterates through the array list and prints name and age
		for(Animal animal : animals)
			System.out.println(animal.getName()+ " " + animal.getAge());
	}
}
