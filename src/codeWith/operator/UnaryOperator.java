package codeWith.operator;

public class UnaryOperator {

	public static void main(String[] args) {
		int a = 8;
		int afterPlus = a++;  //After increment.
        int beforePlus = ++a; //Before increment.
        int u = a;
        System.out.println(afterPlus + " " + beforePlus);
        System.out.println(u);

	}

}
