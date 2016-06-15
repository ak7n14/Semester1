//Answer is used to store the answer the user and check if correct or not
public class Answer {
	private String answer;
	private boolean correct;
	//initialize member variable
	public Answer(String answer, boolean correct) {
		this.answer = answer;
		this.correct = correct;
	}
	//used to retrieve the answer given by the user
	public String getAnswer() {
		return answer;
	}
	//Used to check if answer is correct or now
	public boolean isCorrect() {
		return correct;
	}
}
