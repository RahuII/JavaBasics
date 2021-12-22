package oops.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        //Definition: An exception is an event which occurs during the execution of
        // a program, that disrupts the normal flow of the program's instructions
        try {
            int a = 100/0;


        }catch (ArithmeticException a){
            System.out.println(a);

        }
        System.out.println("\n*******************Exception is bypass************** ");
    }
}
