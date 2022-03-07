package projectFivePracticeMaggieHerms;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		String correctPassword = "12#F45";
		
		System.out.println("Please enter your password");
		String userPassword = console.next();
		
		System.out.println(userPassword);
		
		if(correctPassword.compareTo(userPassword) == 0) {
			System.out.println("correct password, you're in!");
		}	else { 
			System.out.println("wrong password");
		}

	}

}
