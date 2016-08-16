package hw3;

import java.util.Scanner;

public class kletter {

	public static void main(String[] args) {

		//String text = "Roses are red, violets are blue, this code is shitty and this verse doesn't rhyme";
		System.setProperty("console.encoding", "cp866");
		System.out.println("Please, type or paste any text here: ");
		Scanner s = new Scanner(System.in);
		String text = s.nextLine();

		System.out.println("Please, type a letter of your choice: ");
		String letter = s.next();

		System.out.println("Please, type in an index position you wan't to swap: ");
		int ind = s.nextInt();

		String res;
		String[] w = text.split("\\s");
		for (int i = 0; i < w.length; i++) {
			if (ind < w[i].length()) {
				res = "";
				res += w[i].substring(0, ind - 1);
				res += letter;
				res += w[i].substring(ind, w[i].length());
				w[i] = res;
			}
		
			System.out.print(w[i] + " ");
		}
		s.close();
	}
}