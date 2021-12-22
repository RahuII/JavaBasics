package codeWith.conditionalStatement;

public class NestedIfElseTernary {

	public static void main(String[] args) {
		int a = 38, b = 39, c = 35;
        int result = 0;
        result = a > b ? a > c ? a : c : b > c ? b : c;
        System.out.println("The largest no is: "+ result);

	}

}
