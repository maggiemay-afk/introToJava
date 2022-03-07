package projectFourPractice;
import java.util.*;

public class mainClass {

	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);

		final double PI = 3.14;
		final String myCollege = "UW";
		final double taxes = .05;
		final double area = 2 * PI * 4 * 3;
		
		double x = 215.677;
		double y = 35.739;
		double z = 9525.964;
		int num = 83;
		String str = "APC 300 Programming I";
		
		System.out.println(String.format("x=%6.2f", x));
		System.out.println(String.format("%2d", num));
		System.out.println(String.format("Course=%10s", str));
		System.out.println(String.format("y=%.2f num=%2d str=%21s", y,num,str));
		
		String xNumStrFormatted = String.format("z=%2.2f num=%3d str=%12s", z, num, str);
		System.out.println(xNumStrFormatted);
		
		System.out.println(String.format("y=%-10.2f num=%2d str=%12s", y, num, str));
		System.out.println(String.format("x=%7.2f", x));
		System.out.println(String.format("z=%4.2f", z));
		System.out.println(String.format("str=%1s num=%2d x=%7.2f", str, num, x));
		
	}

}
