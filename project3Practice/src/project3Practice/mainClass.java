package project3Practice;

import javax.swing.*;

public class mainClass {

	public static void main(String[] args) {
		String myName = JOptionPane.showInputDialog("Enter Your Full Name: ");
		String myAge = JOptionPane.showInputDialog("Enter Your Age: ");
		
		//myAge = myAge*10;
		
		String radiusString = JOptionPane.showInputDialog("Enter the Radius: ");
		
		double radius = Double.parseDouble(radiusString);

		double area = Math.PI * radius * radius;
		double circumference = 2 * Math.PI * radius;
		
		String fCircumference = String.format("%.5f" , circumference);
		String fArea = String.format("%.2f",area);

		String outputStr = "My full name is: " + myName + " and my age is: " + myAge + "\n" +
				"Radius of circle: " + radius + " Area: " + fArea + " square units\n" + 
				"Circumference: " + fCircumference + " units.";
		
		JOptionPane.showMessageDialog(null, outputStr, "My info. and Circle", JOptionPane.ERROR_MESSAGE);
		
		System.out.println(outputStr);
	}

}
