package hw0;

import java.util.Scanner;

public class PrivetUsername1 {
	
	public static void main(String[] args) { //��� ���� ������� ��������� � ������������� ������ �������� � ����������
	
		System.out.print("��� ���� �����?\n");
		String encoding = System.getProperty("console.encoding", "Windows-1251");
		Scanner greeting = new Scanner(System.in, encoding); 
		String userName = greeting.next();
		System.out.print("������, " + userName + "!");
		greeting.close();
	}
}