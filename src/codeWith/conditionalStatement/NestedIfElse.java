package codeWith.conditionalStatement;

public class NestedIfElse {

	public static void main(String[] args) {
		int a = 38, b = 39, c = 35;
        int result = 0;
        if (a > b) {
            if (a > c) {
                result = a;
            } else {
                result = c;
            }
        }else {
            if (b > c) {
                result = b;
            } else {
                result = c;
            }
        }
        System.out.println("The largest no is: "+ result);

	}

}
