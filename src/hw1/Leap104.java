package hw1;

import java.util.Scanner;

public class Leap104 {
public static void main(String[] args){
		
		System.setProperty("console.encoding","cp866");	//�� ������ ������ ����� ���������
		System.out.print("����� ���\n");				//����� ������ ���, ��������������� ������������� ���������
		Scanner first = new Scanner(System.in); 
		int year = first.nextInt();
		
		if (year % 4 != 0){								//�������� �������� �� 4, �������� ����� �������� �� ����������
			System.out.println("���� ��� �� ����������!");
		}
		else {
			if(year % 100 == 0 && year % 400 ==0){						//���� ����� ����, �������� �������� �� 100 � 400
				System.out.println("���� ��� ����������!");
			}
		}
		first.close();
	}
}