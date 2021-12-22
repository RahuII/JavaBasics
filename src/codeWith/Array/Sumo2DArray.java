package codeWith.Array;
import java.util.Scanner;

public class Sumo2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your rows value");
        int rows = sc.nextInt();
        System.out.println("Enter your cols value");
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];
        int[][] b = new int[rows][cols];
        System.out.println("In put the value of first matrix ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("########## VALUE FOR SECOND MATRIX #############");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                b[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        int[][] c = new int[rows][cols];
        System.out.println("the result is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
