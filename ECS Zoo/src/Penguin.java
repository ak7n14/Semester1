
public class Penguin extends Animal {
	//Calls the Animal Class Constructor
	public Penguin(String pName, int pAge , char pGender, int pHealth,Enclosure pEnclosure){
		super (pName, pAge,pGender,pHealth,15,pEnclosure);
	}
	//Reduces health and adds age every month
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
	public void watchAFilm(){
		health = health +2;
	}
	//If with a Play Zoo Keeper Watches movies with it
	public void Treat(ZooKeeper zookeeper){
		if(zookeeper instanceof PlayZooKeeper)
			this.watchAFilm();
	}
}