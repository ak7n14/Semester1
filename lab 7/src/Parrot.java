public class Parrot extends Omnivore{
	//Function for parrot to make noise
	public void makeNoise(){
		System.out.println("Hello There Mate!");
	}
	//Constructor calling the constructor of the parent(omnivore)class
	public Parrot(String Pname, int Page){
		super(Pname, Page);
	}	
}