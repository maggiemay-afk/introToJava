package examTwoPractice;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		int numChecks;
		double totalCost = 10.0;
		
		System.out.println("How many checks did you write");
			numChecks = console.nextInt();	

		if (numChecks < 0) {
			System.out.println("Error. Number of checks cannot be negative");
		} else if (numChecks < 20) {
			totalCost = totalCost + (numChecks * .10);
		} else if (numChecks >= 20 && numChecks <= 39) {
			totalCost = totalCost + (numChecks * .08);
		} else if (numChecks >= 40) {
			totalCost = totalCost + (numChecks * .04);
		} 
		
		System.out.println("Your total cost is: " + totalCost);

		int x = 28;
		int y = 3;
		
		switch (x / 9) {
			case 0:
			case 1: 
		    y++;
			case 2:
		    y = y - 2;
		    break;
			case 3: 
		    y = y + 2;
			case 4: 
		     y++;
			case 5: break; 
			case 6: 
		    y = y + 3;
		}
		System.out.println(y);
		
		boolean found = false;
		int num=1;
		int square=2;
		
		while (!found) 
		  System.out.println("hi");
		  square = num * num;
		  num++;
		  if (square > 10)
		  found = true;
		
	
		String one = "Hi";
		String two = "Hello";
		String three = "Hello";
		
		System.out.println(one.compareTo(two)); //4 Hi to Hello
		System.out.println(two.compareTo(one)); //-4 Hello to Hi
		System.out.println(two.compareTo(three)); //0 Hello to Hello
		
		
		
		for (int number = 100; number > 0; number--) {
			if (number % 2 != 0) {
				System.out.println(number);
			} 
		}
		
		for (char letter = 'Z'; letter >= 'A'; letter--) {
			System.out.println(letter);
		}
		
		char letter = 'Z';
		while (letter >= 'A') {
			System.out.println(letter);
			letter--;
		}
	
		char letter2 = 'Z';
		do {
			System.out.println(letter2);
			letter2 --;
		} while (letter2 >= 'A');
	
	
		String storedPassword = "ACBDE";
		int counter = 0;
	
		while (counter < 3) {
		System.out.println("What is your password");
		String myPassword = console.next();
		
			if (myPassword.equals(storedPassword)) {
				System.out.println("You are in!");
			} else {
				System.out.println("Wrong password");
				counter ++;
				if (counter == 3) {
					System.out.println("You are out of tries. Good Bye");
				}
			} 
		}
		
		System.out.println("ABC".compareTo("ABC"));
		System.out.println("ABC".compareTo("DBC"));  
		System.out.println("cBC".compareTo("aBC"));
		
		
		int m = 3/2;
		switch (m) {
			case 1: System.out.println(1);
			case 2: System.out.println(2);
			case 0: System.out.println(0);
			case 3: System.out.println(3);
			case 4: System.out.println(4);
			default: System.out.println("default"); 
		}
	
		String str1 ="Premium";
		String str2 ="Regular";
		System.out.println("What is service code: ");
		String serviceCode = console.next();
		
		if (serviceCode.toLowerCase().equals(str1.toLowerCase())) {
			System.out.println("You are a premium customer");
		}
		
		//boolean hi = CSIS161 > CSIS 161;  
		//System.out.println(hi);
	
	}

}
