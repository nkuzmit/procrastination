package hw0;

import java.util.Scanner;

public class PrivetUsername {
	
	public static void main(String[] args) {
	
		System.out.print("��� ���� �����?\n");
		Scanner greeting = new Scanner(System.in, "cp866"); 
		System.setProperty("console.encoding","cp866");//������ �������� �� �������, �����
		String userName = greeting.next();
		System.out.print("������, " + userName + "!");
		greeting.close();
	}
}