package hw1;

import java.util.Scanner;

public class Rur106 {

public static void main(String[] args){
		
		System.setProperty("console.encoding","cp866");	//�� ������ ������ ����� ���������
		System.out.print("����� ���������� ������� �� 1 �� 999\n");					
		Scanner first = new Scanner(System.in); 
		String x = first.next();						//X ����� �������, ����� ������� ��������� �������
				
		/*����� ������ ���� 
		 *��������� ����� ������� 
		 *����� ���������� ��� 
		 *���������� ��������� �����
		 */
		boolean is1Ending = x.endsWith("1");			
		boolean is2Ending = x.endsWith("2");
		boolean is3Ending = x.endsWith("3");
		boolean is4Ending = x.endsWith("4");
		boolean is11Ending = x.endsWith("11");
		boolean is12Ending = x.endsWith("12");
		boolean is13Ending = x.endsWith("13");
		boolean is14Ending = x.endsWith("14");
		
		/*�������� ��� ���������
		 * ��������� � �������
		 * ��������� ���������
		 * if-else
		 */
		if (is11Ending == true){
			System.out.println(x + " ������");
		}
		else if (is12Ending == true){
			System.out.println(x + " ������");
		}
		else if (is13Ending == true){
			System.out.println(x + " ������");
		}
		else if (is14Ending == true){
			System.out.println(x + " ������");
		}
		else if (is1Ending == true){
			System.out.println(x + " �����");
		}
		else if (is2Ending == true){
			System.out.println(x + " �����");
		}
		else if (is3Ending == true){
			System.out.println(x + " �����");
		}
		else if (is4Ending == true){
			System.out.println(x + " �����");
		} 
		else {
			System.out.println(x + " ������");
		first.close();
		}
}
}