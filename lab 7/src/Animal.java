public abstract class Animal {
	protected int age;		
	protected String Name;	
	//Constructor to assign name and age of the animal
	public Animal(String enteredName,int enteredAge){
		age = enteredAge;
		Name = enteredName;
	}
	//Abstract method to make sure each animal makes noise
	public abstract void makeNoise();
	//Method to return the age of the animal
	public int getAge(){
		return age;
	}
	//Method to return the name of the animal
	public String getName(){
		return Name;
	}
	/*Abstract Method to make sure each animal eats and
	 * throw an exception if it dosen't eat the type of food
	 */
	public abstract void eat(Food pFood)throws Exception;

}
