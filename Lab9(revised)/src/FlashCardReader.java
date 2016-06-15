//Flashcard reader is used to read questions and answers from the file "Questions.txt" into an array list of flash cards
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FlashCardReader {
	private BufferedReader reader;
	private ArrayList<FlashCard> flashCards;
	
	public FlashCardReader() {
		flashCards = new ArrayList<FlashCard>();
		try {
			reader = new BufferedReader(new FileReader("Questions.txt"));
			String lineText;	
			while ((lineText = getLine())!=null) {
				String[] splitLine = lineText.split(":");
				flashCards.add(new FlashCard(splitLine[0], splitLine[1]));
			}
		} catch (FileNotFoundException e) {
			System.err.println("The file cannot be read into the buffer as it cannot be found.");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("Populating the ArrayList failed.");
			e.printStackTrace();
		}	
	}
	
	public String getLine() throws IOException {
		return reader.readLine();
	}
	
	public boolean fileReady() throws IOException{
		// True if buffer is not empty
		return reader.ready();
	}
	
	public ArrayList<FlashCard> getFlashCards() throws IOException {
		return flashCards; 
	}
}
