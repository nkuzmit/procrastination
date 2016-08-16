package hw3;

import java.util.Scanner;

public class Symbols {

	public static void main(String[] args) {

		System.setProperty("console.encoding", "cp866");
		System.out.println("Please, type or paste any text here: ");

		Scanner s = new Scanner(System.in);
		String text = s.nextLine();

		String a = text.replaceAll("[^a-zA-zА-Яа-яёЁ\\pL ]", "");
		System.out.println(a);

		s.close();
	}

}