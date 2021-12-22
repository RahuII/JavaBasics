package codeWith.conditionalStatement;
import java.util.Scanner;

public class ElseIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int a = sc.nextInt();
        if (a <= 10) {
            System.out.println("Number is less than or equal to 10:");
        } else if (a > 10 && a <= 20) {
            System.out.println("Number is greater than 10 or less than or equal to 20 ");
        } else {
            System.out.println("Number is greater than 20");
        }
        sc.close();

	}

}
