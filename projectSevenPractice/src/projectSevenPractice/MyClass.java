package projectSevenPractice;
import java.util.*;

public class MyClass {
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean ourNum = MyClass.isEvenNumber(4);
		System.out.println(ourNum);
		
		System.out.println("Enter stuff");
		String name = console.next();
		int grade1 = console.nextInt();
		
		System.out.println(name);
		System.out.println(grade1);
		
		MyClass.triangleType(5, 5, 3); 
	}

	public static boolean isEvenNumber (int given) {
		if(given % 2 == 0) 
			return true;
		 else 
			return false;
	}
	
	public static void printAvgScore (String name, int grade1, int grade2, int grade3) {
		double average;
		average = (grade1 + grade2 + grade3) / 3.0;
		System.out.println(name + "Average test score: " + average);
	}
	
	public static double getRadius() {
		System.out.println("Enter radius: ");
		double myRadius = console.nextDouble();
		return myRadius;
	}
	
	public static void triangleType (double side1, double side2, double side3) {
	   
	          if (side1 * side1 + side2 * side2 == side3 * side3
	        ||  side1 * side1 + side3 * side3 == side2 * side2
	        ||  side2 * side2 + side3 * side3 == side1 * side1)
	          System.out.println("Right triangle");
	          else
	          System.out.println("Not right triangle"); 
	}
	
}

