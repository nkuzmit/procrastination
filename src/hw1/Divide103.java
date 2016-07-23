package hw1;

import java.util.Scanner;

public class Divide103 {
public static void main(String[] args){
		
		System.setProperty("console.encoding","cp866");	//На всякий случай задаю кодировку
		System.out.print("Введи x\n");					//Прошу ввести первое из сравниваемых чисел
		Scanner first = new Scanner(System.in); 
		float x = first.nextInt();						/*Переменные будут типа float,	
														 *чтобы корректно выводить дробные ответы*/
		System.out.print("Введи y\n");					//Прошу ввести второе число
		Scanner second = new Scanner(System.in); 
		float y = second.nextInt();
		
		float div = (x / y);
		
		System.out.println("x делить на y = " + div);
		
		first.close();
		second.close();
	}
}