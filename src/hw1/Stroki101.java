package hw1;

public class Stroki101 {   
	public static void main(String[] args) {
		String str1 = "��������������� ����� ����� ������� ����������"; //��������� ������, � ���������� �����
		int length = str1.length();										//��������� ����� �����
		System.out.println("����� ������ = " + length);					//� ������� �� �����				
		int half = length/2;											
				
		String firstHalf = str1.substring(0, length - half);			//��������� ��������� ������ ������ �������� ����� ������
		String secondHalf = str1.substring(half);						//� ������
		System.out.println("������ �������� ������ = " + firstHalf);
		System.out.println("������ �������� ������ = " + secondHalf);
	}

}