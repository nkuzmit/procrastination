package hw1;

import java.util.Scanner;

public class Factorial {

public static void main(String[] args){
		
		System.setProperty("console.encoding","cp866");	//На всякий случай задаю кодировку
		System.out.print("Задайте n:\n");	//Принимаем n
		Scanner num = new Scanner(System.in); 
		int n = num.nextInt();
		
		int fac = 1;
		for(int i = 1; i <= n; i ++)
		{
			fac *= i; 
		}
		System.out.print(fac);
		
		num.close();
}
}