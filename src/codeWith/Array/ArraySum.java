package codeWith.Array;

public class ArraySum {
    public static void main(String[] args) {
        double[] marks = { 34.35, 24.53, 53.3, 52.55 };
        marks[1] = 44.0;
        double sum = 0;
        for (double mark : marks) {
            System.out.println(mark);
            sum += mark;
        }
        System.out.println("Sum of all number is: "+ sum);

    }
}
