public class Main{
  public static void main(String[] args){
    Wolf wolf1= new Wolf("Dash",5);      //Creating new instance of wolf
    Parrot parrot1 = new Parrot("Joey",2);//Creating new instance of parrot
    Cow cow1= new Cow("MOO MOO",3);
    //CHECKING OUTPUT FOR INHERITED FEATURES Of Wolf
    System.out.println("=========Wolf==========");
    System.out.println("\n \t "+ "AGE: " +wolf1.getAge());
    System.out.println("\n \t"+" Name: "+wolf1.getName());
    //CHECKING OUTPUT FOR INHERITED FEATURES of Parrot
    System.out.println("=========Parrot==========");
    System.out.println("\n \t"+ "AGE: " +parrot1.getAge());
    System.out.println("\n \t"+ "Name: " +parrot1.getName());
    //Creating new instances of meat and plant
    Meat meat1= new Meat("Chicken");
    Plant plant1= new Plant("Lettuce");

   //Trying to feed parrot meat and throwing an error if not
    try {
		cow1.eat(meat1);
	} catch (Exception e) {
		System.err.println("Cow can only eat plants");
		e.printStackTrace();
	}
  //Trying to feed Wolf plants and throwing an error if not
    try {
		wolf1.eat(plant1);
	} catch (Exception e) {
		System.err.println("Wolf Can only eat Meat");
		e.printStackTrace();
	}

  try {
  wolf1.eat(meat1,10);
} catch (Exception e) {
  System.err.println("Wolf Can only eat Meat");
  e.printStackTrace();
}
  }
}
