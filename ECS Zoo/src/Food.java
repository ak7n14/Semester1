//Sets all properties of food
public class Food {
	private String name;
	private int wasteProduced;
	private int healthProvided;
	//Takes in and assigns name of food helth given by it and waste produced by it
	public Food(String pName, int healthProvided, int wasteProduced){
		this.name = pName;
		this.healthProvided=healthProvided;
		this.wasteProduced=wasteProduced;
	}
	//Sets the waste of the food
	public void setWaste(int pWaste){
		wasteProduced=pWaste;
	}
	//Returns waste produced by food
	public int getWaste(){
		return wasteProduced;
	}
	
	//Returns name of the food
	public String getName(){
		return name;
	}
	//Returns health provided by the food
	public int gethealth(){
		return healthProvided;
	}
    //sets health given by food
	public void sethealth(int pHealth){
		healthProvided=pHealth;
	}
}
