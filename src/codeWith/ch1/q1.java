package codeWith.ch1;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
//        write a program to add tree number in java
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you 3 input: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int result = n1+n2+n3;
        System.out.println("The sum of 3 number is"+result);

    }
}
