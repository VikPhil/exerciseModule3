/*
 * Проверить, является ли заданное слово палиндромом.
 * */
package by.practice.string_as_an_object03.main;

import java.util.Scanner;

public class IsPalindrom {

	public static void main(String[] args) {

		String str = new String();

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите слово для проверки: ");
		str = sc.nextLine();
		
		String trimStr = str.trim();  // Удалим пробелы в начале и в конце строки

		StringBuilder sb = new StringBuilder(trimStr);
		
		if (trimStr.equalsIgnoreCase(sb.reverse().toString()))
			System.out.println("Это слово палиндром");
		else
			System.out.println("Это слово не является палиндромом");

	}

}
