package codeWith.Array;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        System.out.println("Enter number of student: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int avg = 0;
        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter "+i+"th student marks: ");
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            avg += marks[i];
        }
        avg /=n;
        System.out.println("Average of these all student is "+ avg);
        sc.close();
    }
}
