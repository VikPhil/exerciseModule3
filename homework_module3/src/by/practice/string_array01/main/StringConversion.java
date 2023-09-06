/*
 * Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 * */
package by.practice.string_array01.main;

public class StringConversion {

	public static void main(String[] args) {

		StringConversion sc = new StringConversion();

		String[] words = { "MrBin", "NewYork", "CamelCase", "DeepPurple", "MyFavoriteWorld" };

		int index;
		boolean t;

		lineOutput(words);

		for (int i = 0; i < words.length; i++) {

			char[] temp = words[i].toCharArray();

			index = 0;

			/*
			 * размер рабочего массива с запасом для вставки нужного количества
			 * подчеркивания между строчками
			 */
			char[] arrWord = new char[temp.length + sc.underscoreCounter(words[i])];

			for (int j = 0; j < temp.length; j++) {
				t = false;
				if (temp[j] >= 'A' && temp[j] <= 'Z' && j != 0)
					t = true;

				if (temp[j] >= 'A' && temp[j] <= 'Z') {
					temp[j] += 32;
				}

				if (t) {

					arrWord[index] = '_';
					index++;
				}
				arrWord[index] = temp[j];
				index++;
			}

			words[i] = String.valueOf(arrWord);
		}

		System.out.println();
		lineOutput(words);

	}

	/*
	 * Считает на сколько увеличить массив символов, чтобы вставить нужное
	 * количество нижнего подчеркивания
	 */
	private int underscoreCounter(String str) {
		int count = 0;
		char[] a = str.toCharArray();

		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 'A' && a[i] <= 'Z' && i != 0)
				count++;

		}
		return count;
	}

	/*
	 * Вывод массива строк
	 */
	public static void lineOutput(String[] str) {
		for (String s : str)
			System.out.print(s + " ");
	}
}
