import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Quiz {
	private FlashCardReader cardReader;
	private ArrayList<FlashCard> flashCards;
	private BufferedReader inputBuffer;
	
	public Quiz() throws IOException {
		cardReader = new FlashCardReader();
		// No need to recreate the instance as to duplicate the data
		flashCards = cardReader.getFlashCards();		
		inputBuffer = new BufferedReader(new InputStreamReader(System.in));
		
		play();
	}
	
	public static void main(String[] args) throws IOException {
		Quiz quiz = new Quiz();
	}
	
	public void play() {
		Result result = new Result();
		String userInput;
		System.out.println("Welcome to the quiz!");
		// Clear previous answers
		for(int i=0; i<flashCards.size(); i++) {
			System.out.printf("Question %d: %s\n", i+1, flashCards.get(i).getQuestion());
			userInput = readUserInput();
			result.addAnswer(userInput, userInput.equals(flashCards.get(i).getAnswer()));
			if(result.isUserAnswerCorrect(i))
				System.out.println("Correct!");
			else
				System.out.printf("Incorrect. The answer is: %s\n", flashCards.get(i).getAnswer());
		}
		
		System.out.println("Would you like to save your results to a file? [Y/N]");
		userInput = readUserInput();
		if(userInput.equalsIgnoreCase("y")) {
			System.out.println("Please enter the name of the file to be saved to: [fileName.txt]");
			userInput = readUserInput();
			save(userInput, result);
			System.out.printf("Results saved to %s.txt", userInput);
		}
	}
	
	public void save(String fileName, Result result) {
		try {
			PrintStream saveStream = new PrintStream(fileName + ".txt");
			for(int i=0; i<flashCards.size(); i++)
				saveStream.printf("%s,%s,%s%n",flashCards.get(i).getQuestion(), result.getUserAnswer(i), result.isUserAnswerCorrect(i));
			saveStream.printf("User's score: %d, No. of questions: %d, Percentage correct: %.2f%%", result.getScore(), result.getQuestionCount(), result.getPercentCorrect());
			saveStream.close();
		} catch (FileNotFoundException e) {
			System.err.println("The file cannot be created/accessed.");
			e.printStackTrace();
		}
	}
	
	public String readUserInput() {
		String userInput = null;
		while(userInput == null)
			try {
				userInput = inputBuffer.readLine();
			} catch (IOException ioe) {
				System.err.println("There was an input error - please try again!");
			}
		return userInput;
	}
}
