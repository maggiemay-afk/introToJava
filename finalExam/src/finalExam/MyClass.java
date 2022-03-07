package finalExam;
import java.util.*;

public class MyClass {
	
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		char mI = 'k';
		String lastName = "herms";
		String middleIni = "9";
		
		MyClass.outputStatement(lastName, middleIni);
		System.out.println("Please enter a score: ");
		String userScore = console.next();
	
	
	
		for (int number = 100; number > 0; number--) {
			System.out.println(number);
		} 
	
		int number = 100;
	
		do {
			System.out.println(number);
			number --;
		} while (number > 0);
	
	
		int numberTwo = 100;
		while (numberTwo > 0) {
			System.out.println(numberTwo);
			numberTwo --;
		}
	
	
		String inputString = "UWF";
		int count = 0;
	
		for (int i = 0; i < inputString.length(); i++ ) {
			char currentLetter = inputString.charAt(i);
		
		
			if (currentLetter == 'A') {
				count++;
			} 
		
		} 
		System.out.println(count);
	}
	
	public static void outputStatement(String lastName, String middleInitial) {
	System.out.println("User last name is: " + lastName + "User middle Initial is: " + middleInitial);
		 
	} 
}


