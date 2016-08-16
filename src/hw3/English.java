package hw3;

import java.util.Scanner;

public class English {

	public static void main(String[] args) {

		System.setProperty("console.encoding", "cp866");
		System.out.println("Please, type or paste any text here: ");

		Scanner s = new Scanner(System.in);
		String text = s.nextLine();

		char[] ar2 = text.toCharArray();
		char ar[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
				'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
				'x', 'y', 'z', ' ' };

		for (int i = 0; i < ar2.length; i++) {
			System.out.print("  " + ar2[i]);
		}

		System.out.println();

		for (int i = 0; i < ar2.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				if (ar2[i] == (ar[j])) {
					if (ar2[i] == (ar[26])) {
						System.out.print("   ");
					} else
						System.out.printf("%3d", (j + 1));
				}
			}
		}
		s.close();
	}
}