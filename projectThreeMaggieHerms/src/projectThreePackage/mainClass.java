/*************************************************************************************************
 * Name: Maggie Herms
 * Email: mkherms@uwm.edu
 * Created: 10/14/21
 * Modified: 10/16/21
 * Description: This program calculates a persons age on several different planets
 *************************************************************************************************/
package projectThreePackage;
import javax.swing.*; 

public class mainClass {

	public static void main(String[] args) {
		String userName = JOptionPane.showInputDialog("Enter Your First Name: "); 
		String userAgeString = JOptionPane.showInputDialog("Enter Your Age: "); 
		
		double userAge = Double.parseDouble(userAgeString); 
		
		final int earthYear = 365; //number of days it takes earth to rotate around sun once
		final int mercuryYear = 88; //number of days it takes mercury to rotate around sun once
		final int venusYear = 225; //number of days it takes venus to rotate around sun once
		final int jupiterYear = 4380; //number of days it takes jupiter to rotate around sun once
		final int saturnYear = 10767; //number of days it takes saturn to rotate around sun once
		
		double mercuryAge = (userAge * earthYear) / mercuryYear; 
		double venusAge = (userAge * earthYear) / venusYear; 
		double jupiterAge = (userAge * earthYear) / jupiterYear; 
		double saturnAge = (userAge * earthYear) / saturnYear; 
		
		String mercuryAgeF = String.format("%.2f", mercuryAge); 
		String venusAgeF = String.format("%.2f", venusAge); 
		String jupiterAgeF = String.format("%.2f", jupiterAge); 
		String saturnAgeF = String.format("%.2f", saturnAge); 
		
		String outputStatement = "On Earth, " + userName + " is " + userAge + " years old.\n" +
				"However, on Mercury, " + userName + " would be very old at " + mercuryAgeF + " years old.\n" +
				"On Venus, " + userName + " would be " + venusAgeF + " years old.\n" +
				"If living on Jupiter, " + userName + " would be a child at " + jupiterAgeF + " years old.\n" +
				"Finally, on Saturn, " + userName + " would be just starting life at " + 
				saturnAgeF + " years old"; //create our output statement string
		
		JOptionPane.showMessageDialog(null, outputStatement, "Extraterrestrial Age Information", 
				JOptionPane.INFORMATION_MESSAGE); //output our statement as plain message in dialog box
		
	} //end of main method

} //end of main class
