//Flashcard is used to store data about questions and answers in the quiz
public class FlashCard {
	private String question;
	private String answer;
	//initialize member vvariables
	public FlashCard(String question, String answer) {
		this.question = question;
		this.answer = answer;
	}
	//used to retrieve the question on the flashcard
	public String getQuestion() {
		return question;
	}
	//used to retrieve answer on flash card
	public String getAnswer() {
		return answer;
	}
}
