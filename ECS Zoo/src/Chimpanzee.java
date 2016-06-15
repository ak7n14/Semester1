//Adds all function specific to an ape
public class Chimpanzee extends Ape {
	public Chimpanzee(String pName, int pAge , char pGender, int pHealth, Enclosure pEnclosure){
		super (pName, pAge,pGender,pHealth,24,pEnclosure);
	}
//Adds health each time they play chase
	public void playChase(){
		health = health +4;
	}
//Allows play zooKeeper to lay chase with it
	public void Treat(ZooKeeper zookeeper){
		if(zookeeper instanceof PlayZooKeeper)
			this.playChase();
	}
}