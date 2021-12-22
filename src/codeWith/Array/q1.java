package codeWith.Array;
//create an array of 5 floats and calculate their sum
public class q1 {
    public static void main(String[] args) {
        float []  marks = {100.3f, 78.9f, 78.67f, 78.8f, 23.42f};
        float sum = 0;
        for (float element:marks) {
            sum +=element;
        }
        System.out.println(sum);

    }
}
