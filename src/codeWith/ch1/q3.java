package codeWith.ch1;
//Write a java program which asks the user to enter his/her name and greet them with "Hello <name>, have a good day" text
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        System.out.println("Enter you name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello "+name+", have a good day.");
    }
}
