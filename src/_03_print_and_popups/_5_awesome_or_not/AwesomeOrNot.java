package _03_print_and_popups._5_awesome_or_not;

import java.awt.print.Printable;
import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below

	public static void main(String[] args) {

		Random ran = new Random();    //This will be used below to make a random number. 

		// 2. Make a variable that will hold a random whole number

		int randomwhole;

		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 

		randomwhole = ran.nextInt(4);

		// 3. Print your variable to the console (syso + cntrl space)

		System.out.println(randomwhole);

		// 4. Get the user to enter something that they think is awesome

		JOptionPane.showInputDialog("Type something in that you think is awesome.");

		// 5. If your variable is  0
		if(randomwhole == 0) {	
			// -- tell the user whatever they entered is awesome!
			JOptionPane.showMessageDialog(null, "That's awesome!");


		}
		// 6. If your variable is  1
		if(randomwhole == 1) {
			// -- tell the user whatever they entered is ok.
			JOptionPane.showMessageDialog(null, "That's OK...");

		}
		// 7. If your variable is  2
		if(randomwhole == 2) {
			// -- tell the user whatever they entered is boring.
			JOptionPane.showMessageDialog(null, "That's boring.");


		}
		// 8. If your variable is  3
		if(randomwhole == 3) {
			// -- invent your own message to give to the user (be nice).
			JOptionPane.showMessageDialog(null, "I guess that's pretty cool...");


		}

	}
}
