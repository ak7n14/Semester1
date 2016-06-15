import java.util.ArrayList;

public class Result {
	private ArrayList<Answer> answers = new ArrayList<Answer>();
	
	public void addAnswer(String userAnswer, boolean correct) {
		answers.add(new Answer(userAnswer, correct));
	}
	
	public int getQuestionCount() {
		return answers.size();
	}
	
	public String getUserAnswer(int index) {
		return answers.get(index).getAnswer();
	}
	
	public boolean isUserAnswerCorrect(int index) {
		return answers.get(index).isCorrect();
	}
	
	public int getScore() {
		int score = 0;
/*
* iterates Through entered answers and checks if right
* if so adds to the score
*/
		for(Answer answer : answers)
			if(answer.isCorrect())
				score++;
		
		return score;
	}
/*
 * Returns the percentage Scored by the user	
 */
	public double getPercentCorrect() {
		return ((float) getScore() / getQuestionCount())* 100;
	}
}
