/*
 * Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить
 * на одиночные пробелы. Крайние пробелы в строке удалить.
 * */
package by.practice.string_array05.main;

public class DeletingASpace {

	public static void main(String[] args) {
		String sentence = "   This      world  is very  beautiful.  ";

		int index = 0;
		boolean b = false;

		System.out.println("Строка до: " + sentence);

		char[] strChar = sentence.trim().toCharArray(); // удаляем пробелы в начале и в конце строки
		char[] itIsNewArr = new char[numberOfLetters(strChar) + numberOfSpaces(strChar)];

		for (int i = 0; i < strChar.length; i++) {
			if (strChar[i] == ' ') {
				b = true;
				continue;
			}

			if (b) {
				itIsNewArr[index] = ' ';
				index++;
			}

			b = false;

			itIsNewArr[index] = strChar[i];
			index++;
		}

		sentence = String.valueOf(itIsNewArr);

		System.out.println("Строка после: " + sentence);
	}

	public static int numberOfLetters(char[] arr) {
		int letter = 0;

		for (char s : arr) {
			if (s != ' ')
				letter++;
		}

		return letter;
	}

	public static int numberOfSpaces(char[] arr) {
		int space = 0;
		boolean isSpace = false;

		for (char s : arr) {
			if (s == ' ') {
				isSpace = true;
				continue;
			}
			if (isSpace)
				space++;

			isSpace = false;
		}

		return space;
	}
}