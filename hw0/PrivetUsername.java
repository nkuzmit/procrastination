package hw0;

import java.util.Scanner;

public class PrivetUsername {
	
	public static void main(String[] args) {
	//сегодня не пушится
		System.out.print("Как тебя зовут?\n");
		Scanner greeting = new Scanner(System.in, "cp866"); 
		System.setProperty("console.encoding","cp866");//Должно выводить выводить понятный текст на русском, вроде...
		String userName = greeting.next();
		System.out.print("Привет, " + userName + "!");
		greeting.close();
	}
}