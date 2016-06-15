//Defines all functions specfific to Elephant
public class Elephant extends Animal {
	//Calls the Animal Constructor
	public Elephant(String pName, int pAge , char pGender, int pHealth,Enclosure pEnclosure){
		super (pName, pAge,pGender,pHealth,36,pEnclosure);
	}
	//Adds age and subtracts health every month
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
	//Adds Health every time Given  a bath
	public void bath(){
		health = health +5;
	}
	////Allows a physio zookeeper to give a bath
	public void Treat(ZooKeeper zookeeper){
		if(zookeeper instanceof PhysioZooKeeper)
			this.bath();
	}
}
