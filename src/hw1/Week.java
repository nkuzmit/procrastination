package hw1;

import java.util.Scanner;

public class Week {
	
public static void main(String[] args){
		
		System.setProperty("console.encoding","cp866");	//�� ������ ������ ����� ���������
		System.out.print("����� ���������� ����� ��� ������:\n");	//��������� ����
		Scanner first = new Scanner(System.in); 
		int x = first.nextInt();
		
		String dayName;
		if(x == 1)
			dayName = "�����������";
		else if(x == 2)
			dayName = "�������";
		else if(x == 3)
			dayName = "�����";
		else if(x == 4)
			dayName = "�������";
		else if(x == 5)
			dayName = "�������";
		else if(x == 6)
			dayName = "�������";
		else if(x == 7)
			dayName = "�����������";
		else dayName = "� ����, ���? ���� ������ �� ������?";
		System.out.println(dayName);
		first.close();
}	
}