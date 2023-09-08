/*
 * Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 * */
package by.practice.string_as_an_object05.main;

public class NumberLetterA {

	public static void main(String[] args) {

		String str = "A lkdla   llddfeaa  a fsdfasd  aaAAAAfjaslf m";
		int counter = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'A')
				counter++;
		}

		System.out.println("Буква 'А' в строке встречается: " + counter + " раз");

	}

}
