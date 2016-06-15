public abstract class Carnivore extends Animal {
	//constructor calling the constructor of the parent class(animal)
	public Carnivore(String pName, int pAge){
		super(pName,pAge);
	}
	//Abstract function passed on to make sure each Carnivore makes noise
	public abstract void makeNoise();
	//Checking if food provided is meat and feeding the animal else throwing an error
	public void eat(Food pFood)throws Exception{
		if(pFood instanceof Meat)
			System.out.println("Eating "+pFood.getFood());
		else
			throw new Exception("Only eats meat");
	}
}
