import java.util.Iterator;

public class ZooKeeper {
	private Enclosure enclosure;
	//Constructor to assign Enclosure to Zoo Keeper
	public ZooKeeper(Enclosure pEnclosure){
		enclosure = pEnclosure;
	}
	//To make the ZooKeeper do its duties each month
	public void aMonthPasses(Foodstore zooFoodStore){
		enclosure.transferFood(zooFoodStore);
		//Removes Waste if waste 
		if (enclosure.getWasteSize()>20)
			enclosure.removeWaste(20);
		else
			enclosure.removeWaste(enclosure.getWasteSize());
		Iterator<Animal> animalIterator;
		animalIterator = enclosure.getAnimalIterator();
		//iterates through animals and feeds them
		while(animalIterator.hasNext()){
			
				try {
					animalIterator.next().Treat(this);
				} catch (Exception e) {
					e.printStackTrace();
				}
			
		}
	}
}
