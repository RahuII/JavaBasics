package codeWith.Array;
//write a program to find out whether a given is present in an array or not

public class q2 {
    public static void main(String[] args) {
        int [] marks = {34,56,7,34,5,64};
        int num = 56;
        boolean isin = false;
        for (float element: marks
             ) {
            if (num == element) {
                isin = true;
                System.out.println("the value present in the array: "+isin);
                break;
            }

        }
    }
}
