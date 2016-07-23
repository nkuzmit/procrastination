package hw1;

public class Kvadrat {

	public static void main(String[] args){
		
		for (int i = 1; i <= 10; i++) {
			int square = (int) Math.pow(i, 2);
			System.out.println(i + " в квадрате = " + square);
			}
	}
}