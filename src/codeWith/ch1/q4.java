package codeWith.ch1;
//Write a java program to convert kilometers to miles
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        System.out.println("Enter kilometer value");
        Scanner sc = new Scanner(System.in);
        int klm = sc.nextInt();
        double result = klm * 0.621;
        System.out.println(klm+" Kilometers = "+result+" miles");
    }
}
