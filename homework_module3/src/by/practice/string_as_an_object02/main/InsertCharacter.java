/*
 * В строке вставить после каждого символа 'a' символ 'b'.
 * */
package by.practice.string_as_an_object02.main;

public class InsertCharacter {

	public static void main(String[] args) {
		String str = "aa lsggllfo klake  kklsaaekea";

		StringBuilder sb = new StringBuilder(str);
		
		System.out.println("Строка до: " + str);

		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == 'a')
				sb.replace(i, i + 1, "ab");
		}

		str = sb.toString();

		System.out.println("Строка после: " + str);
	}

}
