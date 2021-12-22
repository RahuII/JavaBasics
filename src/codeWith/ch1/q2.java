package codeWith.ch1;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
//        write a program to calculate percentage of 5 subject marks
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks of all subject : ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();
        int percentage = ((m1+m2+m3+m4+m5)*100)/500;
        System.out.println("Your marks percentage is "+percentage);

    }
}
