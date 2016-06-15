
public class Main {

	public static void main(String[] args) {
		TestCalculator testCal = new TestCalculator();//Initializing a new instance of Calculator
		//Checking Conditions and printing if caluclator is working properly or not!
		if (testCal.testParser() && testCal.testAdd() && testCal.testMultiplication())
			System.out.println("\nCongratulations, your Calculator appears to be working.");
		else
			System.out.println("\nUnfortunately, your Calculator  does not appear to be working.");
	}

}
