public class Parrot extends Omnivore{
	//Function for parrot to make noise
	public void makeNoise(){
		System.out.println("Hello There Mate!");
	}
	//Constructor calling the constructor of the parent(omnivore)class
	public Parrot(String pName, int pAge){
		super(pName, pAge);
	}
	//Constructor only taking age as a parameter and giving default name Polly
	public Parrot(int pAge){
		super("Polly",pAge);
	}
}
