package hw1;

import java.util.Scanner;

public class Compare102 {
	
	public static void main(String[] args){
		
		System.setProperty("console.encoding","cp866");	//�� ������ ������ ����� ���������
		System.out.print("����� x\n");					//����� ������ ������ �� ������������ �����
		Scanner first = new Scanner(System.in); 
		int x = first.nextInt();
		
		System.out.print("����� y\n");					//����� ������ ������ �����
		Scanner second = new Scanner(System.in); 
		int y = second.nextInt();
		
		if(x < y) System.out.println("x ������ y");		//��� ������� ��������� � ����� ����������
		
		if(x == y) System.out.println("x ����� y");
		
		if(x > y) System.out.println("x ������ y");
		first.close();
		second.close();
	}
}