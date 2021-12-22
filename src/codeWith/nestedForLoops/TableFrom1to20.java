package codeWith.nestedForLoops;

public class TableFrom1to20 {

	public static void main(String[] args) {

		for (int i = 1; i <= 20; i++) {

			for (int j = 1; j <= 10; j++) {

				System.out.print(i * j + "\t");
			}
			System.out.println();
		}

	}

}
