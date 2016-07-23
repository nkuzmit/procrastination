package hw1;

import java.util.Scanner;

public class Compare102 {
	
	public static void main(String[] args){
		
		System.setProperty("console.encoding","cp866");	//На всякий случай задаю кодировку
		System.out.print("Введи x\n");					//Прошу ввести первое из сравниваемых чисел
		Scanner first = new Scanner(System.in); 
		int x = first.nextInt();
		
		System.out.print("Введи y\n");					//Прошу ввести второе число
		Scanner second = new Scanner(System.in); 
		int y = second.nextInt();
		
		if(x < y) System.out.println("x меньше y");		//Сам процесс сравнения и вывод результата
		
		if(x == y) System.out.println("x равен y");
		
		if(x > y) System.out.println("x больше y");
		first.close();
		second.close();
	}
}