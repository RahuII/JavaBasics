package codeWith.loops;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        boolean result = true;
        System.out.println("Enter your number: ");
        int Num = sc.nextInt();
        for (int i = 2; i*i < Num; i++) {
            if ((Num % i) == 0) {
                result = false;
                break;
            }
        }
        if (Num < 2) result = false;
        System.out.println("Prime is " + result);
        sc.close();
	}

}
