
public class Lion extends BigCat {
	//Calls the Big cat Constructor
	public Lion(String pName, int pAge , char pGender, int pHealth,Enclosure pEnclosure){
		super (pName, pAge,pGender,pHealth,24,pEnclosure);
	}
	//Adds Health Each time it is stroked
	public void stroked(){
		health = health +2;
	}
	//If a ZooKeeper calls treat allows the zookeeper to stroke
	public void Treat(ZooKeeper zookeeper){
		if(zookeeper instanceof ZooKeeper)
			this.stroked();
	}

}
