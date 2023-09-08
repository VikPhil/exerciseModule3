/*
 * Из заданной строки получить новую, повторив каждый символ дважды.
 * */
package by.practice.string_as_an_object06.main;

public class DoubleCharacter {

	public static void main(String[] args) {

		String str = "These lessons are very interesting for me";
		String newStr = new String();

		for (int i = 0; i < str.length(); i++) {
			newStr = newStr + str.charAt(i) + str.charAt(i);
		}

		System.out.println(str);
		System.out.println(newStr);

	}

}
