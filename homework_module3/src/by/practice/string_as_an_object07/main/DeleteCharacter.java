/*
 * Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, 
 * если было введено "abc cde def", то должно быть выведено "abcdef".
 * */
package by.practice.string_as_an_object07.main;

import java.util.Scanner;

public class DeleteCharacter {

	public static void main(String[] args) {
		String str = new String();

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите строку: ");
		str = sc.nextLine();

		StringBuilder sb = new StringBuilder(str);

		/*
		 * Цикл удаляет пробелы в строке
		 */
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == ' ') {
				sb.deleteCharAt(i);
				i--;
			}
		}

		/*
		 * Удаляет повторяющиеся символы
		 */
		for (int j = 0; j < sb.length(); j++) {

			for (int k = sb.length() - 1; k > j; k--) {
				if (sb.charAt(j) == sb.charAt(k))
					sb.deleteCharAt(k);
			}
		}

		System.out.println("Обработанная строка: " + sb);

	}

}
