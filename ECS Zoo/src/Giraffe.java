
public class Giraffe extends Animal {
	//Calls the Animal Constructor
	public Giraffe(String pName, int pAge , char pGender, int pHealth,Enclosure pEnclosure){
		super (pName, pAge,pGender,pHealth,28,pEnclosure);
	}
	//Reduces Age and adds age every month
	public boolean aMonthPasses() {
		health = health -2;
		age=age+1;
		try{
			Food tempFood = eats();
			health = health+tempFood.gethealth();
			enclosure.addWaste(tempFood.getWaste());
		}catch(Exception e){}
		return false;
	}

	
	//Adds health when it gets a neckMassage
	public void neckMassage(){
		health = health +4;
	}
	//Allows only a PhysioZooKeeper to treat him
	public void Treat(ZooKeeper zookeeper){
		if(zookeeper instanceof PhysioZooKeeper)
			this.neckMassage();
	}

}
