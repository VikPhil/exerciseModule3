/*
 * Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным
 * или вопросительным знаком. Определить количество предложений в строке X.
 * */
package by.practice.string_as_an_object10.main;

public class SentenceCounter {

	public static void main(String[] args) {
		String str = "Hello! What's your name? I want to meet you.";
		int counter = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '.' || str.charAt(i) == '!' || str.charAt(i) == '?')
				counter++;
		}

		System.out.println(str);
		System.out.println("Количество предложений в этом тексте равно: " + counter);

	}

}
