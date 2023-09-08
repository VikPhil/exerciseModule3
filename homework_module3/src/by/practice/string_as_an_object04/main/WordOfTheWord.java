/*
 *С помощью функции копирования и операции конкатенации составить из частей слова “информатика” 
 *слово “торт”. 
 * */
package by.practice.string_as_an_object04.main;

public class WordOfTheWord {

	public static void main(String[] args) {

		String str = "информатика";
		String newStr = str.charAt(7) + str.substring(3, 5) + str.charAt(7);

		System.out.println(str);
		System.out.println(newStr);

	}

}
