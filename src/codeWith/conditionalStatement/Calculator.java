package codeWith.conditionalStatement;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter your second number: ");
        int b = sc.nextInt();

        System.out.println("Enter your operation: ");
        sc.nextLine();
        char c = sc.nextLine().charAt(0);
        int result = 0;
        switch (c) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                break;
        }
        System.out.println("your result is " + result);
        sc.close();
	}

}
