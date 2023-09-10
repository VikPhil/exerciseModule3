/*
 * Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. 
 * Случай, когда самых длинных слов может быть несколько, не обрабатывать.
 * */
package by.practice.string_as_an_object08.main;

import java.util.Scanner;

public class LongWord {

	public static void main(String[] args) {
		String longWord = new String();
		String str = new String();

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите слова: ");
		str = sc.nextLine();

		String[] newStr = deleteSpace(str).split(" "); //создаем массив из слов
		int max = 0;
		int counter = 0;

		for (int i = 0; i < newStr.length; i++) {
			if (newStr[i].length() > max)
				max = newStr[i].length();
		}

		for (int j = 0; j < newStr.length; j++) {
			if (newStr[j].length() == max) {
				longWord = newStr[j];
				counter++;
				if (counter > 1) {
					System.out.print("Найдено больше одного слова, попробуйте еще раз.");
					break;
				}
			}
		}

		if (counter == 1)
			System.out.print("Самое длинное слово из списка: " + longWord);
	}

	/*
	 * Функция убирает лишние пробелы
	 */
	public static String deleteSpace(String s) {
		StringBuilder sb = new StringBuilder(s.trim());

		for (int i = 0; i < sb.length() - 1; i++) {
			if (sb.charAt(i) == ' ' && sb.charAt(i + 1) == ' ') {
				sb.deleteCharAt(i);
				i--;
			}
		}
		return sb.toString();
	}

}
