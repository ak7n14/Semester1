//Adds all Functions Specific to a Gorilla
public class Gorilla extends Ape {
	//Calls the ape constructor
	public Gorilla(String pName, int pAge , char pGender, int pHealth,Enclosure pEnclosure){
		super (pName, pAge,pGender,pHealth,32,pEnclosure);
	}
	//Adds health each time it paints
	public void painting(){
		health = health +4;
	}
	//If PlayZookeeper allows it to paint 
	public void Treat(ZooKeeper zookeeper){
		if(zookeeper instanceof PlayZooKeeper)
			this.painting();
	}
}
