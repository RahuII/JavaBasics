package codeWith.Array;
import java.util.Scanner;

public class Array2DLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your rows value");
        int rows = sc.nextInt();
        System.out.println("Enter your cols value");
        int cols = sc.nextInt();
        int[][] a = new int [rows][cols];
        System.out.println("Enter data in your array");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Result:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(a[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
        sc.close();

    }
}
