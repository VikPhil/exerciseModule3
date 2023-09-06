/*
 * Замените в строке все вхождения 'word' на 'letter'.
 * */
package by.practice.string_array02.main;

import java.util.Scanner;

public class WordReplacement {

	public static void main(String[] args) {
		String str = new String();

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите строку c 'word': ");
		str = sc.nextLine();

		int index = 0;

		char[] tempChar = str.toCharArray();
		char[] arrChar = new char[str.length() + cWord(str) * 2]; // добавляем два символа для каждого 'word'

		for (int i = 0; i < tempChar.length; i++) {

			arrChar[index] = tempChar[i];

			if (tempChar[i] == 'w' && tempChar[i + 1] == 'o' && tempChar[i + 2] == 'r' && tempChar[i + 3] == 'd') {

				arrChar[index] = 'l';
				arrChar[index + 1] = 'e';
				arrChar[index + 2] = 't';
				arrChar[index + 3] = 't';
				arrChar[index + 4] = 'e';
				arrChar[index + 5] = 'r';

				index += 6;
				i += 3;
			} else
				index++;

		}

		str = String.valueOf(arrChar);
		System.out.println(str);
	}

	/*
	 * Считаем количество слов
	 */
	public static int cWord(String str) {

		int counter = 0;

		char[] letter = str.toCharArray();
		for (int j = 0; j < letter.length; j++) {
			if (letter[j] == 'w' && letter[j + 1] == 'o' && letter[j + 2] == 'r' && letter[j + 3] == 'd')
				counter++;
		}
		return counter;
	}

}