public class GuessingGame{
	public static void main(String[] args){
		Integer numberToGuess;
		
		Integer guessedNumber;
		
		Toolbox myToolbox = new Toolbox(); //Initiates a new Toolbox
		
		System.out.println("Welcome To the Guessing game!");
		
		numberToGuess = myToolbox.getRandomInteger(10);//Generates a random no form 1-10

		
		guessedNumber = myToolbox.readIntegerFromCmd(); //Gets input from the user
		
		if (numberToGuess.equals(guessedNumber)){
			System.out.println("Your guess is correct");}

		else if(guessedNumber<numberToGuess){
			System.out.println("The Number is smaller than the guess number");}

		else{
			System.out.println("The Number is greater than the guess number");}
					}
						}