package codeWith.ch1;

import java.util.Scanner;

//Write a java program to detect whether a number entered by the user is integers or not.
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter you number ");
        System.out.println(sc.hasNextInt());
    }
}
