/********************************************************************************************************
* Name: Maggie Herms
* Email: mkherms@uwm.edu
* Created: 11/13/21
* Last Modified: 11/14/21
* Description: This program will calculate and then print a phone bill for a cell phone company
*********************************************************************************************************/
package projectFiveMaggieHerms;
import javax.swing.*; 

public class MainClass {

	public static void main(String[] args) {
		
		String inputAccountNumber = JOptionPane.showInputDialog("Please enter your account number: ");
		String inputCustomerName = JOptionPane.showInputDialog("Please enter your first and last name: ");
		String inputServiceCode = JOptionPane.showInputDialog("Please enter your service code, "
				+ "either 'Premium' or 'Regular': ");
		
		String outputStatement = "This is a bill summary for: " + inputCustomerName + "\n" +
				"Account Number: " + inputAccountNumber + "\n" +
				"Service Code: " + inputServiceCode.toLowerCase() + "\n";
		
		if (inputServiceCode.compareToIgnoreCase("Premium") == 0) {
			String inputDayMinutes = JOptionPane.showInputDialog("Please enter your total number of day minutes: ");
			String inputNightMinutes = JOptionPane.showInputDialog("Please enter your total number of night minutes: ");
			
			double dayMinutes = Double.parseDouble(inputDayMinutes);
			double nightMinutes = Double.parseDouble(inputNightMinutes);
			double dayChargeAmount = dayMinutes - 75;
			double nightChargeAmount = nightMinutes - 100;
			double totalBill = 25.00;
			
			if (dayChargeAmount > 0) {
				totalBill = totalBill + (dayChargeAmount * .10);
			}
			
			if (nightChargeAmount > 0) {
				totalBill = totalBill + (nightChargeAmount * .05);
			}
			
			outputStatement = outputStatement + ("Minutes Service Used (Day): " + String.format("%.2f",dayMinutes) 
			+ "\n" + "Minutes Service Used (Night): " + String.format("%.2f", nightMinutes) + "\n" + 
					"Amount Due: $" + String.format("%.2f", totalBill));	
			
		} else if (inputServiceCode.compareToIgnoreCase("Regular") == 0) {
			
			String inputRegularMinutes = JOptionPane.showInputDialog("Please enter your total number of minutes: ");
			double regularMinutes = Double.parseDouble(inputRegularMinutes);
			double chargeAmount = regularMinutes - 50;
			double totalBill = 10.00; 
			
			if (chargeAmount > 0) {
				totalBill = totalBill + (chargeAmount * .20);
			}
			outputStatement = outputStatement + ("Minutes Service Used: " + String.format("%.2f", regularMinutes) 
			+ "\n" + "Amount Due: $" + String.format("%.2f", totalBill));
		
		} else {
			String errorStatement = "Please enter a valid service code, either 'Premium' or 'Regular'";
			JOptionPane.showMessageDialog(null, errorStatement, "ERROR: Invalid Service Code", JOptionPane.ERROR_MESSAGE);
			System.exit(1);
		}
		
		JOptionPane.showMessageDialog(null, outputStatement, "Cellphone Bill Summary Statement", 
				JOptionPane.INFORMATION_MESSAGE);

	} 

} 
