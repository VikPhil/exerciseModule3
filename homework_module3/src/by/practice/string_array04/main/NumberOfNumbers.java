/*
 * В строке найти количество чисел.
 * */
package by.practice.string_array04.main;

public class NumberOfNumbers {

	public static void main(String[] args) {

		String str = "12 Triangle, stop music123 32 5Dmitry77";
		int counter = 0;
		boolean isNumber = false;
		char[] strChar = str.toCharArray();

		for (char s : strChar) {

			if (Character.isDigit(s)) {
				isNumber = true;
				continue;
			}
			if (isNumber)
				counter++;

			isNumber = false;
		}

		if (isNumber)
			counter++; // заглушка для последнего числа в строке, если оно в наличии

		System.out.println("В строке: " + str);
		System.out.println(counter + " чисел.");
	}

}
