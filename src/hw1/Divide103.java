package hw1;

import java.util.Scanner;

public class Divide103 {
public static void main(String[] args){
		
		System.setProperty("console.encoding","cp866");	//�� ������ ������ ����� ���������
		System.out.print("����� x\n");					//����� ������ ������ �� ������������ �����
		Scanner first = new Scanner(System.in); 
		float x = first.nextInt();						/*���������� ����� ���� float,	
														 *����� ��������� �������� ������� ������*/
		System.out.print("����� y\n");					//����� ������ ������ �����
		Scanner second = new Scanner(System.in); 
		float y = second.nextInt();
		
		float div = (x / y);
		
		System.out.println("x ������ �� y = " + div);
		
		first.close();
		second.close();
	}
}