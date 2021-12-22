package codeWith.conditionalStatement;
import java.util.*;
public class SwitchCase {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your day number 1 to 7:");
		int day = sc.nextInt();
		switch (day) {
		case 1: {
			System.out.println("Sunday");
			break;
		}
		case 2: {
			System.out.println("Monday");
			break;
		}
		case 3: {
			System.out.println("Tuesday");
			break;
		}
		case 4: {
			System.out.println("Wednesday");
			break;
		}
		case 5: {
			System.out.println("Thoursday");
			break;
		}
		case 6: {
			System.out.println("Friday");
			break;
		}
		case 7: {
			System.out.println("Saturday");
			break;
		}
		default:
			System.out.println("You chose wrong day"+day);
		}
		sc.close();
	}
}
