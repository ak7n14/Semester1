import java.util.HashMap;
public class  FoodRecord {
	private static final HashMap<String, Food> foodRecord = new HashMap<String, Food>();
	
	private FoodRecord(){
		//Empty Intentionally 
	}
	//Used to add food to the foodStore
	public static final void addFood(String foodName, int healthProvided , int wasteProduced){
		foodRecord.put(foodName, new Food(foodName,healthProvided, wasteProduced));
	}
	//Return the Food
	public static final Food getFood(String foodName){
		return foodRecord.get(foodName);
	}
	
}
