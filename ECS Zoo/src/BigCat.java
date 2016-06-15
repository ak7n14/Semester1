//Sets all functions of a big Cats
public abstract class BigCat extends Animal {
	public BigCat(String pName, int pAge, char pGender, int pHealth, int pLifeExpectancy,Enclosure pEnclosure){
		super(pName, pAge, pGender,pHealth,pLifeExpectancy,pEnclosure);
	}
	//Adds age and reduces health each month
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



}
