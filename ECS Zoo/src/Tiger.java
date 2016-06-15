//Defines all functions of a tiger
public class Tiger extends BigCat {
	//calls the constructor of the big cat classs
	public Tiger(String pName, int pAge , char pGender, int pHealth,Enclosure pEnclosure){
		super (pName, pAge,pGender,pHealth,24,pEnclosure);
	}
	
	//Adds health when strokes
	public void stroked(){
		health = health +3;
	}
	//Allows zoo keeper to stroke him
	public void Treat(ZooKeeper zookeeper){
		if(zookeeper instanceof ZooKeeper)
			this.stroked();
	}

}
