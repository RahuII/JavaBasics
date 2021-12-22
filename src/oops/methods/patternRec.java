package oops.methods;

public class patternRec {
    public static void main(String[] args) {
    PatternRec(5);
    }
    static void PatternRec(int n){
        if(n>0){
            PatternRec(n-1);
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
