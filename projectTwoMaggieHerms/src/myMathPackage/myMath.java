/**********************************************************************************************
 * Title: APC 300
 * Author: Maggie Herms
 * Email: mkherms@uwm.edu
 * Created: 9/29/2021
 * Modified: 10/3/2021
 * Description: This program calculates math formulas using java
 **********************************************************************************************/

package myMathPackage;

import java.util.*;

public class myMath {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		double triangleSideOne; // store triangle length for side one
		double triangleSideTwo; // store triangle length for side two
		double triangleSideThree; // store triangle length for side three
		double triangleHeight; // store length of triangle height 
		double triangleBase; // store length of triangle base
		double circleRadius; // store circle radius
		double squareSide; // store length of side for square
		double rectangleLength; // store rectangle length
		double rectangleWidth; // store rectangle width
		
		//triangle begin asking for inputs
		System.out.println("Please enter triangle side one: ");
		triangleSideOne = console.nextDouble();
		System.out.println("Please enter triangle side two: ");
		triangleSideTwo = console.nextDouble();
		System.out.println("Please enter triangle side three: ");
		triangleSideThree = console.nextDouble();
		System.out.println("Please enter triangle height: ");
		triangleHeight = console.nextDouble();
		System.out.println("Please enter triangle base: ");
		triangleBase = console.nextDouble();
		
		double triangleperimeter = triangleSideOne + triangleSideTwo + triangleSideThree; //calculate triangle perimeter
		double triangleArea = (triangleBase /2) * triangleHeight; //calculate triangle area
		
		String triangleAreaF = String.format("%.2f", triangleArea); //format triangle area to 2 decimal places
		String triangleperimeterF = String.format("%.2f", triangleperimeter); //format triangle perimeter to 2 decimal places
		
		System.out.println("The triangle perimeter = " + triangleperimeterF + " with sides: " + triangleSideOne + 
				", " + triangleSideTwo + ", " + triangleSideThree); 
		System.out.println("The triangle area = " + triangleAreaF + " with base: " + triangleBase + 
				" and height: " + triangleHeight);
		
		//circle begin asking for inputs
		System.out.println("Please enter circle radius: ");
		circleRadius = console.nextDouble();
		
		double circleperimeter = 2 * Math.PI * circleRadius; //calculate circle perimeter
		double circleArea = Math.PI * (circleRadius * circleRadius); //calculate circle area
		
		String circleperimeterF = String.format("%.2f", circleperimeter); //format circle perimeter to 2 decimal places
		String circleAreaF = String.format("%.2f", circleArea); //format circle area to 2 decimal places
		
		System.out.println("The circle perimeter = " + circleperimeterF + " with a radius of: " + circleRadius);
		System.out.println("The circle area = " + circleAreaF + " with a radius of: " + circleRadius);
		
		//Square begin asking for inputs
		System.out.println("Please enter side of square: ");
		squareSide = console.nextDouble();
		
		double squareperimeter = 4 * squareSide; //calculate square perimeter
		double squareArea = squareSide * squareSide; //calculate square area
		
		String squareperimeterF = String.format("%.2f", squareperimeter); //format square perimeter to 2 decimal places
		String squareAreaF = String.format("%.2f", squareArea); //format square area to 2 decimal places
		
		System.out.println("The square perimeter = " + squareperimeterF + " with side length: " + squareSide);
		System.out.println("The square area = " + squareAreaF + " with side length: " + squareSide);
		
		//Rectangle begin asking for inputs
		System.out.println("Please enter length of rectangle: ");
		rectangleLength = console.nextDouble();
		System.out.println("Please enter width of rectangle: ");
		rectangleWidth = console.nextDouble();
		
		double rectangleperimeter = 2 * (rectangleLength + rectangleWidth); //calculate rectangle perimeter
		double rectangleArea = rectangleLength * rectangleWidth; //calculate rectangle area
		
		String rectangleperimeterF = String.format("%.2f", rectangleperimeter); //format rectangle perimeter to 2 decimal places
		String rectangleAreaF = String.format("%.2f", rectangleArea); //format rectangle area to 2 decimal places
		
		System.out.println("The rectangle perimeter = " + rectangleperimeterF + " with length: " + rectangleLength +
				" and width: " + rectangleWidth);
		System.out.println("The rectangle area = " + rectangleAreaF + " with length: " + rectangleLength +
				" and width: " + rectangleWidth);	
		
	} //end of main method

} //end of class myMath
