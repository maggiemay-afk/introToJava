package projectFourPackage;
import java.util.*; 

public class MainClass {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in); 

		String fullName;
		double propertyValue; 
		
		System.out.println("Please enter your first and last name: ");
		fullName = console.nextLine(); 
		System.out.println("What is your property value?: ");
		propertyValue = console.nextDouble(); 
		
		final double percentTaxCalculatedOn = .92; //Percent of property value that property tax is calculated on
		final double propertyTaxRate = 1.05; //Property tax rate for each $100 dollars of assessed value
		final double assessedRateDollarAmount = 100; //property tax rate is assessed on each $100 dollars of assessed vale
		
		final String taxReportTitleString = "Property Tax Report For:";
		final String assessedValueString = "Assessed Value:";
		final String taxableAmountString = "Taxable Amount:";
		final String taxRateForEachString = "Tax Rate For Each $100.00:";
		final String propertyTaxString = "Property Tax:";
		final String dollarSign = "$";
		
		//Property tax equations
		double taxableAmount = propertyValue * percentTaxCalculatedOn; 
		double assessedDollarAmount = taxableAmount / assessedRateDollarAmount; 
		double taxToPay = assessedDollarAmount * propertyTaxRate; 
		
		System.out.println();
		System.out.printf("%-31s%s", taxReportTitleString, fullName);
		System.out.println("\n");
		System.out.printf("%-31s%-6s%.2f", assessedValueString, dollarSign, propertyValue);
		System.out.println();
		System.out.printf("%-31s%-6s%.2f", taxableAmountString, dollarSign, taxableAmount);
		System.out.println();
		System.out.printf("%-31s%-6s%.2f", taxRateForEachString, dollarSign, propertyTaxRate);
		System.out.println();
		System.out.printf("%-31s%-6s%.2f", propertyTaxString, dollarSign, taxToPay);
	
		console.close(); 
		
	} //end of main method

} //end of main class
