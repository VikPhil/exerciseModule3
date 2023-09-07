/*
 * Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 * */
package by.practice.string_as_an_object01.main;

public class MoreSpaces {

	public static void main(String[] args) {

		String str = "  We      continue this     very intensive course.       ";

		int max = 0;
		int counter = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				while (i != str.length() && str.charAt(i) == ' ') {
					counter++;
					i++;
				}
			}

			if (max < counter)
				max = counter;

			counter = 0;
		}

		System.out.print("Наибольшое количество подряд идущих пробелов равно: " + max);
	}
}
