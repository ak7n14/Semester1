//Adds Features of a zoo and runs the programme
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Zoo {
	//Initiates new array list of Enclosures and Zoo Keepers
	protected ArrayList<Enclosure>enclosures = new ArrayList<Enclosure>();
	protected ArrayList<ZooKeeper>zooKeepers = new ArrayList<ZooKeeper>();
	private Scanner reader;
	protected Foodstore zooFoodStore = new Foodstore();
	public Zoo(String fileName){
	//Takes in a file and does tasks according to the commands provided in the file
	ZooConfigReader configReader = new ZooConfigReader(fileName);
	ArrayList<ArrayList<String>>fileLines = configReader.getConfigInfo();
	for(ArrayList<String> list: fileLines) {
		switch(list.get(0)){
		case "zoo" :
					 break;
		case "enclosure":enclosures.add(new Enclosure());
						 enclosures.get(enclosures.size()-1).addWaste(Integer.valueOf(list.get(1)));
						 break;
		case "zookeeper" : zooKeepers.add(new ZooKeeper(enclosures.get(enclosures.size()-1)));
						 break;
		case "playZooKeeper" : zooKeepers.add(new PlayZooKeeper(enclosures.get(enclosures.size()-1)));
		 				 break;
		case "physioZooKeeper" : zooKeepers.add(new PhysioZooKeeper(enclosures.get(enclosures.size()-1)));
						 break;
		case "lion": enclosures.get(enclosures.size()-1).addAnimal(new Lion(list.get(1),(int) Integer.valueOf(list.get(2)),list.get(3).charAt(0), (int) Integer.valueOf(list.get(4)),enclosures.get(enclosures.size()-1)));
						 break;
		case "tiger": enclosures.get(enclosures.size()-1).addAnimal(new Tiger(list.get(1),(int) Integer.valueOf(list.get(2)),list.get(3).charAt(0), (int) Integer.valueOf(list.get(4)),enclosures.get(enclosures.size()-1)));
		 			     break;
		case "elephant": enclosures.get(enclosures.size()-1).addAnimal(new Elephant(list.get(1),(int) Integer.valueOf(list.get(2)),list.get(3).charAt(0), (int) Integer.valueOf(list.get(4)),enclosures.get(enclosures.size()-1)));
		 				 break;  
		case "giraffe": enclosures.get(enclosures.size()-1).addAnimal(new Giraffe(list.get(1),(int) Integer.valueOf(list.get(2)),list.get(3).charAt(0), (int) Integer.valueOf(list.get(4)),enclosures.get(enclosures.size()-1)));
		 				 break;
		case "penguin": enclosures.get(enclosures.size()-1).addAnimal(new Penguin(list.get(1),(int) Integer.valueOf(list.get(2)),list.get(3).charAt(0), (int) Integer.valueOf(list.get(4)),enclosures.get(enclosures.size()-1)));
		 				 break;
		case "chimpanzee": enclosures.get(enclosures.size()-1).addAnimal(new Chimpanzee(list.get(1),(int) Integer.valueOf(list.get(2)),list.get(3).charAt(0), (int) Integer.valueOf(list.get(4)),enclosures.get(enclosures.size()-1)));
		 				 break;
		case "bear": enclosures.get(enclosures.size()-1).addAnimal(new Bear(list.get(1),(int) Integer.valueOf(list.get(2)),list.get(3).charAt(0), (int) Integer.valueOf(list.get(4)),enclosures.get(enclosures.size()-1)));
		 				 break;
		case "gurilla": enclosures.get(enclosures.size()-1).addAnimal(new Gorilla(list.get(1),(int) Integer.valueOf(list.get(2)),list.get(3).charAt(0), (int) Integer.valueOf(list.get(4)),enclosures.get(enclosures.size()-1)));
		 				 break;
		case "hay": enclosures.get(enclosures.size()-1).getFoodstore().addFood("hay",Integer.valueOf(list.get(1)));
				    	 break;
		case "celery": enclosures.get(enclosures.size()-1).getFoodstore().addFood("celery",Integer.valueOf(list.get(1)));
					  	 break;
		case "steak": enclosures.get(enclosures.size()-1).getFoodstore().addFood("steak",Integer.valueOf(list.get(1)));
						 break;
		case "fruit": enclosures.get(enclosures.size()-1).getFoodstore().addFood("fruit",Integer.valueOf(list.get(1)));
						 break;
		case "ice cream": enclosures.get(enclosures.size()-1).getFoodstore().addFood("ice cream",Integer.valueOf(list.get(1)));
						 break;
		case "fish": enclosures.get(enclosures.size()-1).getFoodstore().addFood("fish",Integer.valueOf(list.get(1)));
						 break;
		 			   
		}
	}
	//Adds food to the Zoo foodStore
	zooFoodStore.addFood("hay", 5);
	zooFoodStore.addFood("celery", 5);
	zooFoodStore.addFood("steak", 5);
	zooFoodStore.addFood("fruit", 5);
	zooFoodStore.addFood("ice cream", 5);
	zooFoodStore.addFood("fish", 5);
	//record of food that can be added to the food store
	FoodRecord.addFood("hay", 1 ,4);
	FoodRecord.addFood("celery", 0, 1);
	FoodRecord.addFood("steak", 3, 4);
	FoodRecord.addFood("fruit", 2, 3);
	FoodRecord.addFood("ice cream", 1, 3);
	FoodRecord.addFood("fish", 3, 2);
}
	
	/*Makes a month pass for each animal and zoo keeper
	 * and makes them do tasks accordingly
	 */
	public void aMonthPasses(){
		Animal currentAnimal;
		for(Enclosure enclosure:enclosures){
			enclosure.aMonthPasses();
			enclosure.removeDeadAnimal();
		}
		for(Enclosure enclosure:enclosures){
			enclosure.removeDeadAnimal();
		}
		for(ZooKeeper zookeeper:zooKeepers){
			zookeeper.aMonthPasses(zooFoodStore);
		}
		Iterator<Animal> animalIterator;
		System.out.println("Zoo state:");
		for(int i= 0; i < enclosures.size(); i++) {
			System.out.printf("Enclosures: %d%n", i);
			animalIterator = enclosures.get(i).getAnimalIterator();
			while(animalIterator.hasNext()) {
				currentAnimal = animalIterator.next();
				System.out.printf("Name: %s, Age: %d, Health %d%n", currentAnimal.getName(), currentAnimal.getAge(),currentAnimal.getHealth());
			}
		}
		}

	
	//Loops through passing months and waits for user input after every month
	public void go(){
		while(true){
			this.aMonthPasses();
			try
			{ Thread.sleep(500);
			}catch (InterruptedException e) {
				
			}
			System.out.println("do you want to stop?(y/n)");
			reader = new Scanner(System.in);
			char response = reader.next().charAt(0);
			if (response=='y'){
				break;
			}
		
		}
	}
	//Main methode to make the programme run
	public static void main(String[]  args){
		
		Zoo z1= new Zoo(args[0]);
		z1.go();
	}
}
