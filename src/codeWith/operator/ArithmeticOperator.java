package codeWith.operator;

public class ArithmeticOperator {
	public static void main(String[] args) {
		int a = 34, b = 45;
		int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        double div = (double) a / (double) b;
        double mod = a % b;
        System.out.println(" a + b = "+sum);
        System.out.println(" a - b = "+sub);
        System.out.println(" a * b = "+mul);
        System.out.println(" a / b = "+div);
        System.out.println(" a % b = "+mod);
	}

}
