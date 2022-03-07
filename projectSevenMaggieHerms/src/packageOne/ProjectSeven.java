/************************************************************************************************************* 
 * name: Maggie Herms
 * email: mkherms@uwm.edu
 * date created: 12/17/2021
 * last modified: 12/18/2021
 * description: This program calculates total billing amount for tax assistance for A&A Accounting customers 
 *************************************************************************************************************/

package packageOne;
import java.util.*;

public class ProjectSeven {
	static Scanner console = new Scanner(System.in);
	// final variables
	static final double lowIncomeFreeMinutes = 30;
	static final double highIncomeFreeMinutes = 20;
	static final double lowIncomePercentRate = 0.40;
	static final double highIncomePercentRate = 0.70;
	static final double lowIncomeCutoff = 25000;
	
	public static void main(String[] args) {
		// declare remaining variables
		double userIncome = 0.0;
		double userHourlyRate = 0.0;
		double userConsultingTime = 0.0;
		double userBillingInfo = 0.0;
	
		ProjectSeven.greeting(); //call greeting method
		String userAnswer = ProjectSeven.shouldContinue(); //call should continue method. save result as userAnswer
		
		//begin while loop. While user inputs "continue", call methods to ask for additional information 
		while (userAnswer.toLowerCase().equals("continue")) {
			
			userIncome = ProjectSeven.yearlyIncome(); //call yearly income method. save result as userIncome
			userHourlyRate = ProjectSeven.hourlyRate(); //call hourly rate method. save result as userHourlyRate
			userConsultingTime = ProjectSeven.consultingTime(); //call consulting time method. save result as userConsultingTime
			userBillingInfo = ProjectSeven.billingInfo(userIncome, userHourlyRate, userConsultingTime); //call billing info method. save result as userBillingInfo
			
			ProjectSeven.output(userIncome, userHourlyRate, userConsultingTime, userBillingInfo); //call output method with billing info
			userAnswer = ProjectSeven.shouldContinue(); //call should continue method again 
		} // end while loop
		
		ProjectSeven.goodbye(); //call goodbye method
				
	} // end main method
	
	//begin definitions of all other methods
	
	public static void greeting() { //method prints greeting statement
		System.out.println("Welcome to A&A Accounting" + "\n" + 
				"Glad to help you determine your cost for filing 2021 taxes with us");			
	}	// end greeting method
	
	public static void goodbye() { //method prints goodbye / thank you statement
		System.out.println("Thanks for visiting A&A Accounting. Please allow us to file your 2021 taxes.");			
	} // end of goodbye method
	
	public static String shouldContinue() { //method checks if the user wants to continue to billing. Loops until user enters either continue or stop
		String shouldContinue = "";
		
		System.out.println("Do you want to Continue or Stop: ");
		shouldContinue = console.next();
			
		while (!shouldContinue.toLowerCase().equals("continue") && !shouldContinue.toLowerCase().equals("stop")) {
			System.out.println("Do you want to Continue or Stop: ");
			shouldContinue = console.next();
		}
		return shouldContinue;
	} // end should continue
	
	public static double yearlyIncome() { //method asks user for their yearly income
		double yearlyIncome = 0.0;
		System.out.println("Please enter your yearly income: ");
		yearlyIncome = console.nextDouble();
		return yearlyIncome;
	} // end yearly income method
	
	public static double hourlyRate() { //method asks user for the hourly rate of consulting
		double hourlyRate = 0.0;
		System.out.println("Please enter the hourly rate: ");
		hourlyRate = console.nextDouble();
		return hourlyRate;
	} // end hourly rate method
	
	public static double consultingTime() { //method asks user for length of consulting time in minutes
		double consultingTime = 0.0;
		System.out.println("Enter the consulting time in minutes: ");
		consultingTime = console.nextDouble();
		return consultingTime;
	} // end consulting time method
	
	public static double billingInfo(double income, double rate, double consultTime) { //method calculates billing info based on income, hourly rate, and consulting time
		double billingInfo = 0.0;
		double adjustedConsultTime = 0.0;
		
		if (income <= lowIncomeCutoff && consultTime <= lowIncomeFreeMinutes) {
			billingInfo = 0.0;
		} else if (income <= lowIncomeCutoff && consultTime > lowIncomeFreeMinutes) {
			adjustedConsultTime = consultTime - lowIncomeFreeMinutes;
			billingInfo = rate * lowIncomePercentRate * (adjustedConsultTime / 60);
		} else if (income > lowIncomeCutoff && consultTime <= highIncomeFreeMinutes) {
			billingInfo = 0.0;
		} else if (income > lowIncomeCutoff && consultTime > highIncomeFreeMinutes) {
			adjustedConsultTime = consultTime - highIncomeFreeMinutes;
			billingInfo = rate * highIncomePercentRate * (adjustedConsultTime / 60);
		}
		return billingInfo;
	} // end billing method
	
	public static void output(double income, double rate, double consultTime, double billing) { //method prints billing info - total cost
		System.out.printf("The billing amount is: $%.2f Based on: $%.2f of income, %.2f minutes of help and"
				+ "\nreduced rate of $%.2f per hour.", billing, income, consultTime, rate);
		System.out.println();
		System.out.println();
	} // end output method
	
	
} // end ProjectSeven Class
