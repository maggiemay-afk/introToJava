/*********************************************************************************************************
* Name: Maggie Herms
* Email: mkherms@uwm.edu
* Created: 11/28/21
* Last Modified: 11/28/21
* Description: This program is a game in which a user has to guess a random generated integer between 0 and 100
**********************************************************************************************************/
package projectSixMaggieHerms;
import javax.swing.*;

public class Guess {

	public static void main(String[] args) {
		int num; 
		int guess; 
		String strGuess;
		boolean done; 
		
		num = (int) (Math.random() * 100); //created random generated integer
		done = false;
		int gameCount = 1; //counts number of turns, starting at 1
		
		while (gameCount <= 5) { //while game count is less than or equal to 5 turns
			//ask for user to input their number guess using dialog box
			strGuess = JOptionPane.showInputDialog("Enter an integer: \n" + "Must be between 0 and 100");
			//change guess string to guess integer
			guess = Integer.parseInt(strGuess); System.out.println();
			int diff = Math.abs(num - guess); //difference between random generated number and guessed number - absolute value
			
			if (diff == 0) {
				JOptionPane.showMessageDialog(null, "You guessed the correct number!");
				done = true; 
				break; //exits the while loop
			} else if (diff >= 50) {
				if (guess > num) {
					JOptionPane.showMessageDialog(null, "Your guess is very high. \n" + "Guess again!");
				} else {
					JOptionPane.showMessageDialog(null, "Your guess is very low. \n" + "Guess again!");
				}
			} else if (diff >= 30 && diff < 50) {
				if (guess > num) {
					JOptionPane.showMessageDialog(null, "Your guess is high. \n" + "Guess again!");
				} else {
					JOptionPane.showMessageDialog(null, "Your guess is low. \n" + "Guess again!");
				}
			} else if (diff >= 15 && diff < 30) {
				if (guess > num) {
					JOptionPane.showMessageDialog(null, "Your guess is moderately high. \n" + "Guess again!");
				} else {
				 	JOptionPane.showMessageDialog(null, "Your guess is moderately low. \n" + "Guess again!");
				} 	
			} else if (diff > 0 && diff < 15) {
				if (guess > num) {
					JOptionPane.showMessageDialog(null, "Your guess is somewhat high. \n" + "Guess again!");
				} else {
					JOptionPane.showMessageDialog(null, "Your guess is somewhat low. \n" + "Guess again!");
				}
			}
			gameCount ++; //increment game count by one
		} // end while
		
	if (done == true) { 
		JOptionPane.showMessageDialog(null, "Congratulations, You Won!");
	} else {
		JOptionPane.showMessageDialog(null, "Out of guesses, You've lost.");
	}
	
	} // end main method
} //end class
