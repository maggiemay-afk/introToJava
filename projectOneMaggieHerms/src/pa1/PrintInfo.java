/**************************************************************************************************
 * Title: APC 300 - Programming One - Project 1
 * Author: Maggie Herms
 * Email: mkherms@uwm.edu
 * Created: 9/18/2021
 * Modified: 9/18/2021
 * Description: Practice creating and using variables in Java by describing the state of Wisconsin
***************************************************************************************************/
package pa1;

public class PrintInfo {

	public static void main(String[] args) {
		
		String state = "Wisconsin"; //name of state
		String country = "United States"; //name of country
		int population = 5813568; //population of state
		int currentPopulationYear = 2018; // most recent year population number was taken
		double populationIncrease = 2.23; //percent of population increase since 2010
		int oldPopulationYear = 2010; //last year population number was taken
		
		String stateCapital = "Madison"; //the capital of Wisconsin
		String largestCity = "Milwaukee"; //largest city in Wisconsin
		int numberOfCounties = 72; //number of counties in Wisconsin
		
		int yearOfHighestTemp = 1936; //year with the highest recorded temperature in WI
		int highestRecordedTemp = 114; //highest recorded temperature in WI
		String cityOfLowestTemp = "Couderay"; //city in WI that had lowest temperature
		String lowestRecordedTemp = "-55"; //lowest recorded temperature in WI
		int yearOfLowestTemp = 1996; //year with the lowest recorded temperature in WI
		
		int lowestRangeIncomeTax = 4; //lowest range on personal income tax in WI
		double highestRangeIncomeTax = 7.65; //highest range on personal income tax in WI
		double salesTax = 5.0; //state sales tax in WI
		
		
		System.out.println(state + " is a U.S. state located in the north-central " + country + 
				". The state is known as “America’s Dairyland” because it is one of the nation’s leading dairy producers. "
				+ "The United States Census Bureau estimates that the population of Wisconsin was " + population + 
				" on July 1, " + currentPopulationYear + ", a " + populationIncrease + "% " + 
				"increase since the " + oldPopulationYear + " United States Census.");
		System.out.println();
		
		
		System.out.println("The state capital is " + stateCapital + ", and its largest city is " +
				largestCity + ", which is located on the western shore of Lake Michigan. " +
				"The state is divided into " + numberOfCounties + " counties.");
		System.out.println();
		
		
		System.out.println(state + " experiences temperature extremes characteristic of its continental "
				+ "climate, with cold winters and hot summers. The highest temperature ever recorded in "
				+ "the state was in the Wisconsin Dells, on July 13, " + yearOfHighestTemp + 
				", where it reached " + highestRecordedTemp + " °F. The lowest temperature ever recorded "
				+ "in Wisconsin was in the village of " + cityOfLowestTemp + ", where it reached " + 
				lowestRecordedTemp + " °F on both February 2 and 4, " + yearOfLowestTemp + ".");
		System.out.println();
		
		
		System.out.println(state + " collects personal income taxes (based on five income brackets) "
				+ "which range from " + lowestRangeIncomeTax + "% to " + highestRangeIncomeTax + 
				"%. The state sales and use tax rate is " + salesTax + "%.");

	} // end of main method

} // end of class
