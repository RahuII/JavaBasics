package codeWith.Array;

public class bubblesINArray {
    public static void main(String[] args) {
        int[] a = { 9, 3, 55, 4, 7, 8, 9 };
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if (a[j + 1] < a[j]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int i : a) {
            System.out.print(i + "  ");
        }
    }
}
