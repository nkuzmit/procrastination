package hw3;

import java.util.Scanner;

public class Repetition {
	public static void main(String[] args) {

		System.setProperty("console.encoding", "cp866");
		System.out.println("Please, type or paste any text here: ");

		Scanner s = new Scanner(System.in);
		String text = s.nextLine();

		int count = 0;
		char ar[] = text.toCharArray();
		for (int i = 0; i < text.length(); i++) {
			for (int j = 0; j < text.length(); j++) {
				if (ar[i] == ar[j] && i != j) {
					count++;
				}
			}
		}
		if (count > 1) {
			System.out.println("Repetition detected!");
		} else {
			System.out.println("No repetition here...");
		}
		s.close();
	}
}