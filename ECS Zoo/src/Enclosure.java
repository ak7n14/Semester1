//Adds all the functions of the Enclosure
import java.util.ArrayList;
import java.util.Iterator;
public class Enclosure {
	Foodstore enclosureFoodStore = new Foodstore();
	private int animalWaste;
	public Enclosure(){
		animalWaste = 0;
	}
	private ArrayList<Animal> animals = new ArrayList<Animal>();
	//Adds Animal to the enclosure till the enclosure isnt full
	public void addAnimal(Animal pAnimal){
		if(animals.size()<20){
			animals.add(pAnimal);
			try {
				pAnimal.setEnclosure(this);
			} catch (Exception e) {

				e.printStackTrace();
			}
		}
		else
			System.err.println("Only 20 animals allowed in an enclosure");
	}
	//Removes the Animal From the Enclosure
	public void removeAnimal(Animal pAnimal){
		if(animals.contains(pAnimal))
			animals.remove(pAnimal);			
	}
	//Adds Waste everytime animal eats
	public void addWaste(int pWaste){
		animalWaste= animalWaste + pWaste;
	}
	//Removes waste from enclosure
	public void removeWaste(int pWaste){
		animalWaste = animalWaste - pWaste;
	}
	//gets the size of the waste
	public int getWasteSize(){
		return animalWaste;
	}
	//Points to the FoodStore of the enclosure
	public Foodstore getFoodstore(){
		return enclosureFoodStore; 
	}
	//Iterator to iterate through animals
	public Iterator<Animal> getAnimalIterator() {
		return animals.iterator();
	}
	//Returns size of the enclosure
	public int size(){
		return animals.size();
	}
	//Passes a month for each animal in the enclosure
	public void aMonthPasses(){
		Iterator<Animal> it = animals.iterator();
		while(it.hasNext()){
			it.next().aMonthPasses();
		}
	}
	//Removes all animals whose health is 0
	public void removeDeadAnimal(){
		Animal tempAnimal;
		Iterator<Animal> it = animals.iterator();
		while(it.hasNext()){
			tempAnimal =it.next();
			if(tempAnimal.getHealth()==0||tempAnimal.getAge()>=tempAnimal.getLifeExpectancy()){
				it.remove();
			}
		}
	}
	//Transfers food from zoo food store to enclosure food store
	public void transferFood(Foodstore foodstore){
		Iterator<String> foodIterator;
		String tempFood;
		int count=0;
		for(Animal animal : animals){
			foodIterator= foodstore.getFoodIterator();
			while(foodIterator.hasNext()){
				tempFood=foodIterator.next();
				if(animal.canEat(tempFood)){
					getFoodstore().transferFood(tempFood, foodstore);
					count = count + 1;
					break;
				}
				if(count>=20)
					return;
			}
		}
	}

}
