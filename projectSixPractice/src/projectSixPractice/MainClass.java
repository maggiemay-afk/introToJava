package projectSixPractice;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		int total =0, number;
		
		do {
			System.out.println("Enter a number");
			number = console.nextInt();  
			total += number;
		} while (number != -1);
		System.out.println("The sum is: " + total);

	
		for (int i=12;  i<=25; i++) 
			System.out.println(i); 
	}
}
