public class Wolf extends Carnivore {
	//Function for parrot to make noise
	public void makeNoise(){
		System.out.println("Woof!Happy now?");
	}
	//Constructor calling the constructor of the parent(carnivore)class
	public Wolf(String pName,int pAge){
		super(pName, pAge);
	}
	//Constructor taking in no values and providing default values
	public Wolf(){
		super();
	}
}
