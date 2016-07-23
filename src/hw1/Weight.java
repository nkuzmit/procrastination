package hw1;

import java.util.Scanner;

public class Weight {
public static void main(String[] args){
		
		System.setProperty("console.encoding","cp866");	//На всякий случай задаю кодировку
		System.out.print("Введи свой вес в кг\n");		//Прошу ввести вес пользователя
		Scanner first = new Scanner(System.in); 
		float kg = first.nextInt();						//Некоторые следят за весом до грамма
		
		System.out.print("Введи свой рост в см\n");		//Прошу ввести рост пользователя
		Scanner second = new Scanner(System.in); 
		float cm = second.nextInt();
		
		float ideal = cm - 100;							//Формула оптимального веса
		
		if (ideal > kg){
			System.out.println("Больше ешь, тебе нужно поправиться");
		}
		if (ideal < kg){
			System.out.println("Следи за питанием и займись спортом, тебе нужно похудеть");
		}
		if (ideal == kg) {
			System.out.println("Ты прекрасен!");
		}
		first.close();
		second.close();
		}
}
