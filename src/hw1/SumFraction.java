package hw1;

import java.util.Scanner;

public class SumFraction {

public static void main(String[] args){
		
		System.setProperty("console.encoding","cp866");	//На всякий случай задаю кодировку
		System.out.print("Задайте n:\n");	//Принимаем n
		Scanner num = new Scanner(System.in); 
		int n = num.nextInt();
		
		float f = 0;
		
		for(float i = 2; i <= n; i++){
			f = (1 / i)+ f;
			
		}
		System.out.println(1 + f);
		
		num.close();	
}

}