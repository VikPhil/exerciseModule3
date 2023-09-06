/*
 * В строке найти количество цифр.
 * */
package by.practice.string_array03.main;

public class NumberOfDigits {

	public static void main(String[] args) {

		int counter = 0;
		String str = "ask  33   6 dJLKdj345LKJfk1   702";
		char[] strChar = str.toCharArray();

		for (char s : strChar) {
			if (Character.isDigit(s))
				counter++;
		}

		System.out.print("Количество цифр в строке: " + counter);
	}

}
