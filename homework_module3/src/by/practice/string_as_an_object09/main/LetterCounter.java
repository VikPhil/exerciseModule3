/*
 * Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать 
 * только английские буквы.
 * */
package by.practice.string_as_an_object09.main;

import java.util.Scanner;

public class LetterCounter {

	public static void main(String[] args) {

		int big = 0;
		int small = 0;

		String str = new String();

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите строку: ");
		str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
				big++;
			
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
				small++;
		}

		System.out.println("В строке " + big + " больших букв");
		System.out.println("В строке " + small + " маленьких букв");
	}
}
