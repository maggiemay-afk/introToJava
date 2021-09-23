package projectTwoPracticeMaggieHerms;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner console = new Scanner(System.in);
		
		final double TAX = 0.14; //tax rate, cannot change

		String firstName; //store customer first name
		String lastName; //store customer last name
		double payRate; // store customer pay rate
		int totalHoursWorked; //store customer hours worked
		double totalIncome; //store total income. totalHoursWorked * payRate
		double netIncome; // store net income. totalIncome * (1-TAX)
		
		
		// begin asking for inputs
		System.out.println("Please Enter Your First Name: ");
		firstName = console.next();
		
		System.out.println("Please Enter Your Last Name: ");
		lastName = console.next();
		
		System.out.println("Enter the per hour pay rate: ");
		payRate = console.nextDouble();
		
		System.out.println("Enter the total hours worked: ");
		totalHoursWorked = console.nextInt();
		
		
		// calculations to get total income and net income from input values
		totalIncome = totalHoursWorked * payRate;
		netIncome = totalIncome * (1 - TAX);
		
		
		//formatting total income and net income to 2 decimal places
		String tIncomeF = String.format("%.2f", totalIncome);
		String nIncomeF = String.format("%.2f", netIncome);
		
		
		//output statements to print finished pay check
		System.out.println(firstName + " " + lastName + " Pay Check!"); 
		System.out.println("Total Income Before Tax: $" + tIncomeF + ".");
		System.out.println("Net Income: $" + nIncomeF + ".");
		System.out.println("Your pay is based on: $" + payRate + " dollars per hour and " 
							+ totalHoursWorked + " total hours worked.");
		
	}

}
