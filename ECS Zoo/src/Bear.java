//Adds functions specific to a bear
public class Bear extends Animal {
		//Calls the animal constructor
		public Bear(String pName, int pAge , char pGender, int pHealth,Enclosure pEnclosure){
			super (pName, pAge,pGender,pHealth,18, pEnclosure);
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

		
		//Adds health each time animal recieves a hug
		public void hug(){
			health = health +3;
		}
		//Allows ZooKeeper to hug him
		public void Treat(ZooKeeper zookeeper){
			if(zookeeper instanceof ZooKeeper)
				this.hug();
		}
}

