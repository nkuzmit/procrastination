package hw1;

import java.util.Scanner;

public class Sum {
public static void main(String[] args){
		
		System.setProperty("console.encoding","cp866");	//�� ������ ������ ����� ���������
		System.out.print("������� n:\n");	//��������� n
		Scanner num = new Scanner(System.in); 
		int n = num.nextInt();
		
		int f = 0;
		
		for(int i = 0; i <= n; i++){
			f = i + f;
			
		}
		System.out.println(f);
		
		num.close();	
}

}