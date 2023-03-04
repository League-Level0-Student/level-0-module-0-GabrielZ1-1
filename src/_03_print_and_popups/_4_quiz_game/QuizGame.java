package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {

		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER

		// 2.  Ask the user a question 
		String q1 = JOptionPane.showInputDialog("How many legs does a spider have? (answer in a number, ex: 0, 1, 2...)");
		// 3.  Use an if statement to check if their answer is correct
		if(q1.equals("8")){
			// 4.  if the user's answer was correct, add one to their score 
			score += 1;

		}
		else {
			score -= 1;	


		}


		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
		// Option: Subtract a point from their score for a wrong answer
		String q2 = JOptionPane.showInputDialog("What is 20 squared? (answer in a number, ex: 0, 1, 2)");

		if(q2.equals("400")) {

			score += 1;

		}
		else {
			score -= 1;	


		}


		String q3 = JOptionPane.showInputDialog("What is 1+2");
		if(q3.equals("3")){

			score += 1;

		}
		else {

			score -= 1;


		}


		// After all the questions have been asked, tell the user their final score 
JOptionPane.showMessageDialog(null, "Your final score is " + score + "!");
	
if(score == 3) {
	JOptionPane.showMessageDialog(null, "You got the maximum score!");
		
		
}
	}
}
