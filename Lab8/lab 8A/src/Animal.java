public abstract class Animal implements Comparable<Animal>{
	protected int age;
	protected String Name;
	
	public int compareTo(Animal animal){
		//To sort from highest to lowest age I would return (getAge()-animal.getAge())*-1
		return getAge()-animal.getAge();
	}
	//Constructor to assign name and age of the animal
	public Animal(String enteredName,int enteredAge){
		age = enteredAge;
		Name = enteredName;
	}
	//constructor taking no input from usr and assigning default values
	public Animal(){
		age = 0;
		Name = "newborn";
	}
	//Abstract method to make sure each animal makes noise
	public abstract void makeNoise();
	//Method to return the age of the animal
	public int getAge(){
		return age;
	}
	//To feed animal a Defined number of times
	 public void eat(Food pFood , int number)throws Exception{
		 for (int i=0;i<=number;i++){
			 eat(pFood);
		 }
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
