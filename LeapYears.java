package apCompSci;
import java.util.Scanner;

public class LeapYears {
	public static boolean isLeapYear(int year) {
		if(year <= 1582) {
			return false;
		}
		else {
			if(year % 4 == 0 && year % 100 != 0) {
				return true;
			}
			else if(year % 400 == 0) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = in.nextInt();
		System.out.println(isLeapYear(year));
	}

}
