public class Cow extends Herbivore{
	//Defining abstract method to make noise
	public void makeNoise(){
		System.out.println("Moo!");
	}
	//Constructor calling the constructor of parent(Herbivore) class
	public Cow(String Pname, int Page){
		super(Pname, Page);
	}
}