package codeWith.String;

public class Strings {

	public static void main(java.lang.String[] args) {
		String MyString = "Hello World";
		System.out.println(MyString);

//		this statement is print of length of string.
		int MyStringLength = MyString.length();
		System.out.println(MyStringLength);

//		this line of code is convert the string value in caps latter.
		String MyStringCps = MyString.toUpperCase();
		System.out.println(MyStringCps);

//		this statement is print all letter in lower case
		String MyStringL = MyString.toUpperCase();
		System.out.println(MyStringL);

//		this lines of code replace your string value in other value
		String replaceMyString = MyString.replace("Hello World","Hello Rahul");
		System.out.println(replaceMyString);


	}

}
