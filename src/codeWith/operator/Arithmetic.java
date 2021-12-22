package codeWith.operator;

public class Arithmetic {

	public static void main(String[] args) {
		int a = 23, b = 34;
		int c = a + b * a / a * 8 - b; // This line will be follow BODMAS rules.
		System.out.println(c);

	}

}
