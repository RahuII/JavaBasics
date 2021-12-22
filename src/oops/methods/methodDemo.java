package oops.methods;

public class methodDemo {
    public static void main(String[] args) {
//        System.out.println(sumOfNNaturalNumber(5));
        //      0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
        System.out.println(fib(6));
        System.out.println(sumOfNNaturalNumber(9));
        printPatternOf(5);
        printPatternOfDownToUp(5);

    }
    static int sumOfNNaturalNumber(int n){
        if (n==1){
            return 1;
        }
        return n + sumOfNNaturalNumber(n-1);
    }
    static void printPatternOf(int n){
        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void printPatternOfDownToUp(int n ){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void tableOf(int n){
        for (int i = 1; i <=10; i++) {
            System.out.println(n +" * "+ i + " = "+ n*i);
        }
    }
    static int fib(int n){
        if (n == 1 || n==2){
            return n-1;
        }
        else {
            return fib(n-1)+fib(n-2);
        }
    }
}
