import java.util.HashMap;
import java.util.Iterator;
public class Foodstore {
	private HashMap<String,Integer> foodstore;
	
	public Foodstore(){
		foodstore = new HashMap<String, Integer>();
	}
	//Add food to the food store
	public void addFood(String food, int count){
		if(foodstore.containsKey(food)){
			foodstore.put(food, foodstore.get(food)+count);
		}
		else
			foodstore.put(food, count);

			
	}
	//Removes the food from food store to feed the animal
	public Food takeFood(String food)throws Exception{
		if (foodstore.containsKey(food))
			foodstore.put(food,foodstore.get(food)-1);
		else
			throw new Exception("Food not found");
		return FoodRecord.getFood(food);
	}
	public Iterator<String> getFoodIterator(){
		return foodstore.keySet().iterator();
	}
	//Transfers Food from one foodStore to another
	public void transferFood(String pName, Foodstore food){
		try {
			food.takeFood(pName);
			this.addFood(pName, 1);
		} catch (Exception e) {
	//		e.printStackTrace();
		}
	}
}