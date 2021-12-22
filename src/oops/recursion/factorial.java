package oops.recursion;

public class factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    static  int fact(int N){
        if (N<=1){
            return 1;
        }
        else
            return (N*fact(N-1));
    }
}
