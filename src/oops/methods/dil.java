package oops.methods;

public class dil {
    static void tryToDil(){
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; ++i) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                System.out.print("*");

            }
            n= n-2;
            System.out.println();
        }

    }

    public static void main(String[] args) {
        tryToDil();
    }
}
