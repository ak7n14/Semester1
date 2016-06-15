//
public abstract class Animal {
	protected int age;
	private char gender;
	protected String[] eats;
	protected String Name;
	protected int health;
	private int lifeExpectancy;
	protected Enclosure enclosure;
	//Constructor to assign values
	public Animal(String pName, int pAge, char pGender, int pHealth, int pLifeExpectancy, Enclosure pEnclosure){
		Name = pName;
		age = pAge;
		gender = pGender;
		health = pHealth;
		lifeExpectancy = pLifeExpectancy;
		enclosure = pEnclosure;
	}
	//returns age
	public int getAge(){
		return age;
	}
	//returns gender
	public int getGender(){
		return gender;
	}
	//returns Name
	public String getName(){
		return Name;
	}
	
	//returns life expectancy
	public int getLifeExpectancy(){
		return lifeExpectancy;
	}
	//returns health
	public int getHealth(){
		return health;
	}
	//decrease health
	public void decreaseHealth(int decrease){
		health = health - decrease;
	}
	//Treat
	public abstract void Treat(ZooKeeper zookeeper);

	//Adds Animal to enclosure
	public void setEnclosure(Enclosure pEnclosure) throws Exception{
		enclosure= pEnclosure;
		
	}
	
	public abstract boolean aMonthPasses();
	//Checks if animal can eat that food
	public boolean canEat(String name) {
		for(String food : eats)
			if(food == name)
				return true;
		return false;
		
	}
	//Makes animal eat food
	public Food eats()throws Exception{
		for(String foodName:eats)
			try{
				return enclosure.getFoodstore().takeFood(foodName);
			 } catch (Exception e){
				 System.err.printf("%s is not avalible in this foodstore \n", foodName);
			 }
		throw new Exception("None of the food that the animal like is avalibe");
	}
	
}

