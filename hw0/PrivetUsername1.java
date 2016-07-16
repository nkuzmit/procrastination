package hw0;

import java.util.Scanner;

public class PrivetUsername1 {
	
	public static void main(String[] args) { //Еще один вариант программы с незначительно другим подходом к кодировкам
	
		System.out.print("Как тебя зовут?\n");
		String encoding = System.getProperty("console.encoding", "Windows-1251");
		Scanner greeting = new Scanner(System.in, encoding); 
		String userName = greeting.next();
		System.out.print("Привет, " + userName + "!");
		greeting.close();
	}
}