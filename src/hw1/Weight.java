package hw1;

import java.util.Scanner;

public class Weight {
public static void main(String[] args){
		
		System.setProperty("console.encoding","cp866");	//�� ������ ������ ����� ���������
		System.out.print("����� ���� ��� � ��\n");		//����� ������ ��� ������������
		Scanner first = new Scanner(System.in); 
		float kg = first.nextInt();						//��������� ������ �� ����� �� ������
		
		System.out.print("����� ���� ���� � ��\n");		//����� ������ ���� ������������
		Scanner second = new Scanner(System.in); 
		float cm = second.nextInt();
		
		float ideal = cm - 100;							//������� ������������ ����
		
		if (ideal > kg){
			System.out.println("������ ���, ���� ����� �����������");
		}
		if (ideal < kg){
			System.out.println("����� �� �������� � ������� �������, ���� ����� ��������");
		}
		if (ideal == kg) {
			System.out.println("�� ���������!");
		}
		first.close();
		second.close();
		}
}