public abstract class Herbivore extends Animal {
	//Constructor calling the constructor of the parent(animal) class
	public Herbivore(String pName, int pAge){
		super(pName,pAge);
	}
	//Passing on abstract function to make sure all herbivores make noise
	public abstract void makeNoise();
	//Checking if food provided is a plant and feeding the animal else throwing an error
	public void eat(Food pFood)throws Exception{	
		if(pFood instanceof Plant)
			System.out.println("Eating "+pFood.getFood());
		else
			throw new Exception("Only eats Plants");
	}
}
