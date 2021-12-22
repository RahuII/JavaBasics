package oops.methods;

import oops.constructor.passByValue;

import java.util.Scanner;

public class calculator {
    static int add(int x, int y){
        return x+y;
    }
    static int sub(int x, int y){
        return x-y;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your value a and b");
        int a = in.nextInt();
        int b = in.nextInt();
        int num = in.nextInt();

        System.out.println("subtraction of a and b are "+ sub(a,b));
        passByValue.swap(2,4);
    }
}
