package codeWith.ch2;

public class q2 {
    public static void main(String[] args) {
        int factorial = 1 , i = 1;
        while (i<=5){
            factorial  *= i;
            i++;
        }
        System.out.println(factorial);
    }
}
