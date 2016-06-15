public abstract class Omnivore extends Animal{
	//constructor calling the constructor of the parent class(animal)
	public Omnivore(String pName, int pAge){
		super(pName,pAge);
	}
	//Abstract function passed on to make sure each omnivore makes noise
	public abstract void makeNoise();
	//Checking if food provided is meat or plant and feeding the animal else throwing an error
	public void eat (Food pFood)throws Exception{
		System.out.println(pFood.getFood());
		if((pFood instanceof Meat)||(pFood instanceof Plant))
			System.out.println("Eating "+pFood.getFood());
		else
			throw new Exception("Only eats mea or Plantst");

	}
}
